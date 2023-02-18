class Library(name: String = "") : Node<Archive>(name) {

    override fun showPreview() {
        println("Список архивов:")
        println("0. Создать архив")
    }
    override fun add() {
        println("Введите название архива")
        content.add(Archive(scan.nextLine()))
    }

}