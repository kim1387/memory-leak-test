package com.example.memoryleaktest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MemoryleaktestApplication

fun main(args: Array<String>) {
    runApplication<MemoryleaktestApplication>(*args)
}
