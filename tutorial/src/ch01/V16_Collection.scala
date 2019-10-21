package ch01

import scala.collection.mutable.ArrayBuffer

object V16_Collection {
  def main(args: Array[String]): Unit = {

    /**
      * 不可变的数组
      */
    val ints = Array(1, 2, 3) // 简单创建，内部其实通过apply方法来创建的。
    println(ints(0)) // 获取数组元素
    println(ints.length)
    println(ints.mkString(",")) // 使用数组来创建字符串
    // 遍历数组
    for (ele <- ints) {
      println(ele)
    }
    //    ints.foreach(f => println(f))
    ints.foreach(println)
    // 增加元素，这种修改数组不会修改原数组，只会创建一个新数组
    ints :+ (5) // 在结尾加
    5 +: ints // 在开头加
    println(ints.mkString(","))
    // 更新元素
    ints.update(0, 4) // 指定索引，和该索引上的值
    println(ints.mkString(","))

    /**
      * 可变数组
      **/
    val buffers: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4)
    buffers(0) = 9
    println(buffers.mkString(","))
    // 增加数据
    val newBuffer = buffers+=(10)
    println(buffers.mkString(","))
    println(newBuffer == buffers)
    // 移除袁术
    val i = buffers.remove(1) // 1是代表移除索引为1的数据
    buffers.remove(1,2) // 从1开始删，删2个元素
    println(i)
    println(buffers.mkString(","))
  }
}

/**
  * scala 集合主要分两大类： 可变（scala.collection.mutable.*)和不可变（scala.collection.immutable.*)
  *
  *
  *
  */
