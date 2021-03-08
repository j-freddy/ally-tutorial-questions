package a0378_comparing_people;

class Person {
  private String surname;
  private String forename;
  private String number;

  public Person(String surname, String forename, String number) {
    this.surname = surname;
    this.forename = forename;
    this.number = number;
  }

  public String getSurname() {
    return surname;
  }

  public String getForename() {
    return forename;
  }

  public String getNumber() {
    return number;
  }

  @Override
  public String toString() {
    return forename + " " + surname + " (" + number + ")";
  }
}