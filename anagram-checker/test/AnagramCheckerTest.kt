import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue

class AnagramCheckerTest : StringSpec() {
    init {
        "is lowercase 'a' an anagram of lowercase 'a'" {
            AnagramChecker().match("a", "a").shouldBeTrue()
        }

        "is an uppercase 'A' an anagram of lowercase 'a'" {
            AnagramChecker().match("A", "a").shouldBeTrue()
        }

        "is an uppercase 'A' an anagram of other uppercase 'A'" {
            AnagramChecker().match("A", "A").shouldBeTrue()
        }

        "is single character 'a' an anagram to a string of 'aa'" {
            AnagramChecker().match("a", "aa").shouldBeFalse()
        }

        "is string 'abc' an anagram to any of its permutation string 'cab'" {
            AnagramChecker().match("abc", "cab").shouldBeTrue()
        }

        "is string 'a' an anagram to a different string with same number of characters 'b'" {
            AnagramChecker().match("a", "b").shouldBeFalse()
        }

    }
}
