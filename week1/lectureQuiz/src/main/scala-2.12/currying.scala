import scala.annotation.tailrec

/**
  * Created by Johannes on 19.2.2017.
  */

def product(f: Int => Int)(a: Int, b:Int): Int = {
  @tailrec
  def productF(a: Int, b: Int, acc: Int): Int = {
    if (a > b) 1
    else productF(a + 1, b, acc * a)
  }
  productF(a, b, 1)
}


println("testing: " + product(x => x * x)(1,2))