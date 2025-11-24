case class Person(firstName: String, lastName: String)

val reginald = Person("Reginald", "Dwight")

println(reginald)

val elton = reginald.copy(
  firstName = "Elton",
  lastName = "John"
)

println(elton)

