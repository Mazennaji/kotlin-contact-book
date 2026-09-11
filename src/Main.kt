fun main() {
    val book = ContactBook()

    book.add(Contact("Alice", "12345", "alice@mail.com"))
    book.add(Contact("Bob", "67890"))
    book.add(Contact("Charlie", "11111"))
    book.add(Contact("Duplicate", "12345"))

    println("\n--- All Contacts ---")
    book.listAll()

    println("\n--- Search 'a' ---")
    val results = book.search("a")
    results.forEach {
        println(it.details())
        println()
    }

    println("--- Remove 67890 ---")
    book.remove("67890")

    println("\n--- After Removal ---")
    book.listAll()

    println("\nTotal contacts: ${book.count}")
}