import java.time.LocalDate

data class Article(
    val name: String,
    val author: String,
    val dateofwriting: LocalDate,
    val numberofwords: Int,
    val numberoflinks: Int,
    val originallanguage: Boolean
): Comparable<Article> {
    override fun compareTo(other: Article): Int {
        val cmp = name.compareTo(other.name)
        return if (cmp != 0) cmp else numberofwords.compareTo(other.numberofwords)
    }
}
