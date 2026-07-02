fun main(){
    println("Enter the Month:")
    var  month= readln().toInt()
    println(when(month){
        1-> "janyary"
        2-> "february"
        3-> "march"
        4-> "april"
        5-> "may"
        6-> "june"
        7-> "july"
        8-> "august"
        9-> "september"
        10-> "october"
        11-> "november"
        12-> "december"
        else -> "please enter proper no"
    }
    )
}