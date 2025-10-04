import scala.io.StdIn.readLine

object hello {
  def main(args: Array[String]) = {
    println("Your name:")
    val name = readLine()
    println("Hello, "+name+"!")
  }
}

