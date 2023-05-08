import org.springframework.context.annotation.AnnotationConfigApplicationContext
import java.time.LocalDate

fun main() {
    val context = AnnotationConfigApplicationContext(AppConfig::class.java)
    val magazineContainer = context.getBean(Container::class.java) as MagazineContainer

    val articles = listOf(
        Article("Is Time Travel Possible?", "Sarah Scoles",  LocalDate.of(2023, 4, 10), 5020, 17, false),
        Article("Top 6 Science Facts for Star Wars Day", "Matt Hrodey",  LocalDate.of(2023, 5, 3), 770,  12, true),
        Article("Vikings", "Libby Romero", LocalDate.of(2020, 2, 1), 1500,  10, false)
    )

    magazineContainer.add(
        Magazine("Scientific American", "innovative research", "English", LocalDate.of(1845, 8, 28), 8733, 20, true, articles)
    )
    magazineContainer.add(
        Magazine("Discover", "science", "English", LocalDate.of(1980, 3, 4), 7529, 15, true, articles)
    )
    magazineContainer.add(
        Magazine("National Geographic", "nature", "English", LocalDate.of(1888, 5, 4), 9358, 30, false, articles)
    )
}
