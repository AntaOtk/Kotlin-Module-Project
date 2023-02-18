class Note(override val name: String, private var content: String): Named {

    fun showContent() {
        println("Содержимое заметки:")
        println(this.content)
        println("0. Изменить содержимое заметки")
        println("1. Выход")
        if (inputMenu(1) == 0){
            println("Введите новое содержимое заметки")
            content = scan.nextLine()
        }
    }
}
