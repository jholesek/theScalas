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

