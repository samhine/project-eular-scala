object ProblemOne extends App {
  var c = 0
  for (i <- 1 to 999){
    if (i%3 == 0 || i%5 == 0){
      c += i
    }
  }
  println(c)
}
