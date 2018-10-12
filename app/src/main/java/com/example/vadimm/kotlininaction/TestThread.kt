package com.example.vadimm.kotlininaction

import java.lang.Exception

fun main(args: Array<String>) {
    val firstThread = MyThread(threadName = "FirstThread")
    firstThread.start()
    val secondThread = MyThread(threadName = "SecondThread")
    secondThread.start()
    val thirthThread = MyThread(threadName = "ThirthThread")
    thirthThread.start()
//    thirthThread.join()
    println("  thread is run")
}

class MyThread : Thread {

    private var threadName: String? = null

    constructor(threadName: String?) : super() {
        this.threadName = threadName
        println("${this.threadName} is started")
    }

    override fun run() {
        var count = 0
        while (count < 10) {
            println("${this.threadName} Count:$count")
            count++
        }

        try {
            Thread.sleep(1000)
        } catch (ex: Exception) {
            print(ex.message)
        }
    }
}