import java.util.Scanner
import java.util.TreeSet

class Data2 {
}
//List ---> Olcusu dinamik olan array da deye bilerik
val myList = listOf(1,2,3,3,4,4)
//MutabeList  ArrayList  LinkedList

fun main() {

    //val scanner = Scanner(System.`in`)
//SET--->>
//val mySet = setOf(3,4,5,6,7)
    /*val scanner = Scanner(System.`in`)

    val mytreeset = TreeSet<Int>()
    for (i in 0..5) {
        mytreeset.add(scanner.nextInt())

    }
    mytreeset.forEach{
        println(it)
    }

     */
    val myArray = arrayOf<Int>(1,2,4,5,6,9)
    //myArray.set(0,9)
   // myArray.set(1,7)
   /* println(myArray[0])
    for (i in myArray){
        println(i)
    }


  //  println(myArray.count())
    val distinct = myArray.distinct()//distinct() komutu arraydaki dublikat olan elemanlarin outputunu tek olarak cikartir
    for (i in distinct){
        println(i)
    }

    */
   /* val result = myArray.dropLast(5)   //drop and dropLast arraydan elemanlari atmak icin kullanilir
    for (i in result){
        println(i)
    }*/

    /*var p = Person("Ramiz","Babayev",21)
    var p2 = Person("Ramiz")
    var p3 = Person(age = 33)
    
     */


    
}
class Person(var name:String?=null ,var surname:String?=null,var age:Int=0){
   // var ad:String? = name
   // var soyad:String? = surname
   // var yas:Int? = 0
}
