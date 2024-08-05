object square {

  def calcualteSquare(numbers: List[Int]): List[Int] = {
    numbers.map(x => x * x)
  }

  def main(args: Array[String]): Unit = {

    val numList = List(2, 13, 6, 10, 20)
    val squareList = calcualteSquare(numList)
    println(squareList)
  }
}
