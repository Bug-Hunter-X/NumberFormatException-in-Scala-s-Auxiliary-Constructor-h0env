```scala
class MyClass(val x: Int) {
  def this(s: String) = {
    try {
      this(s.toInt)
    } catch {
      case e: NumberFormatException =>
        println("Invalid input: " + e.getMessage)
        this(0) // Or handle the error appropriately
    }
  }
}

val myObj1 = new MyClass("123")
println(myObj1.x) // Output: 123

val myObj2 = new MyClass("abc")
println(myObj2.x) // Output: Invalid input: For input string: "abc", then 0
```