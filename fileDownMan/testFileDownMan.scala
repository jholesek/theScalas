import myFile._
import myUser._
import myGroup._

val f = myFile("first File","/home",Set(myGroup("Silver tier")))

println(f)

val u = myUser("Jakob","jh@krneki.com",Set(myGroup("Bronze tier")))

println(u)

val g = myGroup("Bronze tier")

println(g)

val f1 = myFile("second File","/home/second",Set(g))

println(f1)

val fupd = f.copy(groups = f.groups + g)

println(fupd)

val updatedU =
        u
        .addGroup(myGroup("Silver tier"))
        .addGroup(myGroup("Gold tier"))

println(updatedU)

