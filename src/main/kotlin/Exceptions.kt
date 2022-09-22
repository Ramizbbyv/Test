//fun main(args: Array<String>) {
//    val line = readLine()!!
//    println(5+(line?.toInt()?:0))// --?:0-- bu elvis operatorudur
//
//}
data class ExceptionYaratma(override var message:String):RuntimeException()


fun main() {
    var defaultPassword = "Ramiz123"
    var password = readLine()!!.trim()//trim bosluqlari silir
    if (defaultPassword != password)throw ExceptionYaratma("Incorrect Password")

}