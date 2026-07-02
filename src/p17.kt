fun main()
{
    print("Enter number:")
    var num=readln().toInt()
    println(factorial(num))
}
fun factorial(num: Int): Int
{
    return if (num == 0 || num == 1)
        1
    else
        num * factorial(num - 1)
}