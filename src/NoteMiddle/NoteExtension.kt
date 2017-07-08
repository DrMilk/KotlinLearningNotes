package NoteMiddle

/**
 * Created by Administrator on 2017/7/8.
 *
 * 扩展：对既有的类增加新功能而无需继承该类，即时无法获取其源代码
 * 主要作用是"立即"为相关类整体上添加"工具类（Utils）"方法或属性，高效优雅
 * Kotlin支持：扩展函数，扩展属性，扩展协议 （可能将来版本支持，Swift中已经实现）
 *
 * 与接受者类中参数，名称都一样的扩展是无效的
 * 尽量避免与已有的名字重名，如果一定要重名，参数名和类型也要不一样
 */


//扩展函数：fun 接收者类型，新扩展函数名（参数类别）{//函数实现}
// 1 . 普通函数扩展：整数的平方
fun Int.square(): Int {
    return this*this
}

fun main(args: Array<String>) {
    println(3.square())

    val a = arrayOf(1,2,3,4,99,-245)
    println(a.min())
}
//// 2.泛型函数扩展：取数字型数组中最大的元素
//fun <T> Array<T>.biggest():T
//        where T : Number
//              T : String{
//
//}