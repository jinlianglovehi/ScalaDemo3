import scala.util.control.Breaks

/**
  * Created by jinliang on 15/12/23.
  * 说明
  *  scala 不提倡 break 的打断程序
  *  需要自己进行创建breaks 进行打断程序.
  *
  */
object Demo03_Break {
  val loop = new Breaks;

  var numlist = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

  def main(args: Array[String]) {
    println("----循环开始-----");
    loop.breakable(
      //内置循环的逻辑
      for (a <- numlist) {
        println("values:a---" + a);
        if (a == 4) {
          loop.break();
        }
      }
    )
    println("----循环结束----");


  }

}
