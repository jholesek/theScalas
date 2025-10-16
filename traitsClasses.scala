trait Speaker {
  def speak(): String
}

trait TailWagger {
  def startTail(): Unit = println("Start tail wagg.")
  def stopTail(): Unit = println("Stop tail wagg.")
}

trait Runner {
  def startRun(): Unit = println("Started running.")
  def stopRun(): Unit = println("Stopped running.")
}

class Dog(name: String) extends Speaker with TailWagger with Runner {
  def speak(): String = "Woof!"
}

class Cat(name: String) extends Speaker with TailWagger with Runner {
  def speak(): String = "Meow!"
  override def startRun(): Unit = println("Running? What a joke!")
  override def stopRun(): Unit = println("Who's running?")
}

val d = new Dog("Rover")
println(d.speak())
d.startRun()
d.stopRun()

val c = new Cat("Morris")
println(c.speak())
c.startRun()
c.stopRun()

