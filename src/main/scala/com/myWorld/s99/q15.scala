package com.myWorld.s99

object q15 extends App {

  /*
P15 (**) Duplicate the elements of a list a given number of times.
    Example:

    scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
    res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
 */

  def duplicateGiven(n: Int, list: List[Int]): List[Int] = {
    list flatMap {
      e => List.fill(n)(e)
    }
  }

  val result = duplicateGiven(3, List(1, 2, 3))
  println(result)
}
