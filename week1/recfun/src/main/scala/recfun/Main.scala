package recfun

import scala.annotation.tailrec

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
    //println("change")
    //println(countChange(10, List(1,2,3)))
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      def pascalIter(c: Int, r: Int): Int = {
        if (c == 0 || c == r) 1
        else pascalIter(c - 1, r - 1) + pascalIter(c, r - 1)
      }
      pascalIter(c, r)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      @tailrec
      def balanceIter(counter: Int, chars: List[Char]): Boolean = {
        if (chars.isEmpty || counter < 0) counter == 0
        else if (chars.head == '(') balanceIter(counter + 1, chars.tail)
        else if (chars.head == ')') balanceIter(counter - 1, chars.tail)
        else balanceIter(counter, chars.tail)
      }
      balanceIter(0, chars)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      def countChangeIter(money: Int, coins: List[Int]): Int = {
        if (money <= 0 || coins.isEmpty) 0
        else if (money - coins.head == 0) 1 + countChangeIter(money, coins.tail)
        else if (money - coins.head < 0) countChangeIter(money, coins.tail)
        else countChangeIter(money - coins.head, coins) + countChangeIter(money, coins.tail)
      }
      countChangeIter(money, coins)
    }
  }
