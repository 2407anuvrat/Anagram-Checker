class AnagramChecker {
    fun match(word1: String, word2: String): Boolean {
          var str1 = word1.lowercase()
          var str2 = word2.lowercase()
        val counter = IntArray(26) { 0 }
//        if (word1.length != word2.length) return false
//        (word1.indices).forEach { index ->
//            ++counter[word1[index] - 'a']
//            --counter[word2[index] - 'a']
//        }

        if (str1.length != word2.length) return false
        (word1.indices).forEach { index ->
            ++counter[str1[index] - 'a']
            --counter[str2[index] - 'a']
        }
        return !counter.any { it != 0 }
    }
}
