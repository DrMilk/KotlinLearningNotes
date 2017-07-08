package NoteMiddle

import java.util.Comparator

/**
 * Created by Administrator on 2017/7/8.
 *
 * 泛型 Generics
 * 让一个类型能被"广泛"使用，即通用化，称之为"泛型"
 * 一般用于函数的参数类型定义，让函数更通用
 */

fun main(args: Array<String>) {
    //最常用的列子，print 和 println 函数 ，几乎可以让任何类型的参数
    println(2)
    println("泛型")
    println(arrayOf("Swift", "Kotlin", "Ios", "Android").component3())

    //Array,参数也可以是任意类型
    val a = arrayOf(1, 2, 3)

    //自定义一个泛型函数, <T> ,T代表一个占位符，用尖括号包含
    //类型占位符可以是任何字母
    fun <E> showText(para: E) {
        println(para)
    }

    showText(3)
    showText("我也是泛型函数")

    //有时候系统提供的泛型函数很好
    //求和
    val sum = arrayOf(1, 3, 99, -2, 10245).sum()
    println(sum)

    //泛型约束
    // val sum = arrayOf(1,3,99,-2,10245,98.35).sum()
    // 泛型约束: <泛型占位符：类型>
    fun <T : Number> wusum(vararg numbers: T) : Double {
        return numbers.sumByDouble { it.toDouble() }
    }
    println(wusum(2,5,6,346))

    //多重约束：where ，各个约束用逗号分割，写在函数之前
    //例子：把数组中大于某个元素（阈值）的部分取出并升序排列
    //（99，1，2，-389，88，1024，888）> (88,99,1024,8888)
//    fun <T> biggerPart(list: Array<T>, threhold: T): List<T>
//                        where T:Number,T:Comparator<T>
//    {
//        return list.filter {it >= threhold }.sort
//    }
}