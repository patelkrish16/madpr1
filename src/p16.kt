fun main(){
    println("Enter First no:")
    var no1 = readln().toInt()

    println("enter second no:")
    var no2 = readln().toInt()

    println(add(no1,no2))
    println(sub(no1,no2))
    println(mul(no1,no2))
    println(div(no1,no2))
}
fun add(no1:Int, no2:Int): Int
{
    return no1 + no2
}
fun sub(no1:Int, no2:Int): Int
{
    return no1 - no2
}
fun mul(no1:Int, no2:Int): Int
{
    return no1 * no2
}
fun div(no1:Int, no2:Int): Int
{
    return no1 / no2
}

