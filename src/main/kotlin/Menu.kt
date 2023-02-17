
class Menu : Entry {
    var content = mutableListOf<Archive>()


    fun showContent (content: List<Archive>) :Int {
        println("Список архивов:")
        println("0. Создать архив")
        return show(content)
    }

    override fun choose() {
        while (true) {
            val maxCount = showContent(content)
            val choiceNumber = inputMenu(maxCount)
            if (choiceNumber == 0) {
                println("Введите название архива")
                content.add(Archive(scan.nextLine()))
            } else if (choiceNumber == maxCount) {
                break
            } else content[choiceNumber-1].choose()
        }
    }

}