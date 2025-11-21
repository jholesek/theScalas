val states = Map(
  "AK" -> "Alaska",
  "AL" -> "Alabama",
  "AZ" -> "Arizona"
)

for((k, v) <- states) println(s"key: $k , value: $v")

val s1 = states + ("CA" -> "California")

println(s1)

val s2 = s1 - "AL"

println(s2)

val s3 = s1.updated("CA","krneki")
println(s3)

