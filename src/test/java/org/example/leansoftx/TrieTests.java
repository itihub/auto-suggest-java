package org.example.leansoftx;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TrieTests {

    @Test
    void levenshteinDistance_EmptyStrings_ReturnsZero() {
        assertEquals(0, Trie.levenshteinDistance("", ""));
    }

    @Test
    void levenshteinDistance_EmptySource_ReturnsTargetLength() {
        assertEquals(5, Trie.levenshteinDistance("", "hello"));
    }

    @Test
    void levenshteinDistance_EmptyTarget_ReturnsSourceLength() {
        assertEquals(5, Trie.levenshteinDistance("hello", ""));
    }

    @Test
    void levenshteinDistance_SingleCharacterDifference_ReturnsOne() {
        assertEquals(1, Trie.levenshteinDistance("a", "b"));
    }

    @Test
    void levenshteinDistance_SameStrings_ReturnsZero() {
        assertEquals(0, Trie.levenshteinDistance("hello", "hello"));
    }

    @Test
    void levenshteinDistance_OneStringIsPrefixOfAnother_ReturnsDifferenceInLength() {
        assertEquals(3, Trie.levenshteinDistance("abc", "abcdef"));
    }

    @Test
    void levenshteinDistance_DifferentStrings_ReturnsCorrectDistance() {
        assertEquals(3, Trie.levenshteinDistance("kitten", "sitting"));
        assertEquals(2, Trie.levenshteinDistance("flaw", "lawn"));
        assertEquals(2, Trie.levenshteinDistance("gumbo", "gambol"));
    }


    @Test
    void levenshteinDistance_CaseInsensitiveComparison_ReturnsCorrectDistance() {
        assertEquals(1, Trie.levenshteinDistance("Hello", "hello"));
    }

    @Test
    void levenshteinDistance_StringsWithSpaces_ReturnsCorrectDistance() {
        assertEquals(1, Trie.levenshteinDistance("hello world", "hello  world"));
    }

    @Test
    void levenshteinDistance_StringsWithSpecialCharacters_ReturnsCorrectDistance() {
        assertEquals(1, Trie.levenshteinDistance("hello!", "hello?"));
    }

}