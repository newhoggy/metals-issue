package org.metals.issues

import cats.syntax.all._

object Main {
  def main(args: Array[String]): Unit = {
    val map = Map.empty[Int, Int]
    val x = args // Type inference for x succeeds
    map.fmap { v =>
      val y = args // Type inference for y fails with internal error
      v
    }
  }
}
