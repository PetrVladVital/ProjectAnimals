package animals.entities;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Kecha";
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
