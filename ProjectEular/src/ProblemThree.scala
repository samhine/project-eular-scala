import scala.math.sqrt
import scala.collection.mutable.ListBuffer

object ProblemThree extends App{
  val n = 600851475143L


  // First find the factors
  def getFactors(k: Long): ListBuffer[Int] = {
    var factors = new ListBuffer[Int]()
    for (i <- 1 to sqrt(n).toInt) {
      if (n % i == 0) factors += i
    }
    factors
  }

  // Find which of these are prime
  def isPrime(k: Int) = {
    ! ((2 until k-1) exists (k % _ == 0))
  }

  var primefactors = new ListBuffer[Int]()
  val factors = getFactors(n)

  for (i <- 0 until factors.length){
    if (isPrime(factors(i))) primefactors += factors(i)
  }

  println(primefactors)

}
