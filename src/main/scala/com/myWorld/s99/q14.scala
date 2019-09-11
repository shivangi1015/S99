package com.myWorld.s99

object q14 extends App {

  /*
  P14 (*) Duplicate the elements of a list.
      Example:

      scala> duplicate(List('a, 'b, 'c, 'c, 'd))
      res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
   */

  def duplicate(list: List[Int]): List[Int] = {
    list flatMap {
      e=> List.fill(2)(e)
    }
  }
  val result = duplicate(List(1,2,3,3,4))
  println(result)
}
