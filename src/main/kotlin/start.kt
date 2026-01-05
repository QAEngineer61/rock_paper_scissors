import kotlin.random.Random


fun start() {  println("Если готов жми 1")
    val ArrayStart = arrayListOf(
        "Поехали!", "Ну начнем!", "Эта битва будет легендарной!", "Покажи на что способен!")
    val ready = readln().toIntOrNull() ?: 0
    if (ready != 1) {
        stop()
    }
    else {
        val random = Random.nextInt(ArrayStart.size) // Генерируем случайный индекс
            println(ArrayStart[random])
    }
    comparison()
}