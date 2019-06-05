package com.knoldus

trait Billable {

  def calculateTaxForItems(items: (String, List[(String, Double)])): Double

  def getTotalBillForProducts(products: Map[String, List[(String, Double)]]): Double

}
