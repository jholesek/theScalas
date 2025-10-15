def makeInt(s: String): Option[Int] =
  try {
    Some(Integer.parseInt(s.trim))
  } catch {
    case e: Exception => None
  }

val a = makeInt("1")
val b = makeInt("one")

println("a = ",a)
println("b = ",b)

val c = makeInt("1") match {
  case Some(i) => i
  case None => "Fail."
}

val d = makeInt("one") match {
  case Some(i) => i
  case None => "Fail."
}

println("c = ", c)
println("d = ", d)

