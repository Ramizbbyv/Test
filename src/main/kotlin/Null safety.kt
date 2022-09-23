fun main() {
     //   var str:String? = "null safety lessons"
     //// str = null
     // println(str!!.length)
     /*null olabilecek bir hatadan kurtulak icin  if den use ede bilerik
    Elvis operatoru - ---?:----

     */
     // if (str !=null){
     //     println(str.length)
     // }
     // else {
     //     println("-1")
     // }
     // str = null
     // var length:Int = str?.length ?: -1
     // println(length)
     var i = 1
     var cem = 1
     while (i < 20) {
          cem -= i
          i++
     }
    // println("Cavab = " + cem)
    var a =  multiply(4)
     println(a)
    var d =  5.multi()
     println(d)
     var e1 = "Ramiz" ekle " " +
             "Babayev"
     println(e1)
}
fun multiply(x1:Int):Int{
     return 4*x1

}
fun Int.multi():Int{
     return this*9
}


infix fun String.ekle(deger:String):String{
     return this+deger
}



