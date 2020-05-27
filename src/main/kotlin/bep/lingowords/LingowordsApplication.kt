package bep.lingowords

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LingowordsApplication

fun main(args: Array<String>) {
	runApplication<LingowordsApplication>(*args)
}
