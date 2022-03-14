import models.Cast
import models.Movie
import models.Production
import java.util.Scanner

fun main() {
    val movieList = mutableListOf<Movie>()
    var repeat = true
    println("Update Movie Information")
    println("=======================")
    while (repeat){
        var scanner = Scanner(System.`in`)
        println("Enter Movie Name")
        var name = scanner.nextLine()
        scanner = Scanner(System.`in`)
        println("Enter Movie Rating")
        var rating = scanner.nextDouble()
        scanner = Scanner(System.`in`)
        println("Enter movie budget")
        var budget = scanner.nextDouble()
        scanner = Scanner(System.`in`)
        println("Enter producer name")
        var pName = scanner.nextLine()
        scanner = Scanner(System.`in`)
        println("Select Production: ")
        println("------------------")
        print("1. Bad Robot Productions \t2. Skydance Media \t3. Universal Pictures ")
        println()
        var choice = scanner.nextInt()
        var prodName: String = ""
        when(choice){
            1 -> {
                prodName = "Bad Robot Productions"

            }
            2 -> {
                prodName = "Skydance Media"

            }
            3 -> {
                prodName = "Universal Pictures"

            }
        }
        val castList = productionCastMap[prodName]!! //non null assertion
        val movie = Movie(name = name,
            rating = rating,
            production = Production(
                productionName = prodName,
                producerName = pName,
                budget = budget),
            casting = castList
        )
        movieList.add(movie)
        print("Add another movie info? Press Y to continue or Press N to exit: ")
        val choice2 = scanner.next()
        repeat = choice2.lowercase() == "y"
    }
    movieList.forEach {
        println(it)
    }
}