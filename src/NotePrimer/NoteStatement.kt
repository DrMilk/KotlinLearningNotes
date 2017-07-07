package NotePrimer

/**
 * Created by Administrator on 2017/7/7.
 *
 * 有时候只是要对某个类进行轻微改造，供临时使用，避免继承
 * 对象声明和表达式就很有用。
 * 对面向对象编程的优化，避免一些继承导致的代价过高
 */
//对中国人来说，这个类，可能各省人适合继承
open class Chinese(name:String){
    open var skin = "yellow"
}

fun main(args: Array<String>) {
    //但如果外国人入籍，就不适合用"继承"
    //对象表达式：val 对象名 =object : 类，接口（//属性或方法的Override定义）
    val baako = object : Chinese ("Baako Zaid"){
        override var skin = "black"
    }
    println(baako.skin)

    //纯对象表达式：临时使用，无须继承任何类
    val tempParking = object {
        var x = 100
        var y = 200
    }
    println(tempParking.x)
    println(NetworkRequestManager.register())

    //伴生对象的方法，与类关联性很强
    IDCard.create()
}

//对象声明，不能用在函数中
//一般用于对其他类的一种使用上的包装
object NetworkRequestManager{
    fun register(){
        println("连接网络组测中")
    }
}

//伴生对象：一般用于创建一个类的实例的"工厂"方法
class IDCard {
    companion object {
        fun create() = IDCard()
    }
}