fun main() {
    val book = ContactBook()

    while (true) {
        println(
            """
            
            ===== Contact Book =====
            1. Add contact
            2. Remove contact
            3. Search contact
            4. List all contacts
            5. Exit
            """.trimIndent()
        )
        print("Choose an option: ")

        when (readln().trim()) {
            "1" -> {
                print("Name: ")
                val name = readln().trim()
                print("Phone: ")
                val phone = readln().trim()
                print("Email (leave blank to skip): ")
                val email = readln().trim().ifBlank { null }
                book.add(Contact(name, phone, email))
            }
            "2" -> {
                print("Phone to remove: ")
                book.remove(readln().trim())
            }
            "3" -> {
                print("Search name: ")
                val results = book.search(readln().trim())
                if (results.isEmpty()) {
                    println("No matches found.")
                } else {
                    results.forEach { println(it.details()); println() }
                }
            }
            "4" -> book.listAll()
            "5" -> {
                println("Goodbye! Total contacts: ${book.count}")
                return
            }
            else -> println("Invalid option, try again.")
        }
    }
}