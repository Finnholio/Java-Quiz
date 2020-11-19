class Holiday {
  private String name;
  private int date;
  private String month;

  public Holiday(String nameInput, int dateInput, String monthInput){
    name = nameInput;
    month = monthInput;

    if (dateInput > 0){
      date = dateInput;
    }
  }

  public Holiday(){
    name = "";
    date = 0;
    month = "";
  }

  public String getName(){
    return name;
  }

  public void changeName(String newName){
    name = newName;
  }

  public int getDate(){
    return date;
  }

  public void changeDate(int newDate){
    date = newDate;
  }

  public String getMonth(){
    return name;
  }

  public void changeMonth(String newMonth){
    month = newMonth;
  }

  public boolean inSameMonth(Holiday h){
    return (this.month == h.month);
  }

  public String toString(){
    String dateString;
    if (this.date == 1){
      dateString = "1st of " + this.month;
    }
    else if (this.date == 2){
      dateString = "2nd of " + this.month;
    }
    else if (this.date == 3){
      dateString = "3rd of " + this.month;
    }
    else {
      dateString = this.date + "th of " + this.month;
    }

    return this.name + " is on " + dateString;

  }

  public double avrDate(Holiday[] holidays){
    double avr = 0;
    for (int i = 0; i < holidays.length; i++){
      avr += holidays[i].date;
    }
    avr /= holidays.length;
    return avr;
  }
}