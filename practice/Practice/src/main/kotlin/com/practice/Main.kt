package com.practice

import java.util.*

class Main {
    fun p(){
        println("hello")
    }

    fun prange(a: Int, b: Int){
        if (a < b) {
            var x = a + 1
            while (x < b) {
                println(x)
                x = x + 1
            }
        } else if ( a > b) {
                var x = b + 1
                while (x < a) {
                    println(x)
                    x = x + 1
            }
        } else {
            println("0")
        }

    }
}

fun main() {
    val m = Main()
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    val b = input.nextInt()
    m.prange(a, b)
}