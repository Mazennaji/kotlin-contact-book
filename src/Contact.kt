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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Contact) return false
        return phone == other.phone
    }

    override fun hashCode(): Int = phone.hashCode()
}