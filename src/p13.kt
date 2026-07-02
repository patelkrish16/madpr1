fun main() {

    var s1: String? = "23"
    val a1: Int = s1!!.toInt()
    println(a1)

    println("Student Enrollment Number:")
    val s2 = readln().toLong()
    println("Enrollment No: $s2")

    println("Student Name:")
    val s3 = readln().toString()
    println("Name: $s3")

    println("Branch:")
    val s4 = readln().toString()
    println("Branch: $s4")

    println("Class:")
    val s5 = readln().toString()
    println("Class: $s5")

    println("Batch:")
    val s6 = readln().toString()
    println("Batch: $s6")

    println("Student College Name:")
    val s7 = readln().toString()
    println("Student College Name: $s7")

    println("Student University Name:")
    val s8 = readln().toString()
    println("Student University Name: $s8")

    println("Student Age:")
    val s9 = readln().toInt()
    println("Student Age: $s9")
}