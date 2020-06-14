package bep.lingowords.service

import java.io.File
import java.io.FileNotFoundException
import java.util.*
import java.util.regex.Matcher
import java.util.regex.Pattern
import bep.lingowords.domain.Word
import org.springframework.stereotype.Service

@Service
class WordService() {

    fun readAndCleanFile (file: String):MutableList<String>{
        val words: MutableList<String> = ArrayList()
        val r: Pattern = Pattern.compile("([a-z]{5,7})")

        try {
            val importedFile = File(file)
            val fileReader = Scanner(importedFile)

            while (fileReader.hasNextLine()) {
                val word: String = fileReader.nextLine()
                val matcher: Matcher = r.matcher(word)

                if ((word.length >= 5) and (word.length <= 7) and (matcher.matches() === true)) {
                    words.add(Word(null, word).word)
                }
            }
            fileReader.close()

        } catch (e: FileNotFoundException) {
            println("File not found")
            e.printStackTrace()
        }
        return words
    }

}