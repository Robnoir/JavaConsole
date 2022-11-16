import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
       //Anropa metod för input output
       // inputOutput();

        //Skapa objekt av klassen Person

        Person P1 = new Person("Robert", "Svart", 28);

        System.out.println("Ditt namn är " + P1.firstname);
        new Person("Bob","Bobsson",34);
        new Person("Kalle","Johansson", 65);

        for (Person person : Person.persons)
        {
            person.birthday();
        }


    }

    //Ny statisk funktion
    public static void inputOutput()
    {
        System.out.println("Hello world!");
        int count = 10;
        count +=5;

        System.out.println(count);

        //Kommentar
        //Hämta data från användaren


        Scanner scan = new Scanner(System.in);

        System.out.print("Skriv ut ditt namn: ");
        String input = scan.next();

        System.out.println("Ditt namn är " + input);


        for (int i =0;i<5;i++)
        {
            System.out.println(i+1);
            if (i==3)
            {
                int y =4;
                System.out.println(i*y);

            }
            else
            {
                System.out.println("I är inte lika med 3");
            }
            //Local Scope =Variabel Y finns inte här
            // i +=y;


        }

    }

}