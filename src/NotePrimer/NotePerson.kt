package NotePrimer

/**
 * Created by Administrator on 2017/7/7.
 */

//快速定义：class 类名 constructor（属性列表）｛更多的属性和方法描述｝
//构造器：用来设置类的新实例的出厂配置
open class NotePerson constructor(var name:String,var sex:Boolean,var age:Int) {
    public open var region : String = "中国"
    public open fun showRegion() : String {
        return region
    }
}
class Student (name: String,sex: Boolean,age: Int=17): NotePerson(name, sex, age){
    //普通属性，与变量定义相似
    var height : Double = 0.0
    //组合属性，由其他属性计算而来（get）
    var sexStr : String = ""
        get() {
            if (sex){
                return "男"
            }else{
                return "女"
            }
            return ""
        }
    //组合属性反过来可以影响其他属性（set，可选），this代表实例
    var weight : Int = 0
        set(value) {
        when(value){
            in 150..200 -> {
                this.height = value*0.68
            }
            in 100..150 -> {
                this.height = value*0.78
            }
        }
    }
}

class HarBin(name: String,sex: Boolean,age: Int):NotePerson(name, sex, age){
    //属性覆盖
    override var region : String = "哈尔滨"

    //方法
    fun skating(status : Boolean) : Boolean{
        if(status){
            println("${this.name}会滑冰")
            return true
        }else{
            println("${this.name}不会滑冰")
            return false
        }

    }
    override fun showRegion(): String {
        var bigregion = super.showRegion()
        return bigregion+"  "+this.region
    }
}