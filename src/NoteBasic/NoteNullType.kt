package NoteBasic

/**
 * Created by Administrator on 2017/7/6.
 *
 * 可空类型
 * 代表变量可能没有值的情况
 * 如：用户资料的选填部分，如住址、性别等辅助信息
 * 形式：var 变量 ：类型？  无值则是null
 */
fun main(args: Array<String>) {
    var address : String ="哈尔滨 南岗区"
    var sex : Boolean?
    if(address!=null){
        println("地址：${address}")
    }
    sex=false
    if(sex!=null && sex == true){
        println("你的性别：男")
    }else if(sex==false){
        println("你的性别：女")
    }
}
