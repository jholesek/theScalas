class Animal {
        private def breathe()=println("I'm breathing")
        def walk() = {
                breathe()
                println("I'm walking.")
        }
        protected def speak()=println("Hello?")

}

class Cat extends Animal {
        //this will not compile
        override def speak() =  println("Meow")
}

val cat = new Cat
cat.walk()
cat.speak()
// this won't compile, it's private
// cat.breathe()

