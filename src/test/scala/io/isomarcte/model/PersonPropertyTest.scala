package io.isomarcte.model

import io.circe._
import io.circe.parser._
import io.circe.syntax._

import org.scalacheck.Properties
import org.scalacheck.Prop

object PersonPropertyTest extends Properties("Person") {

  property("JSON serialization and deserialization") =
    Prop.forAll{
      (p: Person) =>
      val personJsonEncode: Json = p.asJson
      val personString: String = personJsonEncode.spaces2
      val personDecode: Either[Error, Person] = decode[Person](personString)
      println(p)
      println(personJsonEncode)
      println(personString)
      println(personDecode)
      Right(p) == personDecode
    }
}
