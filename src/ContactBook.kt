class ContactBook {
    private val contacts = mutableListOf<Contact>()

    fun add(contact: Contact) {
        if (contacts.contains(contact)) {
            println("Contact with phone ${contact.phone} already exists.")
        } else {
            contacts.add(contact)
            println("Added: $contact")
        }
    }

    fun remove(phone: String) {
        val found = contacts.find { it.phone == phone }
        when (found) {
            null -> println("No contact with phone $phone")
            else -> {
                contacts.remove(found)
                println("Removed: $found")
            }
        }
    }

    fun search(query: String): List<Contact> =
        contacts.filter { it.name.lowercase().contains(query.lowercase()) }

    fun listAll() {
        if (contacts.isEmpty()) {
            println("Contact book is empty.")
            return
        }
        for (i in contacts.indices) {
            println("${i + 1}. ${contacts[i]}")
        }
    }
}