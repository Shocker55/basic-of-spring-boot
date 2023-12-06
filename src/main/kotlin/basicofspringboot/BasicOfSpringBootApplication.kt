package basicofspringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BasicOfSpringBootApplication

fun main(args: Array<String>) {
	runApplication<BasicOfSpringBootApplication>(*args)
}
