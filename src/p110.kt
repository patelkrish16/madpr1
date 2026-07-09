open class Car ( var model:String){

    var price: Double = 0.0
    constructor(p: Double,m:String):this(m)
    {price=p}
}
class Suzuki(m: String):Car(m){}
fun main () {
    val c1 = Car(p = 120000.0, "BMW")
    println("model: ${c1.model}")
    println("price: ${c1.price}")
    val c2 = Suzuki("alto")
    println("model: ${c2.model}")
    println("price: ${c2.price}")
}
