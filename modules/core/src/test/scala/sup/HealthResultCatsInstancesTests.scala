package sup

import cats.kernel.laws.discipline.{EqTests, MonoidTests}
import cats.tagless.laws.discipline.FunctorKTests
import cats.tests.CatsSuite
import sup.CatsTaglessInstances._
import org.scalacheck.ScalacheckShapeless._
import scala.util.Try

class HealthResultCatsInstancesTests extends CatsSuite {
  checkAll("FunctorK[HealthResult]", FunctorKTests[HealthResult].functorK[Try, Option, List, Int])
  checkAll("Monoid[HealthResult[Option]]", MonoidTests[HealthResult[Option]].monoid)
  checkAll("Eq[HealthResult[Option]]", EqTests[HealthResult[Option]].eqv)
}
