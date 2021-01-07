fun main(){
    //run을 이용한 블록 단위 실행
    val result = run{
        println("Hello Run")
        100 + 300
    }
    println(result)

    data class User(var num:Int, var name:String){}
    val user = User(1,"longboard")
    var userResult = user.run{
        num = 10
        name = "rizz"
    }
    println(user)
}