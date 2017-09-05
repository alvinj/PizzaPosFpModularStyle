package com.alspizza.pos.services

import com.alspizza.Money
import com.alspizza.pos.database.PizzaDaoInterface
import com.alspizza.pos.model.{CrustSize, CrustType, Order, Topping}

trait OrderServiceInterface {

    // implementing classes should provide their own database
    // that is an instance of PizzaDaoInterface, such as
    // MockPizzaDao, TestPizzaDao, or ProductionPizzaDao
    protected def database: PizzaDaoInterface

    def calculateOrderPrice(o: Order): Money

}
