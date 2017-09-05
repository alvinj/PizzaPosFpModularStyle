package com.alspizza.pos.services

import com.alspizza.pos.database.MockPizzaDao

object MockDbOrderService extends AbstractOrderService {

    val database = MockPizzaDao

}
