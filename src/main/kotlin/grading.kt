import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter student grade: ")
    var grade=reader.nextDouble()

    if (grade>=80 && grade<=100){
        println("Scored an A")
    }
    else if (grade>=60 && grade<=80){
        println("Scored a B")
    }
    else if (grade>=40 && grade<=60) {
        println("Scored a C")
    }
    else{
        println("fail")
    }

}