// let apply run also with
/*nesne uzerinden islemler yapan zaman kodun okunurlugunu artirmak icin biz scope funksiyonlar kullaniyoruz
 */
open class User(name:String,surname:String,age:Int,Id:Int){

}
var user1 = User("Ramiz", "Babayev",21,236124)
fun main(){
    val numbers = listOf(5, 9, 23, 24, 12, 92)
   //val numbersPasssed = numbers.filter {
   //    it > 10
   //}
   //println(numbersPasssed)
   //val num = numbers.filter {
   //    it>10
   //}.let {
   //    "First big number is  =${it.min()}"
   //}
   //println(num)
    val lastNum = numbers.last()
    val lastNumber  =numbers.last().let {  lastItem ->
        "lastIten is = "+lastItem
        if (lastItem>13) "Yes it is bigger than 13"
        else "List item is not bigger than 13"


    }
    println(lastNum)
    println(lastNumber)
    with(numbers){
        println("The minimum value is ${min()} \n The maxuimum value is ${max()} \n The size of a numbers   ${this.size}")
    }
    //run letin reciever almis formasidir
    User("Ramiz", "Babayev",24,47345).run {

    }




}
