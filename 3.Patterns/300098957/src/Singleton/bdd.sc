
type R = Double

def f(x: R): R = {
  x*x
}

// As a function
if (f(0)==0) "very good" else "dumb"

if (f(2)==4.0) "very good" else "dumb"

if (f(3)==9.0) "very good" else "dumb"


val a = List(1,2,3,4)

for ( x <- a) println(x)

a.foreach(println)

a.find(_ % 2 == 0)
//match {
//  case Some(x) => println(x)
//  case _ => println("too bad")
//}

a.foldLeft(0)((m: Int, n: Int) => m + n)

a.foldRight(0)((m: Int, n: Int) => m + n)

List(List(1, 2), List(3, 4)).flatten

