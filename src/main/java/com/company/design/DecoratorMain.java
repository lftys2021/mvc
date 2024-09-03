package com.company.design;

import com.company.design.decorator.A3;
import com.company.design.decorator.A4;
import com.company.design.decorator.A5;
import com.company.design.decorator.Audi;
import com.company.design.decorator.AudiDecorator;
import com.company.design.decorator.ICar;

public class DecoratorMain {
    public static void main(String[] args) {
        ICar audi = new Audi(1000);
        audi.showPrice();

        ICar audi3 = new A3(audi,"A3");
        audi3.showPrice();
        ICar audi4 = new A4(audi,"A4");
        audi4.showPrice();
        ICar audi5 = new A5(audi,"A5");
        audi5.showPrice();
    }
}
