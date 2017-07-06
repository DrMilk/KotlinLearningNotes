package NotePrimer

/**
 * Created by Administrator on 2017/7/6.
 * 用来检查和运算各种条件和逻辑的组合，控制App的运动流向。
 * 循环：for，while 及 循环控制
 * if ：二元判断
 * when ：细致化判断
 */
fun main(args: Array<String>) {
    var number = arrayOf(1,2,3,4,5)
    for (i in number) {
        println(i)
    }
    //重复执行
    for (a in 1..10){
        println("重复第${a}次")
    }

    //while ：循环执行一系列操作，直到条件不允许，适合执行次数未知的场合
    var num = 1
    var total =10
    while (num < total){
        print(num)
        num++
    }
    // 循环中的控制：continue 结束本次循环 ，break 结束整个循环
    var a = 4
    var b = 2
    var result = if(a>b){
        println("${a} 大于 ${b}")
    }else{
        println("${a} 小于 ${b}")
    }

    //when : 可对某个变量的大小/范围/值表达式/类型等进行判断
    when(a) {
        is Int ->{
            println("值是Int型")
        }
        (9-5)->{
            println("4")
        }
        in 0..10 -> {
            println("10以内数")
        }
        else -> {
            println("10以外数")
        }
    }
}