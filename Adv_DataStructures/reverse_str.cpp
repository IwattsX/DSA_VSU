#include <iostream>

std::string backwards_string(std::string s){
    if(s == ""){
        return "";
    }
    return s.back() + backwards_string(s.substr(0, s.size()-1));
}

int main(){
    std::string userInput;
    std::cout << "Enter a string: ";
    std::cin >> userInput;

    std::cout << "Reversed string is " << "'"<< backwards_string(userInput) << "'" << std::endl;
    return 0;
}