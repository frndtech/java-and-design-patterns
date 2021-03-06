package com.isa.patterns.factory.simplefactory;

public class StaticSimplePizzaFactory {

  public static Pizza createPizza(String type) {
    Pizza pizza = null;

    if (type.equals("cheese")) {
      pizza = new CheesePizza();
    } else if (type.equals("clam")) {
      pizza = new ClamPizza();
    }

    return pizza;
  }
}
