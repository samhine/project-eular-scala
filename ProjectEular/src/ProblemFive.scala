object ProblemFive extends App{
  val r1: Range = 1 to 20
  var n = 1
  var found = false
  while (!found){
    if (r1.exists(x => n%x != 0)) n+=1
    else{
      println(n)
      found = true
    }
  }
}
