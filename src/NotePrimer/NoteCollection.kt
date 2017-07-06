package NotePrimer

/**
 * Created by Administrator on 2017/7/6.
 *
 * 集合类型 Collection
 * - 有序可重复 - Array ，索引从0开始
 * - 无序不重复 - Set
 * - 无序可重复 - Map ,但值有唯一的键（Key）字典
 * 初学可参考下 Java 集合
 */
fun main(args: Array<String>) {
    //Array:Array<类型> 或 arrayof(元素1,元素2,...,元素n)
    //大小固定，元素类型不可变
    //地铁1号线："医大二院" ，"黑龙江大学","哈工程"，"哈工大"
    var route = arrayOf("医大二院" ,"黑龙江大学","哈工程","哈工大","哈工大")
    for (s in route) {
        print(s+" ")
    }
    println()
    var route2 = Array(10,{"地址"})
    for (s in route2) {
        print(s+" ")
    }
    var count = Array(10,{ i -> i})
    for (i in count) {
        println(i)
    }
    println(count[3])
    //获取筛选重复元素后的数组： .distinct() 或.toSet() 转换为 Set。
    var newroute=route.distinct()
    for (s in newroute) {
        print(s)
    }
    println()
    //切割数组：sliceArray
    var newroute1=route.sliceArray(1..3)
    for (s in newroute1) {
        print(s)
    }
    //mutableList: MutableList<类型> 或mutableListOf(元素1，元素2，...，元素n)
    // 大小可变，类型不可变
    var nollNewsStations = mutableListOf("医大二院" ,"黑龙江大学","哈工程","哈工大","哈工大")
    //在末尾增加元素：add方法，添加另一个数组addAll方法
    nollNewsStations.add("新的地址")
    //移出元素 remove方法
    nollNewsStations.removeAt(nollNewsStations.count()-2)
    for (s in nollNewsStations) {
        print(s)
    }


    /**
     *  集合类型 Set : 无序不重复
     *  主要方法 : 交叉并补
     *  重要方法 ：count() isEmpty()  contains()  containsAll()
     *  toTypedArray()   intersect/subtract/union/minus/补集的操作对象无须是Set类型
     *              toMutableSet() 转换成可变
     */

    var routeSet = setOf<String>("万达","红场","嘉兴")
    var infot= routeSet.iterator()
    while (infot.hasNext()){
        println(infot.next())
    }

    /**
     *  集合类型 Map：无序可重复 ，类似于"字典"的概念
     *  主要属性：keys(Set),value
     *  主要方法：mapOf<Key,Value>(Pair(key,value))
     */
    var airports= mapOf<String,String>(Pair("PVG","浦东"), Pair("SHA","虹桥"))
    airports=airports.toMutableMap()
    //添加 或 更新  用下标方法
    airports["Harbin"] = "哈尔滨"
    println(airports.get("Harbin"))
    for (airport in airports) {
        println(airport)
    }
}
