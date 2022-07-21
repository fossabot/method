package ch.thipok.method

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}