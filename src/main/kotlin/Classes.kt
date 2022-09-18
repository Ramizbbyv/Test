/*-->>Enum---< classlari secenek odakli islemler yapmamiz gereken zaman kullaniyoruz
----Data <---classlari veri odakli islemler yapacagimiz zaman veya internettden veri cekdiyimiz zaman kullaniyoruz
--->Sealed<---- classlari internetten veri cekdiyimiz zaman ya fail olur yada succes olur bu zaman iki class
olusturuyoruz ve bu iki classi ana klassdan miras aliyoruz
 */
fun main(args: Array<String>) {
    val d = Operation(15,16,OperationType.MULTIPLICATION)
    val result = when(d.type){
        OperationType.MULTIPLICATION->d.a*d.b
        OperationType.DIVISION->d.a/d.b
        OperationType.SUBSTRACTION->d.a-d.b
        OperationType.SUM->d.a+d.b


    }
    //println(result)
    val number = 10
    val number2 = 7
    val sum = number+number
    val substraction = number-number2

    val cavab  = try {
        val div = sum/substraction
        Responce.Success(div)
    }catch (e:Exception){
        Responce.Failure(e,404)

    }finally {
        println("Process is finished")
    }
    when(cavab){
        is Responce.Success-> println("Success.Result = ${cavab.data}")
        is Responce.Failure-> println("Fail-->${cavab.exception}")
    }

}
class Operation(val a: Int,val b:Int,val type:OperationType){

}
enum class OperationType{
    SUM,
    MULTIPLICATION,
    DIVISION,
    SUBSTRACTION
}
sealed class Responce {
    data class Success(val data:Int):Responce()
    data class Failure(val exception:Exception,val errrorcode:Int)
}