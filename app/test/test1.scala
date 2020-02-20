package test

import config.Number
import utils.Utils

object test1 {

  def main(args: Array[String]): Unit = {
    val file =new Number(Utils.path)


    val free = file.getFree
    val total = file.getTotal
    val beUsed = total - free
    println(free)
    println(total)
    println(beUsed)
  }
}
