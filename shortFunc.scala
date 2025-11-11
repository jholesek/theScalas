val ints = List(1,2,3)

val doubleints = ints.map(_ * 2) // longform: ints.map(i => i*2 )

println(ints)
println(doubleints)

val toDouble = (i: Int) => i * 2

println(toDouble(2))
println(List(4,5,6).map(toDouble))

