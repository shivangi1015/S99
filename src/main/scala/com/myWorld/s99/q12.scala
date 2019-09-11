package com.myWorld.s99

object q12 extends App {

  /*
P12 (**) Decode a run-length encoded list.
    Given a run-length code list generated as specified in problem P10, construct its uncompressed version.

    Example:

    scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
    res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
 */

  def uncompressed(list: List[(Int, Int)]): List[Int] = {
    list flatMap {
      e => List.fill(e._1)(e._2)
    }
  }

  val result = uncompressed(List((4,1),(2,2),(3,3)))
  println(result)
}
