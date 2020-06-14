package bep.lingowords.service

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.springframework.boot.test.context.SpringBootTest
import java.io.FileNotFoundException
import java.util.*


@SpringBootTest
@DisplayName("Word service")
class WordServiceTest(
        val wordService: WordService,
        @Transient
        val actualWords: List<String> = listOf("manco", "mandir", "mandala"),
        val testWordsFile: String = "src/main/resources/static/test-words.txt"
) {

    @Test
    @DisplayName("File not Found")
    fun testFileNotFoundException() {
        assertThrows<FileNotFoundException> { wordService.readAndCleanFile("fake-test_file.txt") }
    }

    @Test
    @DisplayName("Clean words")
    fun testFilterWords() {
        val checkedWords: List<String> = wordService.readAndCleanFile(testWordsFile)
        assertEquals(actualWords, checkedWords)
    }
}