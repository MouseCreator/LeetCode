package mouse.labs.problem49;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    @Test
    void groupAnagramsLong() {
        GroupAnagrams anagrams = new GroupAnagrams();
        List<List<String>> longRes = anagrams.groupAnagrams(new String[]{
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab"});
        assertEquals(2, longRes.size());
    }
    @Test
    void groupAnagramsMany() {
        GroupAnagrams anagrams = new GroupAnagrams();
        List<List<String>> longRes = anagrams.groupAnagrams(new String[]{"ray","cod","abe","ned","arc","jar","owl","pop","paw","sky","yup","fed","jul","woo","ado","why","ben","mys","den","dem","fat","you","eon","sui","oct","asp","ago","lea","sow","hus","fee","yup","eve","red","flo","ids","tic","pup","hag","ito","zoo"});
        assertEquals(39, longRes.size());
    }

    @Test
    void groupAnagramsSimple() {
        GroupAnagrams anagrams = new GroupAnagrams();
        List<List<String>> longRes = anagrams.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
        assertEquals(3, longRes.size());
    }
}