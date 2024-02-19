import java.util.Scanner;

public class essaiexception {
    public static void main(String[] args) {
        int a, b, res;
        Scanner clavier = new Scanner(System.in);
        a = clavier.nextInt();
        b = clavier.nextInt();

        try {
            res = a / b;
            System.out.println("le résultat de " + a + " divisé par " + b + " est " + res);
        } catch (ArithmeticException e) {
            System.out.println("Oops ! Un problème dans la division.");
            System.out.println("Le message officiel est : " + e.getMessage());
        }

        System.out.println("Fin du programme");
    }
}
// le programme ne s'éxécute pas ,correctement car la division par 0 est interdite dpnc le message fin de programme ne s'affiche pas
//Le programme affichera qu'il y a un problème dans la division.
//Le message "Fin du programme" sera également affiché.
//Le message d'erreur officiel correspondant à une telle exception sera : "Division by zero".