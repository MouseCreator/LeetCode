package mouse.labs.problem139;


import java.util.*;


public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        return false;
    }
    static class Automata {
        AutomataNode rootNode;

        public Automata(AutomataNode root) {
            this.rootNode = root;
        }

        public String print() {
            return printNode(rootNode, 0);
        }

        private String printNode(AutomataNode current, int skipChars) {
            StringBuilder builder = new StringBuilder(" ".repeat(skipChars));
            builder.append(current.myChar).append("--->");
            String p = builder.toString();
            skipChars = 0;
            for (AutomataNode node : current.hasOriginTo()) {
                builder.append(printNode(node, skipChars));
                builder.append("\n");
                skipChars = p.length();
            }
            return builder.toString();
        }
    }
    static class AutomataNode {
        char myChar;
        HashMap<Character, AutomataNode> leadsTo;

        public AutomataNode(char c) {
            myChar = c;
            leadsTo = new HashMap<>();
        }

        public AutomataNode getNext(Character ch) {
            return leadsTo.get(ch);
        }

        public Collection<AutomataNode> hasOriginTo() {
            return leadsTo.values();
        }

        public void addPath(Character ch, AutomataNode next) {
            leadsTo.put(ch, next);
        }
    }

    private void ahoCorasick(List<String> patterns) {
        buildAutomata(patterns);
    }

    public Automata buildAutomata(List<String> patterns) {
        AutomataNode root = new AutomataNode(' ');
        for (String pattern : patterns) {
            char[] chars = pattern.toCharArray();
            AutomataNode currentNode = root;
            for (Character ch : chars) {
                AutomataNode next = currentNode.getNext(ch);
                if (next == null) {
                    next = new AutomataNode(ch);
                    currentNode.addPath(ch, next);
                }
                currentNode = next;
            }
        }
        return new Automata(root);
    }

}
