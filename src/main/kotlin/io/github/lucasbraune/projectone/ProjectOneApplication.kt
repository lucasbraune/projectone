package io.github.lucasbraune.projectone

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class ProjectOneApplication

@RestController
class MyController {

	@GetMapping("/hello")
	@CrossOrigin
	fun hello() {
		println("Hello!")
	}
}

fun main(args: Array<String>) {
	runApplication<ProjectOneApplication>(*args)
}