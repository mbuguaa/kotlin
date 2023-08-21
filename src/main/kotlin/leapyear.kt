import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter an year")
    var year=reader.nextInt()

    if (year%4==0){
        println("It is a leap year")
    }
    else{
        println("It is not a leap year")
    }
}