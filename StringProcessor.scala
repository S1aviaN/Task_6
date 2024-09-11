object StringProcessor {
  // Переработанная функция в функциональном стиле
  def processStrings(strings: List[String]): List[String] = {
    // Используем filter для отбора строк длиной более 3 символов
    // и map для преобразования их в верхний регистр
    strings.filter(_.length > 3).map(_.toUpperCase)
  }

  def main(args: Array[String]): Unit = {
    val strings = List("apple", "cat", "banana", "dog", "elephant")
    val processedStrings = processStrings(strings)
    println(s"Processed strings: $processedStrings")
  }
}
