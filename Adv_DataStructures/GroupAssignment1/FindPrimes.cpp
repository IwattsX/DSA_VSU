#include <iostream>
#include <vector>

std::vector<bool> AllPrimes(int n){
    // Using a Sieve
    
    if(n < 0){
        std::vector<bool> res;
        return res;
    }
    std::vector<bool> prime(n + 1, true);

    for(int i = 2; i * i <= n; i++){
        if(prime[i]){
            for(int k = i * i; k<=n; k += i){
                prime[k] = false;
            }
        }
    }
    
    return prime;
}

void printPrimes(std::vector<bool> primeList){
    std::cout << "{";
    for(int i = 2; i<primeList.size(); i++){
        if(i == primeList.size() - 1){
            std::cout << i;
            break;
        }
        if(primeList[i]){
            std:: cout << i << ", ";
        }
    }
    std::cout << "}" << std::endl;
}

int main(){
    int n;
    std::cout << "Enter a number: " << std::endl;
    std::cin >> n;

    std::vector<bool> primes = AllPrimes(n);

    printPrimes(primes);
    return 0;
}