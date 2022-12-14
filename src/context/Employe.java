package context;

import strategy.IGRGhanaCalculStrategy;
import strategy.IGRCalculStrategy;

public class Employe {

    private IGRCalculStrategy strategy;

    public String cin;
    public float salaireBrutMensuel;

    public Employe(String cin, float salaireBrutMensuel) {
        this.cin = cin;
        this.salaireBrutMensuel = salaireBrutMensuel;
    }

    public float getSalaireNetMensuel(float salaireBrutMensuel)
    {
        float iGR= this.strategy.calculIGR(salaireBrutMensuel);
        float salaireBrutAnnuel = salaireBrutMensuel*12-iGR;
        return salaireBrutAnnuel/12;
    }

    public Employe() {
        this.strategy = new IGRGhanaCalculStrategy();
    }

    public void setStrategy(IGRCalculStrategy strategy)
    {
        this.strategy = strategy;
    }
}
