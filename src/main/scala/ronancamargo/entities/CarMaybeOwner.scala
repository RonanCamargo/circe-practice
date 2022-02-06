package ronancamargo.entities

import ronancamargo.entities.CarState.CarState

case class CarMaybeOwner(brand: String, model: String, state: CarState, owner: Option[PersonWithDocumentEnum])