class Contact(
    val name: String,
    var phone: String,
    var email: String? = null
) {
    fun details(): String = """
        Name : $name
        Phone: $phone
        Email: ${email ?: "N/A"}
    """.trimIndent()

    override fun toString(): String = "$name ($phone)"
}