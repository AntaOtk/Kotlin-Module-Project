class Menu : Entry() {
    private var archiveList = mutableListOf<Archive>()


    private fun showPreveiw() {
        println("Список архивов:")
        println("0. Создать архив")

    }

    fun chooseArchive() {
        while (true) {
            showPreveiw()
            val maxCount = show(archiveList)
            when (val choiceNumber = inputMenu(maxCount)) {
                0 -> {
                    println("Введите название архива")
                    archiveList.add(Archive(scan.nextLine()))
                }
                maxCount -> break
                else -> chooseNote(archiveList[choiceNumber - 1])
            }
        }
    }
    private fun chooseNote(arh: Archive) {
        while (true) {
            arh.showPreview()
            val maxCount = show(arh.noteList)
            when (val choiceNumber = inputMenu(maxCount)) {
                0 -> {
                    println("Введите название заметки")
                    val name = scan.nextLine()
                    println("Введите содержимое заметки")
                    val value = scan.nextLine()
                    arh.add(Note(name, value))}
                maxCount -> break
                else -> arh.noteList[choiceNumber - 1].showContent()
            }
        }
    }
}