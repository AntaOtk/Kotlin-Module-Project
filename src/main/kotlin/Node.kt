abstract class Node<T: Named> (val name: String) {
    val content = mutableListOf<T>()

    abstract fun showPreview()

    abstract fun add()
}
