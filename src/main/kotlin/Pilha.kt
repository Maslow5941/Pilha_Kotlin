class Pilha<E>(vararg items: E) {              // 1

    private val elementos = items.toMutableList()

    fun push(elemento: E) = elementos.add(elemento)        // 2

    fun peek(): E = elementos.last()                     // 3

    fun pop(): E = elementos.removeAt(elementos.size - 1)

    fun isEmpty() = elementos.isEmpty()

    fun size() = elementos.size

    override fun toString() = "MutableStack(${elementos.joinToString()})"
}

fun <E> stackMutavel(vararg elemento: E) = Pilha(elemento)

fun main() {
    val stack = Pilha(6, 3, 7)
    //stack.push(9)
    println(stack)

   /* println("peek(): ${stack.peek()}")
    println(stack)

    for (i in 1..stack.size()) {
        println("pop(): ${stack.pop()}")
        println(stack)
    }*/
}