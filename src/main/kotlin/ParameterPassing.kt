//람다 함수
val lambda:() -> Boolean = {
    println("파라미터 전송")
    true
}
//파라미터가 데이터
fun callByValue(b:Boolean):Boolean{
    println("call by value");
    return b
}
//람다 표현식이나 변수를 대입
fun callByName(b:()->Boolean):Boolean{
    println("call by name");
    return b()
}

fun main(){
    callByValue(lambda())
    callByName(lambda)
}