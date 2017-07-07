package NotePrimer

/**
 * Created by Administrator on 2017/7/7.
 *
 * 检查：对一个检查的类型进行辨别
 * 转换：把变量转换成其他类型使用
 *
 */
fun main(args: Array<String>) {
    val a = 5
    val b = 6
    val c = if (a < b) "小于" else a-b

    //类型判断: is
    if(c is String) println(c)

    if(c !is String) println("整数为${c}")

    //Kotlin编译器大多数时候回智能转换
    if (a is Int) println(a)

    //手动转换: 强制转换as，安全转换 as？
    val  d = c as String
    println("d是c强制转换后的c，值是$d")
    if( d is String){
        println("转换成功了")
    }
    //安全转换
    var p = NotePerson("wuzhenyu",true,25)
    val e = p as? String
    println(e)
}
