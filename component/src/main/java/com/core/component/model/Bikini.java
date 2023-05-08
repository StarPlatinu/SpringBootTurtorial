package com.core.component.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bikini")
public class Bikini implements Outfit{

    @Override
    public void wear() {
        System.out.println("Ma bikini");
    }
}

