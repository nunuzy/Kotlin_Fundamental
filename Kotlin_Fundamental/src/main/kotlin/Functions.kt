fun main(){
    val user = setUser("Nukhi", "Futsal", 16)
    println(user)
    printUser("Nukhi")
}
fun setUser(name: String, hobby: String, age: Int) = "My name is $name, I like $hobby, and I'm $age years old"
fun printUser(name: String){
}
