import java.time.LocalDate

data class Magazine(
    val name: String,
    val subject: String,
    val language: String,
    val dateofestablishment: LocalDate,
    val ISSN: Int,
    val recommendedprice: Int,
    val periodicity: Boolean,
    val listofarticles: List<Article>
): Comparable<Magazine> {
    override fun compareTo(other: Magazine): Int {
        val cmp = name.compareTo(other.name)
        return if (cmp != 0) cmp else recommendedprice.compareTo(recommendedprice)
    }
}
