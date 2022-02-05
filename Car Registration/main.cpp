#include <iostream>
using namespace std;
int main() {
  int weight;
  cout << "Enter the weight of your car in pounds to see the registration cost!\n";
  cin >> weight;
  if(weight<=0) {
    cout << "There was an error.";
  }
  else if(weight<=1500) {
    cout << "The cost will be $150.50";
  }
  else if(weight<=2500) {
    cout << "The cost will be $225.75";
  }
  else if(weight<=3000) {
    cout << "The cost will be $300.25";
  }
  else {
    cout << "The cost will be $351.37";
  }
}
