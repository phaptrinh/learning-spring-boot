package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Girl {
    @Autowired
    Outfit outfit;

    Girl(Outfit outfit) {
        this.outfit = outfit;
    }
}
