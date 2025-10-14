object pureFunc {
  def sum(xs: List[Int]): Int = xs match {
    case Nil => 0
    case head :: tail => head + sum(tail)
  }

  def main(args: Array[String]):Unit = {
    val l=List(1,2,3,4,5)
    println(sum(l))
  }
}


