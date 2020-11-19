class Main {
  public static void main(String[] args) {
    Holiday indDay = new Holiday("Independance Day", 4, "July");
    Holiday halloween = new Holiday("Halloween", 31, "October");

    System.out.println(halloween.toString());
    System.out.println(indDay.toString());

    System.out.println("It is " + indDay.inSameMonth(halloween) + " that " + indDay.getName() + " and " + halloween.getName() + " are in the same month.");

    Holiday[] avrDate = {indDay, halloween};
    System.out.println("The avr date of " + halloween.getName() + " and " + indDay.getName() +" is "+ indDay.avrDate(avrDate));



  Movie starwars = new Movie("Star Wars: The Force Awakens", "Walt Disney Studios Motion Pictures", "PG-13");
  Movie dogMovie = new Movie("A Dog's Journey", "A Dog's Journey", "PG");

  
  }
}