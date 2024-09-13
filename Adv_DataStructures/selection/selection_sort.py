"""
"""

def selection_sort(arr : list):

    for i in range(len(arr)):
        min_idx = i
        
        for j in range(i+1, len(arr)):
            if arr[j] < arr[min_idx]:
                min_idx = j
        (arr[i], arr[min_idx]) = (arr[min_idx], arr[i])


if __name__ == '__main__':
    arr = [4,2,7,1,3]
    selection_sort(arr)
    print(arr)

