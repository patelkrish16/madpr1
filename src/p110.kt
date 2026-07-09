class Car (m:String){
    var model: String = ""
    var price: Double = 0.0
    init{
        model = m
    }
}
fun main ()
{
    val car = Car()
    println("model: ${car.model}")
    println("price: ${car.price}")

}