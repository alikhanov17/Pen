import java.util.*

class Registration(
    var name: String, var phoneNumber: Int,
    var password: Int
) {


    fun show(){


        println("Name $name ")
        println("Phone $phoneNumber ")

    }

}

fun main() {

    var registration:Registration
    var scanner = Scanner(System.`in`)
    val user = arrayOfNulls<Registration>(100)
    var count :Int = 0


    while (true) {
        println("Sign up -> 1")
        println("Sign in -> 2")
        println("User List -> 3")
        print("= ")
        var n = scanner.nextInt();

        when (n) {
            1 -> {


                print("Name ")
                val name: String = scanner.next()
                scanner = Scanner(System.`in`)
                print("Phone ")
                val phone: Int = scanner.nextInt()
                print("Password ")
                val password = scanner.nextInt()

                registration = Registration(name, phone, password)
                user[count] = registration
                count++

            }
            2 -> {
                println("Enter name")
                var name =scanner.next()
                println("enter password")
                var password = scanner.nextInt()


try {
    for (e in user){

        if (password == e!!.password){
            println("succesful")
        } else{
            println("incorrect password")
        }
    }
}catch (e:Exception){
    println()
}





            }
            3 -> {
                try {
                    for (list in 0..count) {
                        println(user[list]!!.show())
                    }
                }catch(e:Exception){
                    println()
                }

            }
        }

    }


}