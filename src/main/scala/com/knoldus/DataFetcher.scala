package com.knoldus

import com.typesafe.config.Config

abstract class DataFetcher extends  TaxSlabs {

  val productConfig: Config = conf.getConfig("product")

  val itemsPrize: Map[String, Double] = Map(
    "Pizza" -> productConfig.getDouble("Pizza"),
    "Fish" -> productConfig.getDouble("Fish"),
    "ColdDrink" -> productConfig.getDouble("ColdDrink"),
    "Paracetamol" -> productConfig.getDouble("Paracetamol"),
    "Paracetamol350" -> productConfig.getDouble("Paracetamol350")
  )


}
