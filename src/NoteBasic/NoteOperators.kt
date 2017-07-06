package NoteBasic

/**
 * Created by Administrator on 2017/7/6.
 *
 * 一个符号或单词，类似数学的 + - * /，用于运算或者操作。
 * 同时操作对象的数目，被称之为几元操作符
 */
fun main(args: Array<String>) {
    var a=3
    a=-100
    val b=-a
    var d=a+b
    println("a:${a}")
    println("b:${b}")
    println("d:${d}")
    println(12+4)
    println(12-4)
    println(12*4)
    println(12%4)
    println(12/4)

    //赋值与数学操作符的组合，比如 +=
    var gdp=1_000_000.0
    var gdpGrowth=6.7
    gdp+=gdp*gdpGrowth
    println(gdp)

    //比较操作符
    print(1 > 2)
    print(2 >= 2)
    print(1 < 2)
    println(1 <= 2)

    //逻辑操作符 ：布尔值的组合  ，与/或/非
    if(true && true || false){
        print(true)
    }else{
        print(false)
    }
}
