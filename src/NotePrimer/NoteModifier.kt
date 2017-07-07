package NotePrimer

/**
 * Created by Administrator on 2017/7/7.
 *
 * 设定类本身及属性，方法，构造器
 * 以及接口和对象的对外访问权限，即"可见性"
 *
 * private 私有：仅当前类课间，最小的可见性
 * protected 保护：仅子类可见
 * internal 内部：当前模块内可见
 * public 公开：默认，对外完全可见
 */

/**
 * 类中可以嵌套其他类
 *
 */
class News{
    //默认地区
    private var lang = "cn"
    //新闻分类：嵌套类，与主类关系并不是十分密切，只是一个形式上的合作，主从关系。
    class Category{
        var list = arrayOf("推荐","娱乐","体育","科技","美女")
        val listDesc = list.joinToString()
    }
    //内部类：新闻语种，通常用于不直接对外的类，为主类服务的。
    inner class language{
        fun changeRegion(newRegion:String) : String{
            //内部类可以访问主类的属性
            lang = newRegion
            return lang
        }
    }
}

fun main(args: Array<String>) {

    println(News().language().changeRegion("哈尔滨"))

}