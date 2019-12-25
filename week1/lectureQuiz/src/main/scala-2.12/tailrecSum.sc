// 1st
def sum(f: Int => Int)(a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a > b) acc
    else loop(a + 1, acc + f(a))
  }
  loop(a, 0)
}

def f(x: Int): Int = x * x
println("sum is: " + sum(f)(1, 2))
println("sum is: " + sum(x => x * x)(1,2))