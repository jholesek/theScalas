case class Circle(x: Double, y: Double, radius: Double)

implicit class CircleOps(c: Circle) {
        def circumference: Double = c.radius * math.Pi * 2
        def diameter: Double = c.radius * 2
        def area: Double = math.Pi * c.radius * c.radius
}


val aCircle = new Circle(2,3,4);

println("Circumference: "+aCircle.circumference);

