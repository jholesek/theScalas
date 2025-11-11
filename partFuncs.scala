val doubleOdds: PartialFunction[Int, Int] = {
        case i if i%2 ==1 => i*2
}

println(doubleOdds.isDefinedAt(3))
println(doubleOdds.isDefinedAt(4))

val res = List(1,2,3).collect({ case i if i % 2 == 1 => i*2})

println(res)

//doubleOdds.applyOrElse(4, _ + 1)  <- did not work

println(doubleOdds.applyOrElse(4, {i: Int => i + 1}))

val incrementedEvens: PartialFunction[Int, Int] = {
        case i if i % 2 == 0 => i + 1
}

val res2 = List(1,2,3).collect(doubleOdds.orElse(incrementedEvens))

println(res2)

