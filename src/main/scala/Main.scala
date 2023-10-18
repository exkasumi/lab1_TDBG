object Main {
  def main(args: Array[String]) {
    val souce_list = List.fill(20)(10).map(scala.util.Random.nextInt)
    println(souce_list)
    createNewList(souce_list)
  }

  def createNewList[A](list: List[A]) = {
    val unique_list = list.distinct
    println(unique_list)
  }

}