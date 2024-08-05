object prime {

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(n => isPrime(n))
  }

  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else {
      !(2 to math.sqrt(n).toInt).exists(i => n % i == 0)
    }
  }

  def main(args: Array[String]): Unit = {

    val listOne = List(1, 5, 10, 13, 100, 24)
    val primeList = filterPrime(listOne)
    println(primeList)
  }
}
