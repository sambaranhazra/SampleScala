package cashflow.scala

import java.time.LocalDateTime

case class Cashflow(amount: Double, currency: String, due: LocalDateTime)