// Pattern Matching

val verite = true

if (verite)
  println("Real News")
else
  println("Fake News")

verite match {
  case true =>
    println("Real News")
  case false =>
    println("Fake News")
}

case class Verite(fait:Int, rumeur: Int)

val news = Verite(1,2)

val cnn = news match {
  case Verite(fait,_) if fait>1 =>
    println("Real News",fait)
    fait
  case Verite(_,rumeur) if rumeur>2 =>
    println("Real News",rumeur)
    rumeur
  case _  =>
    println("Fake News")
    0
}
cnn