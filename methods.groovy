def print_welcome() {
  println("Welcome Groovy!!!");
}
print_welcome();

def print_sum(int x1, int y1) {
  println("Result: " + (x1+y1));
}
print_sum(12,90);
print_sum(90,90);

def get_diff(int x1, int y1) {
  return (x1-y1);
}
int result = get_diff(2,1);
print(result);
