package bep.lingowords

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.Banner
import bep.lingowords.service.WordService

@SpringBootApplication
class LingowordsApplication

fun main(args: Array<String>) {
	runApplication<LingowordsApplication>(*args){
		setBannerMode(Banner.Mode.OFF)
	}

//	val words = WordService().readAndCleanFile("src/main/resources/static/basiswoorden-gekeurd.txt");
//	println(words)
}
