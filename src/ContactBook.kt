class ContactBook {
    private val contacts = mutableListOf<Contact>()   // mutable list of contacts

    fun add(contact: Contact) {
        if (contacts.contains(contact)) {
            println("Contact with phone ${contact.phone} already exists.")
        } else {
            contacts.add(contact)
            println("Added: $contact")
        }
    }
}