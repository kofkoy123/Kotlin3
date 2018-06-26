package lzr.kotlin.four

//抽象类和接口区别

//抽象类可以有属性，有现场方法，也有接口方法
abstract class A{
    var str:String = "你好"

    open fun hello(name:String) {}

    abstract fun sayHello()
}


interface B{
    fun sayHi(name: String)
}

interface D{
    fun play(game:String)
}


//抽象类只可以继承1个 接口可以实现多个
//使用抽象类还是接口 看你继续还是实现多个  《《《《单继承多实现》》》
//抽象类反应的是事物本质，接口是事物能力
// 也可以理解 抽象类是中心词，接口是形容词  联想笔记本电脑   联想、笔记本都是接口，电脑是抽象类
class C:A(),B,D{
    override fun sayHello() {

    }

    override fun play(game: String) {
        println("我们一起玩$game")
    }

    override fun sayHi(name: String) {
        println("$str,$name!")
    }

    override  fun hello(name: String) {
        println("$str,$name")
    }
}

fun main(args: Array<String>) {
    val c = C()
    c.hello("李宁")
    c.sayHi("王峰")
    c.play("兵乓球")

    //因为C继承了A 实现了C可以你这样做
    if (c is A){

    }

    if (c is B){

    }
    val a:A = C()
    val b:B = C()


}
