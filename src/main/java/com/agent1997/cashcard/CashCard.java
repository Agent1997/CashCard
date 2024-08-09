package com.agent1997.cashcard;

import org.springframework.data.annotation.Id;

record CashCard(@Id Long id, Double amount) {
}
