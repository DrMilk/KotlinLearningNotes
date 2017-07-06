package NotePrimer

/**
 * Created by Administrator on 2017/7/6.
 * 函数是有名字的一段代码块
 * 包含参数和返回值(可选)，参数可以有默认值
 *
 */
fun add(x: Int,y: Int) : Int{
    return x+y
}

fun main(args: Array<String>) {
    var sum = add(3,5)
    var array= arrayOf(2,4,5,6)
    println(sum)
    println(addSum(2,4,5,6,78))
    println(addArray(array))
}

// 可变参数修饰符vararg
fun addSum(vararg x:Int) : Int{
    var total=0
    for (i in x){
        total+=i
    }
    return total
}

fun addArray (ary : Array<Int>) : Int {
    var total=0
    for (i in ary) {
        total+=i
    }
    return total
}
