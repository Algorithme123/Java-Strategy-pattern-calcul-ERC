import java.util.Scanner;

import context.Employe;
import strategy.IGRCalculStrategy;

public class Main {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception{
        Employe employe = new Employe();
        Scanner scanner = new Scanner(System.in);
        boolean fin=false;
        while(!fin)
        {
            System.out.println("Nom de l'algorithme IGR : ");
            String algoName = scanner.nextLine();
            System.out.println("Donner votre salaire mensuel : ");
            float salaireBrutMensuel = scanner.nextFloat();
            IGRCalculStrategy strategy = (IGRCalculStrategy)Class.forName(algoName).getDeclaredConstructor().newInstance();
            employe.setStrategy(strategy);
            employe.getSalaireNetMensuel(salaireBrutMensuel);
            System.out.println("--------------------------------------");
        }


    }

}