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

    fun show(node: Node<*>): Int {
        var count = 1
        for (item in node.content) {
            println("$count. ${item.name}")
            count++
        }
        println("$count. Выход")
        return count
    }


    fun choose(item: Node<*>) {
        while (true) {
            item.showPreview()
            val maxCount = show(item)
            when (val choiceNumber = inputMenu(maxCount)) {
                0 -> item.add()
                maxCount -> break
                else -> {
                    val element = item.content[choiceNumber - 1]
                    if (element is Archive) {
                        choose(element)
                    } else if (element is Note) { element.showContent()}
                }
            }
        }
    }