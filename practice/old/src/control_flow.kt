//// If Control Flow
//class NameMatch(val name1: String, val name2: String) {
//
//    val cap1: String
//    val cap2: String
//
//    init {
//        cap1 = name1.capitalize()
//        cap2 = name2.capitalize()
//    }
//
//    fun checker() {
//        if (cap1 == cap2) {
//            println("They are a match")
//        }
//        else {
//            println("They are not a match")
//        }
//    }
//}
//// When Control Flow
//class NumbersToWords(val number: Int) {
//    fun convert() {
//        when (number) {
//            1 -> println("one")
//            2 -> println("two")
//            3 -> println("three")
//            else -> {
//                println("Number is not between 0 or 4")
//            }
//        }
//    }
//}
//
//// For Control Flow
//class L(val L_title: String) {
//    val items = mutableListOf<String>()
//    fun addWord(word: String) { items.add(word) }
//    fun show_list() { for (i in items) print(i + " ") }
//}
//// Do While
//class Numbers() {
//    var x: Int = 0
//    fun printN() {
//        do { x = x + 1; println(x) } while(x <= 10)
//    }
//}
//// Return Control Flow
//class DoubleNum(val num: Int) {
//    fun doubleNum(): Int {
//        return 2 * num;
//    }
//}
// Continue & Break Control Flow
class ConBre() {
    fun skipNum(n: Int) {
        val x: String
        for (x in 1..10) {

            if (x == n) {
                continue
            } else {
                println(x)
            }
        }
    }

    fun breakNum(n: Int) {
        for (x in 1..10) {
            if (x == n) {
                break
            } else {
                println(x)
            }
        }
    }
}
fun main() {
//    // If Control Flow
//    val newName = NameMatch("Daniel", "Daniel")
//    newName.checker()
//    // When Control Flow
//    val numTowords = NumbersToWords(1)
//    numTowords.convert()
//    // For Control Flow
//    val newList = L("Alist")
//    newList.addWord("Car")
//    newList.addWord("cat")
//    newList.show_list()
//    // Do While Control Flow
//    val numbers = Numbers()
//    numbers.printN()
//    // Return Control Flow
//    val dnum = DoubleNum(2)
//    println(dnum.doubleNum())
// Continue & Break Control Flow
    val cb = ConBre()
    cb.skipNum(2)
    cb.breakNum(5)
}