import java.util.*
import kotlin.Comparator

fun main() {
    //크기가 변경되지 않는 배열 생성
    var ar: Array<String> = arrayOf(
        "Java", "JavaScript", "Kotlin", "Swift"
    )
    //전체 데이터 접근
    for (temp in ar) {
        print("${temp}\t")
    }
    println()

    //인덱스를 이용한 접근
    for (idx in ar.indices) {
        print("${idx}:${ar[idx]}\t")
    }
    println()

    for (idx in 0..ar.size - 1) {
        print("${idx}:${ar.get(idx)}\t")
    }
    println()

    //iterator를 이용하는 방법
    var iterator = ar.iterator()
    while (iterator.hasNext()) {
        print("${iterator.next()}\t")
    }
    println()

    //ar의 정렬된 결과를 저장하기
    var ar1 = ar.sortedArrayDescending()
    for (temp in ar1) {
        print("${temp}\t")
    }
    println()

    var pl = arrayOf<String>(
        "apexdd", "runa", "DancingYui", "Odori", "Timber", "Orignal", "Abaibros", "AKABoardShop", "VictorBoardShop"
    )
    pl.sortBy({it.toUpperCase()})
    for (temp in pl) {
        print("${temp}\t")
    }
    println()

    //num, name, price를 가지는 데이터 클래스
    data class Item(val num:Int, val name:String, val price:Int){}
    var Items = arrayOf<Item>(
        Item(1, "방그라", 280000),
        Item(2, "오도리", 350000),
        Item(3, "아펙스DD40", 315000),
        Item(4, "썰씨", 220000),
        Item(5, "스투라투스 팩션", 180000)
    )
    //Item에는 크기비교하는 메소드가 없어서 정렬을 하려고하면 예외 발생
    //Items.sort()

    /*
    Items.sortBy({it.name})
    for (temp in Items) {
        print("${temp}\n")
    }
    println()
    */

    Items.sortWith(Comparator<Item>{
            item1, item2 -> when {
            item1.price > item2.price -> -1
            item1.price == item2.price -> 0
            else -> 1
        }
    })
    for (temp in Items) {
        print("${temp}\n")
    }
    println()

    //2개의 1차원 배열 생성
    var pl1 = arrayOf<String>("Java", "Objective-C")
    var pl2 = arrayOf<String>("Kotlin", "Swift")

    //2개의 1차원 배열로 2차원 배열 생성
    var matrix = arrayOf<Array<String>>(pl1, pl2)
    //Arrays는 배열을 가지고 작업을 수행해주는 static Class
    println(Arrays.toString(matrix))
    //1차원 배열로 변환
    var pAr = matrix.flatten()
    println(pAr)

}