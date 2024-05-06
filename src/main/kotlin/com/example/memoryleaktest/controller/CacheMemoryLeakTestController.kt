package com.example.memoryleaktest.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CacheMemoryLeakTestController(

) {
    companion object {
        private val threadLocal = ThreadLocal<MutableList<Int>>()
    }

    @GetMapping("/leak")
    fun causeLeak(): String {
        val list = mutableListOf<Int>()
        for (i in 0..10000) {
            list.add(i)
        }
        threadLocal.set(list)
        return "Leak caused"
    }
}