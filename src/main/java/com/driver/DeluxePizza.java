package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        if(isVeg){
            SetB("Price Of The DeluxePizza: 450\n");
            SetP(450);
        }else{
            SetB("Price Of The DeluxePizza: 600\n");
            SetP(600);
        }
    }
}
