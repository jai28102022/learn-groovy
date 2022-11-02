int x1 = 20;

if (x1 == 0) {
  println("x1 is null");
} else if (x1 > 0) {
  println("x1 is a +ve number");
} else {
  println("x1 is a -ve number");
}


int weekday = 0;

switch(weekday) {
  case 0: println("Sun");
          break;
  case 1: println("Mon");
          break;
  case 2: println("Tue");
          break;
  case 3: println("Web");
          break;
  case 4: println("Thu");
          break;
  case 5: println("Friday");
          break;
  case 6: println("Sat");
          break;
  default: println("Invalid Input");
           
}
