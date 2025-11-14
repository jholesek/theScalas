def sayHello(f: () => Unit): Unit = f()

def helloJoe(): Unit = println("Hi Joe!")

sayHello(helloJoe)


def bonjourJulien(): Unit = println("Bonjour, Julien")

sayHello(bonjourJulien)

def executeNTimes(f: () => Unit, n: Int): Unit =
        for (i <- 1 to n) f()


def helloWorld(): Unit = println("Hello, world!")

executeNTimes(helloWorld, 3)

