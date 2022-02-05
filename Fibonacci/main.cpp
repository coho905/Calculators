#include <iostream>
using namespace std;

int main()
{
    int number1 = 0, number2 = 1, nextnum = 0, n, count=3;
    cout << "Enter the number of terms you would like (a positive number): ";
    cin >> n;
    cout << number1 << ", " << number2 << ", ";
    while(count <= n) {
      nextnum = number1 + number2;
      cout << nextnum << ", ";
      number1 = number2;
      number2 = nextnum;
      nextnum = number1 + number2;
      count++;
    }
    return 0;
}
