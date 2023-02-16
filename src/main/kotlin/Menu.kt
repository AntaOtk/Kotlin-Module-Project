import java.util.Scanner

class Menu {
    val scan: Scanner = Scanner(System.`in`)
    var content = mutableListOf<Archive>()


    fun showArhives (content: List<Archive>) :Int {
        println("Список архивов:")
        println("0. Создать архив")
        var count = 1
        for ( item in content) {
            println("$count. ${item.name}")
            count++
            }
        println("$count. Выход")
        return count
    }

    fun input(maxCount: Int) : Int {
        while (true) {
            try {
                val next = scan.nextLine().toInt()
                if (next in 0..maxCount) return next
                println("Введие число соответсвующее пункту меню")
            } catch (e: java.lang.Exception) {
                println("Введие число соответсвующее пункту меню")
            }
        }
    }

    fun choose() {
        while (true) {
            val maxCount = showArhives(content)
            val choiceNumber = input(maxCount)
            if (choiceNumber == 0) {
                println("Введите название архива")
                content.add(Archive(scan.nextLine()))
            } else if (choiceNumber == maxCount) {
                break
            } else content[choiceNumber-1].chooseNotes()
        }
    }

}