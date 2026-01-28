import myFile._
import myUser._
import myGroup._

val f = myFile("first File","/home",Seq(myGroup("Silver tier")))

println(f)

val u = myUser("Jakob","jh@krneki.com")

println(u)

val g = myGroup("Bronze tier")

println(g)

val f1 = myFile("second File","/home/second",Seq(g))

println(f1)

