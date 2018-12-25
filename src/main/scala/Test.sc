import scala.annotation.tailrec

2 + 2
4 * 5

def factorial(num: Int): BigInt = {
  def loop(n: Int, fact: BigInt): BigInt = {
    if (n <= 0) fact
    else loop(n - 1, n * fact)
  }

  loop(num, 1)
}

factorial(300)