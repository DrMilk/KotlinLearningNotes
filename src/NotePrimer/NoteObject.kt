package NotePrimer

/**
 * Created by Administrator on 2017/7/7.
 *
 * 面向对象编程
 * 对某种事物进行抽象化，称为"建模（model）"，就像提取生物的基因
 * 一个模型称之为一个类（class），从而简化认知，找到规律
 * 特征和属性：需氧、厌氧，寿命...  --变量（属性）
 * 功能和行为：进食，奔跑，睡觉，卖萌，求偶     --函数（方法）
 * 繁殖：继承和多态
 *
 * 要创建一个具体的生物，必须予以配置参数，及"实例化 instance"
 *
 */
fun main(args: Array<String>) {
    //实例化一个类
    val wuzhenyu = Student("wuzhenyu",true)
    println(wuzhenyu.name)
    var wu = HarBin("wuzhenyu",true,20)
    println(wu.skating(true))
    println(wu.showRegion())
}
