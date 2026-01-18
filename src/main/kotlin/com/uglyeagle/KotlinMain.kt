package com.uglyeagle;

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinMain

fun main(args: Array<String>) {
    runApplication<KotlinMain>(*args)
    println("started in KotlinMain")
}
