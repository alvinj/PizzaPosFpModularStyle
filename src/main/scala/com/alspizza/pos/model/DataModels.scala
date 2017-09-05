package com.alspizza.pos.model

case class Pizza (
    crustSize: CrustSize,
    crustType: CrustType,
    toppings: Seq[Topping]
) {
    override def toString =
        s"""
        |  Pizza ($crustSize, $crustType), toppings = $toppings""".stripMargin
}

// TODO should `pizzas` here use an Option?
case class Order (
    pizzas: Seq[Pizza],
    customer: Customer
) {
    override def toString =
        s"""
           |Customer ($customer)
           |Pizzas: $pizzas
           |""".stripMargin

}

case class Customer (
    name: String,
    phone: String,
    address: Address
)

case class Address (
    street1: String,
    street2: Option[String],
    city: String,
    state: String,
    zipCode: String
)

sealed trait Topping
case object Cheese extends Topping
case object Pepperoni extends Topping
case object Sausage extends Topping
case object Mushrooms extends Topping
case object Onions extends Topping

sealed trait CrustSize
case object SmallCrustSize extends CrustSize
case object MediumCrustSize extends CrustSize
case object LargeCrustSize extends CrustSize

sealed trait CrustType
case object RegularCrustType extends CrustType
case object ThinCrustType extends CrustType
case object ThickCrustType extends CrustType







