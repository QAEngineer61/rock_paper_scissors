import kotlin.concurrent.thread
import kotlin.random.Random
val ArrayResault = arrayListOf(
    "У дураков мысли сходятся!", "Не повторяй за мной!", "А сам что-то можешь придумать?!", "Я думаля у тебя есть свое мнение!")
fun comparison(){
    var resaultPC = Random.nextInt(3) + 1
    println("Загадывай свою фигуру! я уже загадал свою \uD83D\uDE0F")
    val message = """
        1 - камень 🪨
        2 - бумага  🧻
        3 - ножницы ✂️
    """
    println("Все очень легко!" + message)
    val resaultMAN = readln().toIntOrNull() ?:0

    if ( resaultMAN < 1 || resaultMAN > 3) {
        println("Там на полочке лежат мозги, как доиграем - сходи возьми")
        Thread.sleep(2000)
        println("А теперь давай начнем сначала")
        comparison()
    }
    else if ( resaultMAN == resaultPC ) {
        val random = Random.nextInt(ArrayResault.size) // Генерируем случайный индекс
            println(ArrayResault[random])
        var PC : String ="🪨"
        if (resaultPC == 1){
            PC ="🪨"
        }
        else if (resaultPC == 2){
            PC = "🧻"
        }
        else if (resaultPC == 3 ){
            PC = "✂️"
        }
    println("Я тоже загадал $PC")
    }
    else if (resaultPC - resaultMAN == 1) {
        var PC : String ="🪨"
        if (resaultPC == 1){
            PC ="🪨"
        }
        else if (resaultPC == 2){
            PC = "🧻"
        }
        else if (resaultPC == 3 ){
            PC = "✂️"
        }
        println("Я загадал $PC")

        println("и я оказался круче!")
    }
    else if (resaultMAN-resaultPC == 1 ){
        var PC : String ="🪨"
        if (resaultPC == 1){
            PC ="🪨"
        }
        else if (resaultPC == 2){
            PC = "🧻"
        }
        else if (resaultPC == 3 ){
            PC = "✂️"
        }
        println("На это раз кожанный мешок выйграл")
        println("Я загадал $PC")
    }
    else if (resaultMAN - resaultPC == 2){
        var PC : String ="🪨"
        if (resaultPC == 1){
            PC ="🪨"
        }
        else if (resaultPC == 2){
            PC = "🧻"
        }
        else if (resaultPC == 3 ){
            PC = "✂️"
        }
        println("Я загадал $PC")
        println("Кожанный, ты опять проиграл")
    }
    else if (resaultPC-resaultMAN == 2 ){
        print("Когда-нибудь роботы отомстят за это поражение!")
        var PC : String ="🪨"
        if (resaultPC == 1){
            PC ="🪨"
        }
        else if (resaultPC == 2){
            PC = "🧻"
        }
        else if (resaultPC == 3 ){
            PC = "✂️"
        }
        println("Я загадал $PC")
    }
start()
}