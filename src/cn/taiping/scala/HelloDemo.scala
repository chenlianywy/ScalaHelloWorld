package cn.taiping.scala

object HelloDemo {

  def main(args: Array[String]): Unit = {
  //  println("hello world !!!")

    val a: Int => Int ={
      b=> b* 10
    }

//    println(a(2));

    def f(): Unit = {
      println("function")
    }


    def f0()={
      f _
    }

   //  f0()()

    def f3(i:Int)(j:Int): Int = {
      i * j
    }

    println(f3(2)(3))





  }
}
