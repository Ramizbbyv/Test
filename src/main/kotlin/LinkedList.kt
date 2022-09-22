class LinkedList<T>() {
     //     var v :Any? = Any() //v null ola biler
     //     //classin  daxilinde mueyyen fun methodlari declare eleye bilerik hansisa emeliyyatlar ede bilmerik
     //     //ama emeliyatlari hansisa funin daxilinde ede bilerik
     //     fun sth(){
     ////         v = null
     ////     v  = "45"
     var head:Node<T>? = null
     var size  = 0
     fun add(data: T){
     if(size ==0) {
         addFirst(data)
     }

    else{
        addLast(data)
     }
    }

    private fun addLast(data:T){
    var currentNode = head
      while (currentNode?.next != null){
          //currentNode null olmasi o demekdirki firlanacaq ve null gordujde dayanacaq
         currentNode =currentNode.next
      }

       // currentNode?.next = Node(null,data)//sual isaresi ola biler null olsa eleme demekdi
        currentNode!!.next = Node(data = data)//bu ise o demekdirki bu hec vaxt null olmayacaq
    }

    private fun addFirst(data: T){
    head = Node(null,data)
        size++
    }
    fun printAll(){
        var currentNode = head
            while (currentNode != null)
                println("item:"+currentNode.data)
                currentNode = currentNode?.next
    }

}

 data class Node<T>(var next:Node<T>?= null, var data:T)

 fun main() {
   // var x = LinkedList()
      var mylist = LinkedList<String>()
     mylist.add("Ramiz")
     mylist.add("6")
     mylist.add("-1")
     mylist.add("string")
     mylist.add("My name is ...")
     mylist.printAll()


 }