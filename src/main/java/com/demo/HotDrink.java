package com.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

public interface HotDrink {
    void prepareHotDrink();
}
@Controller
class Tea implements HotDrink{
    @Override
    public void prepareHotDrink() {
        System.out.println("Preparing Tea");
    }
}

@Repository
class ExpressTea implements HotDrink{
    @Override
    public void prepareHotDrink() {
        System.out.println("Preparing Express Tea");
    }
}
