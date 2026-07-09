fun main() {

    val arr = IntArray(5)

    println("Enter 5 Array Elements:")

    for (i in arr.indices) {
        print("a[$i] = ")
        arr[i] = readln().toInt()
    }

    println("\nEntered Array:")
    println(arr.joinToString(", ", "[", "]"))


    var max = arr[0]

    for (i in 1 until arr.size) {
        if (arr[i] > max) {
            max = arr[i]
        }
    }

    println("\nMaximum Element = $max")
}