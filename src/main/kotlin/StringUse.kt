fun main(){
    val str = "Hello Python"
    //공백 뒤의 문자를 추출해서 출력
    //문자열을 분리할 때는 위치를 가지고 하는 방법과 특정 패턴을 이용하는 방법
    var ar = str.split(" ")
    println(ar[ar.size -1])

    var idx = str.indexOf(" ")
    if(idx >= 0){
        var result = str.substring(idx+1)
        println(result)
    }
}