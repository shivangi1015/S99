package com.myWorld.s99

object q16 extends App {

  /*P16 (**) Drop every Nth element from a list.
    Example:

    scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)

*/

  def dropElement(n: Int, list: List[Int]): List[Int] = {
    def inner(k: Int, innerList: List[Int], remList: List[Int]): List[Int] = {
      remList match {
        case Nil => innerList
        case _ :: tail if k % n == 0 => inner(k + 1, innerList, tail)
        case h :: tail => inner(k + 1, innerList :+ h, tail)
      }

    }

    inner(1, Nil, list)
  }

  val result = dropElement(2, List(1, 2, 3, 4, 5, 6, 7))
  println(result)
}
