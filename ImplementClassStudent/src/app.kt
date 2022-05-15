fun main(){
    val student = Student("Joe")
    student.show_student()
    student.add_quiz(24)
    student.add_quiz(24)
    student.add_quiz(25)
    student.get_total_score()
    student.get_avg_score()
}

class Student(val name: String) {
    var total_score: Int = 0
    var number_of_quizzes: Int = 0

    fun show_student() {
        println(name)
    }

    fun add_quiz(score: Int) {
        total_score += score
        number_of_quizzes += 1
    }

    fun get_total_score() {
        println(total_score)
    }

    fun get_avg_score() {
        if (number_of_quizzes == 0) { return }
        else { println(total_score / number_of_quizzes)}
    }
}

