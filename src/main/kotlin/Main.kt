import kotlin.system.exitProcess

fun main() {
    println("Добро пожаловать! Ты готов сыграть со мной в игру?")
    Thread.sleep(2000)
    start()
}


fun stop (){
    println("game over")
    exitProcess(1)

}