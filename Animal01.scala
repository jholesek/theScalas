class Animal {
        private def breathe()=println("I'm breathing")
}

class Cat extends Animal {
        //this will not compile
        override def breathe() =  println("Yo, breathing")
}


