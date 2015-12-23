/**
  * Created by jinliang on 15/12/23.
  */
object Demo02 {
  //变量声明
  var testString :String  ="Foo";
  var myVal :Integer = 10 ;
  /**
    * 多重任务  scala 支持多重任务
    */
  val (myVal1: Int ,myVar2 :String)=Pair(30,"Foo");
  def main(args: Array[String]) {


    println("scala程序测试");

    println(testString);
    println(myVal);
    println(myVal1);
    println(myVar2);
    println("-------函数的调用-------")
    println(fun());
  }

  /**
    * 定义scala 函数
    * @return
    */
  protected  def fun(): String ={
    return "huhu";
  }

}
