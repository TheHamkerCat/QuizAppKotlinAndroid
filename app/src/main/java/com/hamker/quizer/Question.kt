package com.hamker.quizer

data class Question(
    val id: Int,
    val text: String,
    val image: Int,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correctAnswer: String
)


fun getQuestions(): ArrayList<Question> {
    val questions = ArrayList<Question>()

    questions.add(
        Question(
            0,
            "To which programming language does this mascot belongs?",
            R.drawable.kotlin_mascot,
            "Java",
            "Marshmallow",
            "C++",
            "Kotlin",
            "Kotlin"
        )
    )
    questions.add(
        Question(
            1,
            "Which language is the easiest to learn?",
            R.drawable.languages,
            "Kotlin",
            "C++",
            "Java",
            "Python",
            "Python"
        )
    )

    questions.add(
        Question(
            2,
            "Which one is used to implement an infinite loop?",
            R.drawable.loop,
            "For loop",
            "Infinix loop",
            "While loop",
            "Repeat loop",
            "While loop"
        )
    )

    questions.add(
        Question(
            3,
            "What exactly is the 'Int' keyword used in programming languages?",
            R.drawable.datatypes,
            "Loop",
            "Data type",
            "Collection",
            "International",
            "Data type"
        )
    )
    questions.add(
        Question(
            4,
            "Which is the entry-point function in kotlin?",
            R.drawable.kotlin,
            "Main",
            "Top",
            "Enter",
            "Func",
            "Main"
        )
    )

    return questions
}