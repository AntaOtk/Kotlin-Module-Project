class Note(name: String, private val contentNote: String) : Node(name) {
    fun showContent() {
        println(this.contentNote)
        println("Для возврата на предыдущий экран введите любое значение")
        scan.nextLine()
    }
}
