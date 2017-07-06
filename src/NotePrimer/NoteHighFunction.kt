package NotePrimer

/**
 * Created by Administrator on 2017/7/6.
 *
 * 高阶函数：1 参数或返回值的类型是函数型
 * 函数型 ：（参数）-> 返回值
 * lambda:一种无名函数的简写（（参数）-> 函数执行语句）
 *        其他语言称闭包，即有能力访问其自身范围国外的变量
 */
fun main(args: Array<String>) {
    //高阶函数：2 描述任务的结果 ，而不是使用循环详细推算
    //map：常用于对集合类型的元素类型整体转变
    //其lambda中参数的约定名称it
    val a = arrayOf(1,2,3,4,5)
    val b = a.map { "第${it}" }
    for (s in b) {
        println(s)
    }

    //filter:对象合类型进行筛选
    var sun=0
    val c=a.filter { it % 2 == sun }
    for (i in c) {
        println(i)
    }
    c.forEach {
        sun+=it
        print(sun)
    }
}