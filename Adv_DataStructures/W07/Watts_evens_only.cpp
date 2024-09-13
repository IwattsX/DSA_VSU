#include <iostream>
#include <vector>

std::vector<int> returnEvens(const std::vector<int>& array) {
    std::vector<int> res;

    if (array.size() == 0) {
        return res;
    }

    if ((array[0] & 1) == 0) {
        res.push_back(array[0]);
    }

    // Concatenate the result of returnEvens with the remaining elements
    std::vector<int> recursiveResult = returnEvens(std::vector<int>(array.begin() + 1, array.end()));
    res.insert(res.end(), recursiveResult.begin(), recursiveResult.end());

    return res;
}

int main() {
    std::vector<int> array = {1,2,4,12,13,
         28,37,42,44,
         55,64,90,91,
         100,104,288,
         359,360,720,1000};
    
    std::vector<int> EvenOnly = returnEvens(array);
    for (const int &x : EvenOnly) {
        std::cout << x << " ";
    }

    return 0;
}
