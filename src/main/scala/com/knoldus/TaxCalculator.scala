package com.knoldus

import com.typesafe.scalalogging.LazyLogging

trait TaxCalculator  extends DataFetcher  with LazyLogging  {

  def calculateTaxForItems(item: (String, List[(String, Double)])): Double = {
    val tax = taxSlab(item._1)

    val price = item._2.map(value => {
      logger.info(s"product Name  ${value._1} and quantity ${value._2} ======= ${itemsPrize(value._1) * value._2}")
      itemsPrize(value._1) * value._2
    }).sum

    val taxAmount = (tax / 100) * price
    logger.info(s"total Amount for ${item._1} is ${taxAmount + price} with GST ${tax}")
    taxAmount + price

  }
}
