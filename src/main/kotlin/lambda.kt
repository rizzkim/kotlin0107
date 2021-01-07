/*
fun main(args:Array<String>){
    //2개의 정수를 대입 받아 더한 후 결과를 리턴하는 람다 표현식
    //바로 실행
    println({first:Int, second:Int -> first+second}(100,200))

    //변수에 대입해서 실행
    val lambdaVal = {first:Int, second:Int -> first+second}
    println(lambdaVal(100,200))
}
 */

//{first:Int, second:Int -> first+second} 의 자료형
val lambdaType : (Int, Int) -> Int = {first:Int, second:Int -> first+second}

val temp1 : (Int) -> Int = {n:Int -> n + 1}
//Unit은 리턴하는 데이터가 없는 경우의 리턴 자료형
val temp2 : (Int) -> Unit = {n:Int -> println(n)}


data class DTO(val num: Int, val score: Int) {
}

fun main(){
    {n:String->println(n)}("Kotlin의 Lambda")

    val lambdaIt:(Int)->Int = {it+100}
    println(lambdaIt(300))

    //DTO 클래스의 인스턴스 생성
    val dto1 = DTO(1,100)
    val dto2 = DTO(2,87)

    //람다 함수에 DTO 인스턴스를 대입하면 score의 값을 리턴
    val dtoMap = {dto:DTO -> dto.score}

    //dto1의 스코어와 dto2의 스코어를 연산
    println(dtoMap(dto1) + dtoMap(dto2))
}

