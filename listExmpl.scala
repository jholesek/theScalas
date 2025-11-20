val a = List(1, 2, 3)

val b = 0 :: a
val c = List(-1, 0) ::: a

println(a, b, c)

val names = List("Jaka", "Natasa", "Monika", "Ursika")

for (name <- names) println(name)

val x = LazyList.range(1, Int.MaxValue)

println(x.take(1))

x.take(5).foreach(println)

