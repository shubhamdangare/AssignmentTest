package com.knoldus

import com.typesafe.config.{Config, ConfigFactory}

abstract class TaxSlabs {

  val conf: Config = ConfigFactory.load()

  val taxConfig: Config = conf.getConfig("TaxSlab")

  val taxSlab: Map[String, Double] = Map(
    "Food" -> taxConfig.getInt("Food"),
    "Medical" -> taxConfig.getInt("Medical"),
    "Alcohol" -> taxConfig.getInt("Alcohol")
  )
}
