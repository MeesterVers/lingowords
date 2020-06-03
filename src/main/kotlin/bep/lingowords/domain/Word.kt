package bep.lingowords.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Word(
        @Id
        @GeneratedValue
        val id: Long? = null,
        val word: String
)