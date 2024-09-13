"""
"""

def insertion(arr : list):
    for i in range(1, len(arr)):
        tmp = arr[i]

        j = i - 1 
        while j >= 0 and arr[j] > tmp:
            arr[j+1] = arr[j]
            j -= 1
        arr[j+1] = tmp

        
if __name__ == '__main__':
    arr = [4,2,7,1,3]
    print(arr)
    insertion(arr)
    print(arr)
