import java.util.*

class Pen(var color: String?, var ink: Int) {
var on = false


    fun on(isTrue:Boolean):Boolean{
        return true
    }
    fun off(isFalse:Boolean):Boolean{
        return false
    }







}

fun main() {
    val pen = Pen("black",10)
val scanner = Scanner(System.`in`)
if (pen.on==false){
println("pen is off")
println("press 1 to on pen")
    var n =scanner.nextInt()
if (n==1){
    println("Write: ")
    var write = scanner.next()
var res = pen.ink
    for ( i in 0..write.length){
        res--
    }
    if (write.length>10) {
        println(write.get())


    }
    else {
        println("continute")
    }


}


}






}