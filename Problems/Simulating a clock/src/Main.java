class Clock {

  int hours = 12;
  int minutes = 0;

  public void next() {
    minutes++;

    if (minutes == 60) {
      if (hours == 12) {
        hours = 0;
      }

      minutes = 0;
      hours++;
    }
  }
}