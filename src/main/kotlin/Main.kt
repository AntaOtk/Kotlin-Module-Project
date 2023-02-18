import java.util.*


val scan: Scanner = Scanner(System.`in`)

fun main() {
    scan.use {
        val book = Library()
        choose(book)
    }
}

interface Named{
    val name: String
}



