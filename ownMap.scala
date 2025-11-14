def map[A,B](f: (B) => A, xs: List[B]): List[A] =
        for(x <- xs) yield f(x)

def double(i: Int): Int = i*2

println(map(double, List(1,2,3)))

def strlen(s: String): Int= s.length

println(map(strlen, List("a","bb","ccc")))

