#include <iostream>
#include <set>
#include <vector>
using namespace std;

set<int> intersection(std::vector<int> a, std::vector<int> b){
    set<int> aSet(a.begin(), a.end());
    set<int> bSet(b.begin(), b.end());
    return aSet & bSet;
}

int main(){
    std::vector<int> A = {1,2,4,4,5};
    std::vector<int> B = {4, 9 , 1};

    std::set<int> AB = intersection(A, B);
    for(int x : AB){
        cout << x << endl;
    }
    return 0;
}