object filter {

  def main(args: Array[String]): Unit = {

    val myList = List(12, 12, 34, 15, 23, 47)
    val finalList = filterEvenNumebrs(myList)

    println(finalList)

  }

  def filterEvenNumebrs(newList: List[Int]): List[Int] = {
    newList.filter(num => num % 2 == 0)
  }

}
