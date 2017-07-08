package NoteMiddle

/**
 * Created by Administrator on 2017/7/8.
 *
 * 接口 interface ： 方法，属性或一段功能的"蓝本"
 * 仅仅是规定实现的标准 （抽象的）
 *
 * 通常用于对类进行附加功能，可以让类本身保持简洁的定义
 * 通过实现1个或N个接口的组合，来实现非继承式的功能增强
 *
 *
 */

//接口定义： interface 接口名 {//各种属性或方法定义}

//很多外国人入籍

interface Livable{
    var hasSkill : Boolean
}

interface ChinaLivable{
    //接口中的属性只有类型定义，不可初始化
    val hasJobOffer : Boolean

    //接口中的属性可以有get，通常用于单纯增加一个常量属性
    val visaCategory : String
        get() = "工作签证"

    //接口中的变量属性
    var city : String

    //接口中的方法
    fun speakChinese(value: String)

    //接口中的方法可以有默认实现，通常指该方法的固定不变的
    fun handleGuanxi(){
        println("你说啥我学啥")
    }
}
open class Person3 {
    var name = ""
}
//继承父类，并实现多个接口
class ForigenChinese : Person3(),Livable,ChinaLivable{
    override var hasSkill: Boolean
        get() =true //To change initializer of created properties use File | Settings | File Templates.
        set(value) {}
    override val hasJobOffer: Boolean
        get() = true //To change initializer of created properties use File | Settings | File Templates.
    override var city: String
        get() = "哈尔滨" //To change initializer of created properties use File | Settings | File Templates.
        set(value) {}

    override fun speakChinese(value: String) {
        println(value)
    }

}

fun main(args: Array<String>) {
    var tom = ForigenChinese()
    tom.name = "汤姆"
    tom.hasSkill = false
    tom.city = "杭州"
    println(tom.hasSkill)
    println(tom.city)
    tom.speakChinese("哈哈哈哈哈")
    tom.handleGuanxi()

}