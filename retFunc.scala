
def greet(theGreeting: String): String => Unit = 
        (name: String) => println(s"$theGreeting, $name")

val greetFunc = greet("Hi there")

greetFunc("Joe")

def createGreetingFunc(lang: String): String => Unit = {
        val engGreet = (name: String) => println(s"Hello $name")
        val frGreet = (name: String) => println(s"Bonjour $name")

        lang match {
                case "eng" => engGreet
                case "fr" => frGreet
        }
}

val greetFR = createGreetingFunc("fr")
greetFR("Jakob")

val greetENG = createGreetingFunc("eng")
greetENG("Jake")

