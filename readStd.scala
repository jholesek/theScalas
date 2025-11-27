//import scala.io.StdIn.{readLine, readf, readChar}
import scala.io.Source

object readStd {
        def main(args: Array[String]) =  {
                for(line <- Source.stdin.getLines())
                        println("Line: "+line)
        }
}

