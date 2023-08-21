 open class Employee1{
     fun name(){
         println("Joy")
     }
     fun age(){
         println("24")
     }
     fun salary(){
         println("50,000")
     }
}

 class WebDeveloper:Employee1(){
     fun website(){
         println("eCOMMERCE")
     }
 }

 class AndroidDeveloper:Employee1(){
     fun android(){
         println("My first App")
     }
 }

 class iosDeveloper:Employee1(){
     fun ios(){
         println("Just print")
     }
 }

 fun main(){
     var w=WebDeveloper()
     w.salary()

     var a=AndroidDeveloper()
     a.salary()

     var i=iosDeveloper()
     i.name()
 }