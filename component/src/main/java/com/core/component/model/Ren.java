package com.core.component.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("ren")
public class Ren implements Outfit{
    @Override
    public void wear() {
        System.out.println("This is Ren");
    }
}
