object functionExample {
  println("Welcome to the Scala worksheet")
  def abs(x:Int): Int = if(x < 0) -x else x
  abs(-5)

  def fac(n:Int): Int = {
    var r = 1
    for(i <- 1 to n) 
      r = r * i 
      r
  }
  fac(5)


 // def fac(n:Int): Int = { //this is the factorial function
    //if (n == 1) 
     // 1
   // else
      //fac(n - 1) * n
  //}

  def printName(left:String = "[", firstName:String, lastName:String, right:String = "]") {
    println(left + firstName + " " + lastName + right)
  }

  printName(lastName = "Fisher", firstName = "Peggy")

  def sum(args:Int*): Int = {
    var result = 0
    for (arg <- args) result += arg
    result
  }

  sum(args = 1,2,3,4,5)

  def main(args:Array[String]) {
    println(fac(5))
  }
}