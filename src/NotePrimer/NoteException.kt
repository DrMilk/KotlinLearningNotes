package NotePrimer

/**
 * Created by Administrator on 2017/7/7.
 *
 * 对可能产生执行异常的代码的一种保护措施
 * 默认异常类：Exception
 *
 */
fun main(args: Array<String>) {
    var s : Array<Int> = arrayOf(1,2,4,5,6)
    //直接展示错误
    try {
        s[7]
        "ggg".toInt()
    }catch (e : Exception){
        println(e)
    }

    //忽略错误
    val a : Int? = try {
        "444".toInt()
    }catch (e : Exception){
        null
    }
    println(a)
}