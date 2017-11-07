package io.isomarcte.model

import io.circe._
import io.circe.generic.semiauto._

import org.scalacheck.Arbitrary
import org.scalacheck.Gen

final case class Person(firstName: String, lastName: String, age: Short)

object Person {
  // Typeclass Instances //
  implicit val personEncoder: Encoder[Person] = deriveEncoder[Person]
  implicit val personDecoder: Decoder[Person] = deriveDecoder[Person]
  implicit val arbPerson: Arbitrary[Person] = Arbitrary(
    for {
      fn <- Gen.oneOf("John", "Matthew")
      ln <- Gen.oneOf("Smith", "Newton")
      age <- Gen.posNum[Short]
    } yield Person(fn, ln, age)
  )
}
