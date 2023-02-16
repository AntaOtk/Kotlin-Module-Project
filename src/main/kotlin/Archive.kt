import java.util.Scanner

class Archive (val name: String) {
        val scan: Scanner = Scanner(System.`in`)
        var content = mutableListOf<Note>()

        fun add( note: Note) {
                content.add(note)
        }

        fun showNotes(content: List<Note>) :Int {
                println("Список заметок:")
                println("0. Создать заметку")
                var count = 1
                for ( item in content) {
                        println("$count. ${item.name}")
                        count++
                }
                println("$count. Выход")
                return count
        }

        fun input(maxCount: Int) : Int {
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

        fun chooseNotes() {
                while (true) {
                        val maxCount = showNotes(content)
                        val choiceNumber = input(maxCount)
                        if (choiceNumber == 0) {
                                println("Введите название заметки")
                                val name = scan.nextLine()
                                println("Введите содержимое заметки")
                                val value = scan.nextLine()
                                add(Note(name,value))
                        } else if (choiceNumber == maxCount) {
                                break
                        } else {
                                println(content[choiceNumber-1].contentNote)
                                println("Для возврата на предыдущий экран введите любое значение")
                                scan.nextLine()
                        }
                }
        }
}