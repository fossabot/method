package ch.thipok.method

class Greeting {
    fun sentence(): String {
        return "Hello, ${Platform().name}!"
    }
}
