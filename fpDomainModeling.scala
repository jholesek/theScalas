import CrustSize._

// requires CrustSize.scala to be compiled!

val currentCrustSize = Small

// does NOT work: currentCrustSize match {
(currentCrustSize: CrustSize) match {
  case Small => println("Small crust")
  case Medium => println("Medium crust")
  case Large => println("Large crust")
}

if (currentCrustSize == Small) println("Still small crust.")


