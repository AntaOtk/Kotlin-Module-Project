abstract class Entry {

    fun inputMenu(maxCount: Int): Int {
        while (true) {
            try {
                val next = scan.nextLine().toInt()
                if (next in 0..maxCount) return next
                println("Введите число, соответствующее пункту меню")
            } catch (e: java.lang.Exception) {
                println("Введите число")
            }
        }
    }

    fun show(content: List<Node>): Int {
        var count = 1
        for (item in content) {
            println("$count. ${item.name}")
            count++
        }
        println("$count. Выход")
        return count
    }
}