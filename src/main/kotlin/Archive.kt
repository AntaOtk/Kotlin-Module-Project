class Archive(name: String) : Node(name), Entry {
    var content = mutableListOf<Note>()
    fun add(note: Note) {
        content.add(note)
    }

    fun showContent(content: List<Note>): Int {
        println("Список заметок:")
        println("0. Создать заметку")
        return show(content)
    }

    fun choose() {
        while (true) {
            val maxCount = showContent(content)
            val choiceNumber = inputMenu(maxCount)
            if (choiceNumber == 0) {
                println("Введите название заметки")
                val name = scan.nextLine()
                println("Введите содержимое заметки")
                val value = scan.nextLine()
                add(Note(name, value))
            } else if (choiceNumber == maxCount) {
                break
            } else {
                println(content[choiceNumber - 1].contentNote)
                println("Для возврата на предыдущий экран введите любое значение")
                scan.nextLine()
            }
        }
    }
}