import java.util.Iterator;

public class main {
    public static void main(String[] args) {

        PersonCollection personCollection = new PersonCollection();
        Person rasmus = new Person("Rasmus");
        Person silas = new Person("Silas");
        Person mads = new Person("Mads");
        personCollection.add(rasmus);
        personCollection.add(silas);
        personCollection.add(mads);


        personCollection.forEach(person -> System.out.println(person));
        System.out.println();

        Iterator<Person> iterator = personCollection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }






    }


}
