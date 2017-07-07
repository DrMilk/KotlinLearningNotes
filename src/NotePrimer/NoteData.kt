package NotePrimer

/**
 * Created by Administrator on 2017/7/7.
 *
 * 数据类：专用于只保存数据的类，比如用户自动登录信息，聊天记录等
 * 这里的保存，并不是指保存到磁盘，而是指转换成文本格式，便于保存
 * Kotlin数据类：data class 类名（属性列表）
 */
data class Article(var id : Int ,var title : String ){

}
fun main(args: Array<String>) {
    var article = Article(1001,"基于Kotlin的安卓开发快速入门")
    //数据类的序列化
    println(article.toString())

    //复制 copy: 生成一个对象的克隆，并更改部分属性
    val article2 = article.copy(title = "今日开卖")
    println(article2.toString())

    //数据类对象的解构
    val (id,title) =article2
    println(title)
    //componentN
    println()
}