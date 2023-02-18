class Archive(name: String) : Node<Note>(name), Named {
    override fun add() {
        println("Введите название заметки")
        val name = scan.nextLine()
        println("Введите содержимое заметки")
        val value = scan.nextLine()
        content.add(Note(name,value))
    }

    override fun showPreview() {
        println("Список заметок:")
        println("0. Создать заметку")
    }

}