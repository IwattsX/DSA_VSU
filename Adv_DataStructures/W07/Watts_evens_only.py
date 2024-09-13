# Name: Isaac Watts
# Date: 02/27/2024
# Description:
'''
    Use recursion to write a function that accepts an array 
    of numbers and returns a new array containing just the 
    even numbers.
'''

def isEven(x : int):
    return (x & 1) == 0

# List comprehension idea way:
# res = [print(e, end=" ") for e in array if isEven(e)]
def return_evens(array):
    # base case
    if not array:
        return []
    res = list()


    if isEven(array[0]):
        res.append(array[0])
    
    # Add the result from this run to the result of all other return_evens run
    return res + return_evens(array[1:])

# DRIVER CODE - This is where you will call the return_evens
# function

array = [1,2,4,12,13,
         28,37,42,44,
         55,64,90,91,
         100,104,288,
         359,360,720,1000]

if __name__ == '__main__':
    print(return_evens(array))
