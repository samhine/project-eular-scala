object ProblemSix extends App{
  val n = 100 // Number we wish to investigate

  var sumofsq = 0
  for (i <- n to 0 by -1) sumofsq += i*i
  val sqofsum = (n*(n+1)/2)*(n*(n+1)/2)

  println(sqofsum-sumofsq)
}
