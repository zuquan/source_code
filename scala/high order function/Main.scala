package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))

  val s: Set = x => x > 1 && x < 10

  printSet(s)

  printSet(map(s, x => x * x))
}
