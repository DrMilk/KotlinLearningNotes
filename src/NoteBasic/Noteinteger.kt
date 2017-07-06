package NoteBasic

/**
 * Created by Administrator on 2017/7/6.
 *
 * 值的类型
 * 3这样的整数，在Kotlin中称为Int类型的值
 * 形式：var 变量名：Int=3
 * 由于Kotlin有类型推断，类型可以省略不写
 */

var length:Int = 5
var width:Int = 6
var area:Int = 0
fun main(args: Array<String>) {
    area = length * width
    print("面积是 ${area} 平方米")
}