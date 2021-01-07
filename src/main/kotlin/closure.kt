//메개변수가 없고 리턴타입이 없는 함수나 람다표현식을 리턴하는 함수
fun other():() -> Unit{
    //n은 지역변수 - 함수 외부에서는 접근할 수 없다
    var n : Int = 0

    return {
        println("n:${n}")
        n=n+1
    }
}

fun main(){
    //outer의 리턴되는 람다 표현식이 closure에 대입
    var closure = other()
    //호출할 때마다 1식 증가시켜서 출력
    closure()
    closure()
}