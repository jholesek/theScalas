class Stack[A] {
        private var elements: List[A] = Nil

        def push(x: A): Unit =
                elements = elements.prepended(x)
        def peek: A = elements.head
        def pop(): A = {
                val currentTop = peek
                elements = elements.tail
                currentTop
        }
}

val stack = new Stack[Int]
stack.push(1)
stack.push(2)
println(stack)

println(stack.pop())
println(stack.pop())

