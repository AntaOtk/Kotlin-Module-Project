class Archive(name: String) : Node(name) {
    var noteList = mutableListOf<Note>()
    fun add(note: Note) {
        noteList.add(note)
    }

    fun showPreview() {
        println("Список заметок:")
        println("0. Создать заметку")
    }

}