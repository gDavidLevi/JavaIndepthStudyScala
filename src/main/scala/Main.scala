object Main extends App {
  // a la Java
  System.out.println("Hello, Scala!"); // точка с запятой не обязательны
  println("Hello, World!")

  // Переменные
  var a = 5; // var - переменная неопределенного типа
  var b = "Hello!"
  val f = "Test" // val - final-переменная неопределенного типа
  var c: Int = 5 // переменная типа Int

  // Функции
  def addOne(a: Int) = a + 1 // всегда возвращает значение
  def plus(a: Int) = a + 1

  var plusVar = plus _ //пробел и нижнее подчеркивание - присваиваем функцию в переменную
  println(plusVar(1))

  // Объект класса
  var obj = new Geek(5)
  println(obj.go(6))

  // Цикл
  for (i <- 1 to 10) {
    print(i)
    print(" ")
  }
}

/**
  * Класс Geek
  *
  * @param a Int
  */
class Geek(a: Int) {
  def go(b: Int): Int = a + b
}

/**
  * Интерфейс FirstTrait
  */
trait FirstTrait {
  def test(x: Int) // абстрактный метод
}

/**
  * Интерфейс SecondTrait
  */
trait SecondTrait {
  def second(y: Int): Int = y + 5
}

/**
  * Класс TestClass имплементирует интерфейсы
  */
class TestClass extends FirstTrait with SecondTrait {
  override def test(x: Int): Unit = x * 2

  override def second(y: Int): Int = super.second(y)
}


