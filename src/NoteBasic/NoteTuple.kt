package NoteBasic

/**
 * Created by Administrator on 2017/7/6.
 *
 * 元组（Tuple），给多个变量同时赋值，
 * 分二元（Pair）和三元（Triple）
 *
 */
fun main(args: Array<String>) {
    var desc=Pair("软件工程",14000)
    val (name,age,sex)=Triple("吴振宇",20,true)
    println("姓名 ${name} 年龄 ${age} 性别 ${sex}")
    println("专业：${desc.first}  学费：${desc.second}")
}