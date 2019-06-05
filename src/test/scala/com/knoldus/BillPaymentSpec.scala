package com.knoldus

import org.scalatest.WordSpec
import com.typesafe.scalalogging._

class BillPaymentSpec extends WordSpec with LazyLogging {

  logger.info("Running test cases")
  val billPayment = new BillPayment()

  "PaymentService#bill" when {

    val itemsTest: Map[String, List[(String, Double)]] = Map(
      "Food" -> List(("Pizza", 3), ("Fish", 3)),
      "Medical" -> List(("Paracetamol", 1),("Paracetamol350", 10))
    )

    "GST is Not Correct" should {

      "have total amount greater then zero" in {
        assert(billPayment.getTotalBillAmount(itemsTest) > 0)
      }

      "give correct bill total" in {

        assertResult(812.0){
        billPayment.getTotalBillAmount(itemsTest)
        }
      }
    }
  }

}
