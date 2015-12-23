/**
  * Created by jinliang on 15/12/23.
  * scala 创建函数
  *
  * var和 val 之间的区别
  *
  * var是变量的声明
  *
  * val是不可变量的声明
  *
  */
object Demo04_Fun {

  def main(args: Array[String]) {

    println(addFun(3,9));

  }

  /**
    * 定义相加的函数
    * @param a
    * @param b
    * @return
    */
  def addFun(a: Int, b: Int): Int = {

    //变量的初始化
    var sum: Integer = 0;
    sum = a + b;

    return sum;
  }

  /**
    * Unit 类型: 不需要返回数据的类型
    */
  def addFun(): Unit ={

  }

}
