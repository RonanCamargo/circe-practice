package ronancamargo.semiauto

import ronancamargo.util.FileManager

object InvalidDocumentPersonCodec extends App {
  val jsonFileName = "02.invalid-document-person"
  val json: String = FileManager.readJson(jsonFileName)

}
