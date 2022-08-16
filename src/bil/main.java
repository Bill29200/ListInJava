package bil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class main {

	public static void main(String[] args) {
		
		System.out.println("Resumé sur les Streams(AnyMatch, Filter et collectors, Map et FlatMap...");
		List<Humain> humainList = Arrays.asList(
			new Humain("Duppond" , "Pierre", 41,123456789,Arrays.asList("Bill","Ben")),
			new Humain("karim" , "benzima", 35,569874123,Arrays.asList("paul","Bill")),
			new Humain("Celine" , "Dion", 29,357849162,Arrays.asList("Rebeca")),
			new Humain("Zidan" , "zineeddine", 54,369852147,Arrays.asList("zizou")),
			new Humain("Malika" , "dream", 25,951263847,Arrays.asList("Helena"))
				);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Liste globale");
		for (Humain humain : humainList) {
			System.out.println(humain);
		}
		
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("1// anyMatch return a boolean // humainList.stream().anyMatch(cdt)------------------------------");
		System.out.println("");
		System.out.println(" Example exist une personne >=30 ");
		// anyMatch renvoie un boolean
		// exist-il des persons dont l'age est >= 30
		System.out.println("");
		if(humainList.stream().anyMatch(person -> person.getAge()>=30))
		{
			System.out.println("Il ya bien une personne agée plus de 30 ans ");
		}
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("2//filter return a list// humainList.stream().filter(person -> person.getAge()>=30).collect(Collectors.toList());");
		////////////////////////////////////////////////////////////////////////
		System.out.println("Example");
		// filter 
		// liste des personnes ayant l'age >=30
		List<Humain> viexPersonnesList = humainList.stream().filter(person -> person.getAge()>=30).collect(Collectors.toList());
		viexPersonnesList.forEach(pers -> System.out.println(pers.toString()));
		System.out.println("------------------------------------------------------------------------------------------");
////////////////////////////////////////////////////////////////////////////////
		System.out.println("3// map //humainList.stream().filter(person -> person.getAge()>=30).map(pers -> pers.getNumeroSocial()).collect(Collectors.toList());");
		System.out.println(" Example map : les numsoc des personnes ayant age >=30");
        System.out.println("");
		// Stream::map
		// les numSociales des personnes ayant l'age >=30
		List<Integer> NumSocPersSup30= humainList.stream().filter(person -> person.getAge()>=30).map(pers -> pers.getNumeroSocial()).collect(Collectors.toList());
		NumSocPersSup30.forEach(pers -> System.out.println(pers));
		System.out.println("");
		System.out.println("------------------------------------------------------------------------------------------");
/////////////////////////////////////////////////////////////////////////////////
		System.out.println("4//FlatMap //humainList.stream().filter(person -> person.getAge()>=30).flatMap(pers -> pers.getAutresPrenomList().stream()).collect(Collectors.toList());");
		System.out.println(" Example FlatMap : list des liste des prenoms des personnes ayant age >=30");
		System.out.println("");
		//Stream::FlatMap
		//les autres prenoms des peronnes ayant un age >=30
		List<String> autresPrenomList = humainList.stream().filter(person -> person.getAge()>=30).flatMap(pers -> pers.getAutresPrenomList().stream()).collect(Collectors.toList());
		System.out.println(autresPrenomList);
		System.out.println("");
		System.out.println("------------------------------------------------------------------------------------------");
		//////////////////////////////////////////////////////////////////////
		System.out.println("5// Count // autresPrenomList.stream().count()");
		System.out.println("Example nbr of elet in the list");
		System.out.println(autresPrenomList.stream().count());
		System.out.println("------------------------------------------------------------------------------------------");
		//////////////////////////////////////////////////////////////////////
		System.out.println("6// findFirst // autresPrenomList.stream().findFirst()");
		System.out.println("Example the first elet in the list");
        System.out.println("");
		System.out.println(autresPrenomList.stream().findFirst());
		System.out.println("------------------------------------------------------------------------------------------");
		//////////////////////////////////////////////////////////////////////
		System.out.println("7// distinct // autresPrenomList.stream().distinct().collect(Collectors.toList())");
		System.out.println("distinct : Displaying a list without redundancy...");
		// findFirst
		
		System.out.println(autresPrenomList.stream().distinct().collect(Collectors.toList()));


	}

}


