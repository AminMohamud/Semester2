package Opgave1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {

	public static void main(String[] args) {
		List<Person> list = List.of(
				new Person("Bent", 25), new Person("Susan", 34),
				new Person("Mikael", 60), new Person("Klaus", 44),
				new Person("Birgitte", 17), new Person("Liselotte", 9));
		List<Person> persons = new ArrayList<Person>(list);
		System.out.println(persons);
		System.out.println();

		System.out.println("Personer under 30" + findAll(list,person -> person.getAge() < 30));
		System.out.println("___________________________");
		System.out.println("Personer der har et navn der indeholder bostavet i: " + findAll(list,person -> person.getName().contains("i")));
		System.out.println("____________________________");
		System.out.println("Personer der har et navn der starter med S" + findAll(list,person -> person.getName().charAt(0) == 'S'));
		System.out.println("____________________________");
		System.out.println("Personer der har et navn der med længde mindst 6 og og alder under 40" + findAll(list,person -> person.getName().length() >= 6 && person.getAge() < 40));
//		Den første person der hedder Klaus
//		System.out.println(findFirst(persons, p -> p.getName().equals("Klaus")));
//		Den første person der har et navn med længden 4
//		System.out.println(findFirst(persons, p -> p.getName().length() ==4 ));

		//1a Find den første person i listen af personer med alderen 44.
		//System.out.println(findFirst(list,person -> person.getAge() == 44));

		//1b Find den første person i listen af personer med et navn der starter med S.

		//System.out.println(findFirst(persons, p -> p.getName().charAt(0) == 'S'));

		//1c Find den første person i listen med et navn der indeholder mere end et i
//		Indsæt kode herunder der kalder metoderne findFirst og findAll som beskrevet i opgave 1
		/**persons.forEach(p -> {
			if(p.getName().indexOf('i') != p.getName().lastIndexOf('i')) {
				System.out.println(("Første person med navn der indeholder mere end et I:" + p.getName()));
			}
		}); '*/

		//1d Finder den første person i listen af personer med en alder der er lig længden af navnet.
		persons.forEach(p -> {
			if (p.getAge() == p.getName().length())
				System.out.println("Første person i listen af personer med navnelængde = alder: " + p.getName());
		});


		//1e Programmer en findAll methode.


	}

	/**
	 * Returns from the list the first person
	 * that satisfies the predicate.
	 * Returns null, if no person satisfies the predicate.
	 */
	public static Person findFirst(List<Person> list, Predicate<Person> filter) {
		for (Person p : list) {
			if (filter.test(p))
				return p;
		}
		return null;
	}

	public static List findAll(List<Person> list, Predicate<Person> filter) {
		ArrayList findAllListe = new ArrayList();

		for (Person p : list) {
			if (filter.test(p)) {
				findAllListe.add(p);
			}
		}
		return findAllListe;
	}





}
