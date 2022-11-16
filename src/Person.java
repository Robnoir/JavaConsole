import javax.sound.midi.SysexMessage;
import java.util.ArrayList;

public class Person
{

    //Attribut
    public String firstname;
    public String lastname;
    public int age;

    public static int count = 0;
    public static ArrayList<Person> persons = new ArrayList<Person>();

    //Konstruktor
    public Person(String firstname,String lastname,int age)
    {
        //Applivcera värden till attribut
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        //Öka Count med +1
        count++;

        //Spara objekt i statisk lista
        persons.add(this);

    }

    //Birthday metod
    public void birthday ()
    {
        // Öka ålder med +1
        this.age++;
        //Skriv ut meddelande till consol'
        System.out.println(this.firstname + " är nu " + this.age + " år gammal.");



    }

}
