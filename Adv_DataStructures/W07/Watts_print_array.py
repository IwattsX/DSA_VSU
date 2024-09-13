# Name: Isaac Watts
# Date: 02/27/2024
# Description:
'''
    Write a recursive function that prints all the numbers 
    (and just numbers) in the given array.
'''

def print_array_elements(arr):
    # base case
    if not arr:
        return
    else:

        if(isinstance(arr[0], list)):
            # recursively going through the elements in the nested list to only print numbers
            print_array_elements(arr[0])
        else:
            print(arr[0])
        
        # Recursively call the function with list slicing
        print_array_elements(arr[1::])

# DRIVER CODE - This is where you will call the 
# print_array_elements function
 
array = [1, 2, 3, 
         [4, 5, 6], 
         7,
         [8,
          [9, 10, 11,
           [12, 13, 14]
           ]
          ],[15, 16, 17, 18, 19,
             [20, 21, 22,
              [23, 24, 25,
               [26, 27, 29]
               ], 30, 31], 
             32], 
          33]
 

if __name__ == '__main__':
    print_array_elements(array)
