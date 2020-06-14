package bep.lingowords.domain

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
@DisplayName("Word domain")
class WordTest {

    @Test
    @DisplayName("getWord")
    fun testGetWord() {
        val word = Word(null, "Test")
        assertEquals("Test", word.word)
    }

}