import CrustSize._

val currentCrustSize = Small

currentCrustSize match {
  case Small => println("Small crust")
//  case Medium => println("Medium crust")
//  case Large => println("Large crust")
}

if (currentCrustSize == Small) println("Still small crust.")


