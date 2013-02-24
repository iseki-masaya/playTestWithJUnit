package models

case class Users()

object Users {
  def get() : List[Map[Symbol,Any]] = {
    List(Map('name -> "Mario", 'message -> "きのこうまい"),
         Map('name -> "Luigi", 'message -> "たまには活躍したい"),
         Map('name -> "Peach", 'message -> "毎度捕まってだるい"),
         Map('name -> "Kuppa", 'message -> "築城がめんどくさい")
        )
  }
}