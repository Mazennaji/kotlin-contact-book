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
}