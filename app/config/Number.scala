package config

import java.io.File

class Number(path:String){

  val file = new File(path)

  def getFree:Double = {
    (file.getFreeSpace.toDouble/1024/1024/1024).formatted("%.2f").toDouble
  }

  def getTotal:Double = {
    (file.getTotalSpace.toDouble/1024/1024/1024).formatted("%.2f").toDouble
  }

}

