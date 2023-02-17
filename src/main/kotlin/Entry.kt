interface Entry {

    fun inputMenu(maxCount: Int) : Int {
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

    fun choose()

    fun  show (content: List<Node>) :Int {
        var count = 1
        for ( item in content) {
            println("$count. ${item.name}")
            count++
        }
        println("$count. Выход")
        return count
    }
}