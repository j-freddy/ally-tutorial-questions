package a0378_comparing_people;

class SurnameComparator implements PersonComparator {
  @Override
  public int compareTo(Person A, Person B) {
    int no = A.getSurname().compareTo(B.getSurname());

    if(no > 0) return 1;
    if(no < 0) return -1;
    return 0;
  }
}

class ForenameComparator implements PersonComparator {
  @Override
  public int compareTo(Person A, Person B) {
    int no =  A.getForename().compareTo(B.getForename());

    if(no > 0) return 1;
    if(no < 0) return -1;
    return 0;
  }
}

class TelephoneNumberComparator implements PersonComparator {
  @Override
  public int compareTo(Person A, Person B) {
    int no = A.getNumber().compareTo(B.getNumber());

    if(no > 0) return 1;
    if(no < 0) return -1;
    return 0;
  }
}

class TwoTieredComparator implements PersonComparator {
  private PersonComparator fstComp;
  private PersonComparator sndComp;

  public TwoTieredComparator(PersonComparator first, PersonComparator second) {
    this.fstComp = first;
    this.sndComp = second;
  }

  @Override
  public int compareTo(Person A, Person B) {
    int result = fstComp.compareTo(A, B);

    if(result != 0) {
      return result;
    } else {
      return sndComp.compareTo(A, B);
    }
  }
}