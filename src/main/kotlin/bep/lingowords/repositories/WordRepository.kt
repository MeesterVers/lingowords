package bep.lingowords.repositories

import org.springframework.data.repository.CrudRepository
import bep.lingowords.domain.Word

interface WordRepository: CrudRepository<Word, Long>{
    fun getAllWords(words: MutableList<String>):  MutableList<String>
}