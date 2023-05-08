package com.core.component.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Girl {
    @Autowired
            @Qualifier("ren")
    Outfit outfit;

    public Girl(@Qualifier("ren") Outfit outfit) {
        this.outfit = outfit;
    }

    public void wear(){
        outfit.wear();
    }

}
