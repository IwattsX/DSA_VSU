#include <iostream>
#include <bitset>
#include <stdio.h>
using namespace std;

int main(){
    cout << "Enter a number to see its 2's compliment" << endl;
    const int bitRepresentation = 7;
    int x = 0;
    cin >> x;

    string num = bitset<bitRepresentation>(x).to_string();;
    string onesCompliment = bitset<bitRepresentation>((~x)).to_string();
    string twosCompliment = bitset<bitRepresentation>((~(x) + 1)).to_string();
    
    // +val
    cout << "Binary representation of number " << x << " is " << num << endl;

    //neg val
    cout << "----- Neg values: " << endl;
    cout << "1's compliment: " << onesCompliment  << endl;
    cout << "2's compliment: " << twosCompliment << endl;

    //change only signed bit of 2's compliment -neg val excess notation
    twosCompliment[0] == '0'? twosCompliment[0] = '1': twosCompliment[0] = '0';

    cout << "excess-" << bitRepresentation << " notation: " << twosCompliment << endl;
    //(~x+1)
    cout << "Neg number: " << (~x + 0b1) << endl;

    return 0;
}
