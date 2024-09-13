"""
"""

def bubble_sort(arr:list, size : int):
    swaps = 0
    comparisons = 0
    for i in range(size):
        swapped = False
        for j in range(0, size - i - 1):
            comparisons += 1
            if arr[j] > arr[j+1]:
                (arr[j+1], arr[j]) = (arr[j] , arr[j+1])
                swaps += 1
                swapped = True
        if not swapped:
            break
    print(swaps, comparisons)





if __name__ == '__main__':
    arr = [4,2,7,1,3]
    bubble_sort(arr, len(arr))
    print(arr)
