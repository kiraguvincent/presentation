package com.example.wazitoecommerce.models

class Doctor {
    var name:String = ""
    var specialisation:String = ""
    var contact:String = ""
    var imageUrl:String = ""
    var id:String = ""

    constructor(name: String, specialisation: String, contact: String, imageUrl: String, id: String) {
        this.name = name
        this.specialisation = specialisation
        this.contact = contact
        this.imageUrl = imageUrl
        this.id = id
    }

    constructor()

}