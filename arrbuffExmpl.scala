import scala.collection.mutable.ArrayBuffer

var nums = ArrayBuffer(1, 2 ,3)

println(nums)

nums += 4
println(nums)

nums ++= List(5, 6)
println(nums)

nums -= 6
println(nums)

nums(2)=20
println(nums)

nums.update(1, 10)
println(nums)

