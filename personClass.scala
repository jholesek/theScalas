class Person(var firstName: String, var lastName:String) {
  def printFullName() = println(s"$firstName $lastName")
}

val p=new Person("John", "Doe")
println(p.firstName)
p.lastName="Legend"

p.printFullName()

