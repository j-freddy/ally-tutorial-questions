package a0378_comparing_people;

import java.util.HashSet;
import java.util.Set;

class Demo {
  public static Person findMin(Set<Person> people, PersonComparator comparator) {
    return people
        .stream()
        .reduce((a, b) -> {
          if(comparator.compareTo(a, b) == 1) {
            return b;
          } else {
            return a;
          }
        })
        .orElse(null);
  }

  public static void main(String[] args) {
    //Aliases
    PersonComparator F = new ForenameComparator();
    PersonComparator S = new SurnameComparator();
    PersonComparator T = new TelephoneNumberComparator();

    //Test data
    Set<Person> people = new HashSet<>();
    people.add(new Person("Ca", "Gf", "0284-3068"));
    people.add(new Person("Qe", "Sp", "0284-3425"));
    people.add(new Person("Lf", "Cs", "0284-3940"));
    people.add(new Person("Ca", "Ag", "0284-3203"));
    people.add(new Person("Ca", "Ag", "0284-3130"));

    PersonComparator comparator = new TwoTieredComparator(S, new TwoTieredComparator(F, T));

    System.out.println(findMin(people, comparator));
  }
}
