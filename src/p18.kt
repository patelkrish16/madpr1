fun main()
{
    val a1=arrayOf('A','B','C','D','E')
    println(a1.joinToString())
    val a2=Array<Int>(5){0}
    println(a2.joinToString())
    val a3=Array<Int>(5){i->i*i}
    println(a3.joinToString())
    println("Two-D Array")
    val twoDArray = Array(2) { Array<Int>(2) { 0 } }
    println(twoDArray.contentDeepToString())
    println("Three-D Array")
    val threeDArray = Array(3) { Array(3) { Array<Int>(3) { 0 } } }
    println(threeDArray.contentDeepToString())

    println("Create Array-1 by using arrayOf")
    val ar1=arrayOf(10,20,40,50)
    println(ar1.joinToString())
    println("Create Array-2 by using Array<>")
    val ar2=Array(5){ 0 }
    println(ar2.joinToString())
    println("Create Array-3 by using Array<> and lambda function")
    val ar3=Array(5){it}
    println(ar3.joinToString())
    println("Create Array-4 by using IntArray")
    val ar4 = IntArray(5)
    println(ar4.joinToString())
    println("Create Array-5 by using intArrayOf()")
    val ar6=intArrayOf(12,10,2,5,18,19)
    println(ar6.joinToString())
    println("Create 2D Array-6 by using arrayOf() and  intArrayOf()")
    val ar7=arrayOf(
        intArrayOf(1,3),
        intArrayOf(4,5),
        intArrayOf(6,7))
    println(ar7.contentDeepToString())
    println("Please enter Array value")
    for (i in ar1.indices) {
        print("ar1[$i]= ")
        ar1[i]=readln().toInt()
    }
    println("Entered Array:")
    println(ar1.joinToString(",","[","]"))


    println("**************With Built-in Function***************")
    val builtIn = ar1.copyOf()
    builtIn.sort()

    println("After sorting by built-in function:")
    println(builtIn.joinToString(", "))

    println("\n**************Without Built-in Function***************")
    val manual = ar1.copyOf()

    println("Before Sorting:")
    println(manual.joinToString(", "))


    for (i in 0 until manual.size - 1) {
        for (j in 0 until manual.size - i - 1) {
            if (manual[j] > manual[j + 1]) {
                val temp = manual[j]
                manual[j] = manual[j + 1]
                manual[j + 1] = temp
            }
        }
    }

    println("\nAfter Sorting without built-in function:")
    println(manual.joinToString(", "))
}