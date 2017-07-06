package NoteBasic

/**
 * Created by Administrator on 2017/7/6.
 *
 * 字符串（String）是有序的字符（Char）集合。
 * Kotlin中的String和Char的方法非常丰富
 * 字符串可通过+连接
 * 可以往字符串中插入变量创建字符串模版
 */
fun main(args: Array<String>) {
    var title : String = "惊！为何软件工程专业学费巨高"
    // 判断字符串为空 ： isEmpty() ,计数 count()
    println("字符串是否为空：${title.isEmpty()}")
    println("字符串长度：${title.count()}")

    //用Char类型来定义字符，一对单引号包括的值，为字符字面量，"b"
    //判断是否数字或者文字，isDigit，isLettter 方法
    val c : Char ='我'
    val six = '5'
    println(c.isLetter())
    println(six.isDigit())

    //用字符串的toCharArray()方法，把字符串转换为字符数组
    //字符串或字符的相连，可以用 + 操作符
    title.toCharArray()
    for (word in title.toCharArray()){
        println(word+" ")
    }

    //字符串模版：可以把各种变量组合成一个动态的字符串
    var time = Triple(17,7,7)
    var movie = "神偷奶爸3"
    var address = "哈西万达"
    var newtitle = "${time.first}年${time.second}月${time.third}日" +
            "，${movie}电影在${address}上映"
    println(newtitle)
}