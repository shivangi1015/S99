package com.myWorld

object S99 extends App {

  /* P10 (*) Run-length encoding of a list.
    Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.

    Example:

    scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
 */
  def enc(list: List[Int]): List[(Int, Int)] = {
    def inner(remList: List[Int], resList: List[(Int, Int)]): List[(Int, Int)] = {
      remList match {

        case Nil => resList
        case h :: _ => inner(remList.dropWhile(_ == h), resList :+ (remList.takeWhile(_ == h).size, h))
      }
    }
    inner(list, Nil)
  }

  /* P11 (*) Modified run-length encoding.
    Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.

    Example:

    scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
 */

  def lengthEncoding(list: List[Int]): List[Any] = {
    enc(list) map{
      element =>
        if(element._1 == 1)
          element._2
        else
          element

    }
  }

  val result = lengthEncoding(List(1,1,1,2,3,3,4,4,4,1))
  println(result)
}
