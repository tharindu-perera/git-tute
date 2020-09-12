package hello

import org.joda.time.LocalTime

object HelloWorldC {
    @JvmStatic
    fun main(args: Array<String>) {


        val greeter = GreeterC()
        println(greeter.sayHello())
    }
}