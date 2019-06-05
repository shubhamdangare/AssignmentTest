package com.knoldus

import com.typesafe.scalalogging._

class BillPayment extends TaxCalculator with LazyLogging {

  logger.info("Started Service......")

  def getTotalBillAmount(products: Map[String, List[(String, Double)]]): Double = {
    logger.info(s"total Payment to Done is ${getTotalBillForProducts(products)}")
    getTotalBillForProducts(products)
  }

  def getTotalBillForProducts(itemList: Map[String, List[(String, Double)]]): Double = {

    val productListWithType = itemList.mapValues(_.toList)
    productListWithType.foldLeft(0.0)((r, c) => r + calculateTaxForItems(c))

  }

}
