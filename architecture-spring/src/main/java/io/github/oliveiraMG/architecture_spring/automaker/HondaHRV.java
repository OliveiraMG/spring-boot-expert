package io.github.oliveiraMG.architecture_spring.automaker;

import java.awt.*;

public class HondaHRV extends Car {
    public HondaHRV(Engine engine) {
        super(engine);
        setModel("HR-V");
        setColor(Color.BLACK);
        setAutomaker(Automaker.HONDA);
    }
}
