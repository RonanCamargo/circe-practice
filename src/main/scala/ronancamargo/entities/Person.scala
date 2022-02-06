package ronancamargo.entities

case class Person(name: String, age: Int, document: Document)
case class Document(documentNumber: String, documentType: String)
