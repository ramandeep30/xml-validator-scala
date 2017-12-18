
/**
 * Application to call XML-Validator
 */

object ValidatorApplication extends App {
  val xmlValidator = new XMLValidator
  private val xmlPath = "src/main/resources/books.xml"
  private val xsdPath = "src/main/resources/books.xsd"
  if (xmlValidator.validate(xmlPath, xsdPath)) {
    println("successfully validated")
  } else {
    println("invalid file")
  }
}

