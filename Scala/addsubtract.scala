object addsubtract {
  def main(args: Array[String]): Unit = {
    def add(a:Int, b:Int):Int = a + b
    def subtract(a:Int, b:Int):Int = a - b

    println(add(10, 20))
    println(subtract(10, 20))

    var firstValue:Int = add(10, 20)
    println(subtract(firstValue, 20))

  }
}