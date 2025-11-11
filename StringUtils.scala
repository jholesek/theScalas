object StringUtils {
        def lettersAndNumsOnly_?(s: String): Boolean =
                s.matches("[a-zA-Z0-9]+")

        def containsWhitespace (s: String): Boolean =
                s.matches(".*\\s.*")
}

println(StringUtils.lettersAndNumsOnly_?("Only123"))
println(StringUtils.lettersAndNumsOnly_?("n!otOnly123"))
println(StringUtils.containsWhitespace("one white space"))
println(StringUtils.containsWhitespace("nowhite"))

