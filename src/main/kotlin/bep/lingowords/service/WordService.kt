package bep.lingowords.service

import java.io.File
import java.io.FileNotFoundException
import java.util.*
import java.util.regex.Matcher
import java.util.regex.Pattern
import bep.lingowords.repositories.WordRepository
import bep.lingowords.domain.Word


class WordService() {


    fun readAndCleanFile (file: String):MutableList<String>{
        val words: MutableList<String> = ArrayList()
        val r: Pattern = Pattern.compile("([a-z]{5,7})")

        try {
            val myObj = File(file)
            val myReader = Scanner(myObj)

            while (myReader.hasNextLine()) {
                val data: String = myReader.nextLine()
                val matcher: Matcher = r.matcher(data)

                if ((data.length >= 5) and (data.length <= 7) and (matcher.matches() === true)) {
                    words.add(Word(null, data).word)
                }
            }
            myReader.close()
        } catch (e: FileNotFoundException) {
            println("File not found")
            e.printStackTrace()
        }
//        return wordRepository.getAllWords(words)
        return words
    }

}