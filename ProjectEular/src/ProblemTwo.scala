object ProblemTwo extends App{
  var a = 1
  var b = 1
  var c = 0

  while (a<4000000 && b<4000000){
    b = a + b
    a = b - a
    println(b)

    if (b%2==0) c+=b
  }

  println(c)
}
