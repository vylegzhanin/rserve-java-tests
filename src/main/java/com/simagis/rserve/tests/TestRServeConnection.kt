package com.simagis.rserve.tests

import org.rosuda.REngine.Rserve.RConnection

/**
 * <p>
 * Created by alexei.vylegzhanin@gmail.com on 10/4/2017.
 */
fun main(args: Array<String>) {
    with(RConnection(args[0])) {
        login(args[1], args[2])
        eval("meanVal = mean(c(1,2,3,4))")
        val mean = eval("meanVal").asDouble()
        println("meanVal = " + mean)
    }
}