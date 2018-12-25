package cashflow.scala

import java.time.LocalDateTime

object HelloWorld extends App {
  val c = new Cashflow(12.34, "USD", LocalDateTime.now())
  print(c)
}
