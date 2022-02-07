package ronancamargo.entities

import ronancamargo.entities.DocumentType.DocumentType

case class PersonWithDocumentEnum(name: String, age: Int, document: DocumentEnum)
case class DocumentEnum(documentNumber: String, documentType: DocumentType)

object DocumentType extends Enumeration {
  type DocumentType = Value
  val DNI, CI = Value
}
