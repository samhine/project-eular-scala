object ProblemSeven extends App {
  def isPrime(k: Int) = {
    ! ((2 until k-1) exists (k % _ == 0))
  }

  // Very brute force-y
  var c = 0
  var i = 1
  while (c<10001){
    i += 1
    if (isPrime(i)) c+=1
  }
  print(i)
}
