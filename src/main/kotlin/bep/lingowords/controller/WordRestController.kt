package bep.lingowords.controller

import org.springframework.web.bind.annotation.*
import bep.lingowords.service.WordService


@RestController
@RequestMapping("/api/words")
class WordRestController(
        private val wordService: WordService
) {
    @GetMapping("/")
    fun findAll(): List<String> {
        return wordService.readAndCleanFile("src/main/resources/static/basiswoorden-gekeurd.txt")
    }

}
