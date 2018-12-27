package cashflow.scala

import java.time.LocalDateTime

case class Cashflow(amount: Double, currency: String, due: LocalDateTime) {
  def this(amount: Double, due: LocalDateTime) = this(amount, "USD", due)

  def this(amount: Double) = this(amount, LocalDateTime.now())

  val settle = due.toLocalDate.plusDays(2)

  private lazy val processedAt = LocalDateTime.now

  def rollForward() = {
    val retVal = new Cashflow(amount, currency, due.plusDays(1))
    retVal.processedAt
    retVal
  }
}

object Cashflow extends App {
  val c1 = new Cashflow(12.34)
  println(c1.settle)

  val c2 = c1.rollForward()
  Thread.sleep(1000)
  println(c2.settle)
  println(c1.processedAt)
  println(c2.processedAt)
}