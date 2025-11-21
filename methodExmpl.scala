scala> val oneToTen = (1 to 10).toList
val oneToTen: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

scala> val names = ("adam", "brandy", "chris", "david")
val names: (String, String, String, String) = (adam,brandy,chris,david)

scala> val doubles = oneToTen,map(_ * 2)
                             ^
       error: ';' expected but ',' found.

scala> val doubles = oneToTen.map(_ * 2)
val doubles: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)

scala> val capNames = names.map(_.capitalize)
                            ^
       error: value map is not a member of (String, String, String, String)

scala> val Names = List("adam", "brandy", "chris", "david")
val Names: List[String] = List(adam, brandy, chris, david)

scala> val capNames = Names.map(_.capitalize)
val capNames: List[String] = List(Adam, Brandy, Chris, David)

val oneToTen: List[Int]

scala> val isLessThanFive = oneToTen.map(_ < 5)
val isLessThanFive: List[Boolean] = List(true, true, true, true, false, false, false, false, false, false)

scala> val lessThanFive = oneToTen.filter(_ < 5)
val lessThanFive: List[Int] = List(1, 2, 3, 4)

scala> oneToTen.filter(_ < 5).map(_ * 10)
val res0: List[Int] = List(10, 20, 30, 40)
