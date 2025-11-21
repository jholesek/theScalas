val a = List(1, 2, 3)

val b = 0 :: a
val c = List(-1, 0) ::: a

println(a, b, c)

val names = List("Jaka", "Natasa", "Monika", "Ursika")

for (name <- names) println(name)

val x = LazyList.range(1, Int.MaxValue)

println(x.take(1))

x.take(5).foreach(println)

// vectors
val strings = Vector("one", "two")

println(strings(1))

println(names(1))

val av = Vector(1, 2, 3)
val bv = av :+ 4
val cv = av ++ Vector(4, 5)

println(av , bv , cv)

val dv = 0 +: av
val ev = Vector(-1, 0) ++: av

println(dv, ev)

