package com.myWorld.s99

object q17 extends App {
  /*
  P17 (*) Split a list into two parts.
      The length of the first part is given. Use a Tuple for your result.

      Example:

      scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
   */

  def split(n: Int, list: List[Int]): (List[Int], List[Int]) = {
    def inner(k: Int, remList: List[Int]): (List[Int], List[Int]) ={
      remList match {
        case _ :: t if n == k => remList.splitAt(k)
        case _ => inner(k+1, remList)
      }
    }
    inner(1, list)
  }

  val result = split(2, List(1,2,3,4,5))
  println(result)
}
