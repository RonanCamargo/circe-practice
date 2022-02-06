package ronancamargo.entities

import ronancamargo.entities.CarState.CarState

case class Car2(brand: String, model: String, state: CarState, owner: Option[PersonWithDocumentEnum])
