def makeInt(s: String): Option[Int] =
  try {
    Some(Integer.parseInt(s.trim))
  } catch {
    case e: Exception => None
  }


