def binarySearch(array, value):
    lower_bound = 0
    upper_bound = len(array) - 1

    while lower_bound <= upper_bound:
        midpoint = (lower_bound+upper_bound)//2
        value_at_midpoint = array[midpoint]

        if value_at_midpoint == value:
            return midpoint
        
        elif value_at_midpoint > value:
            upper_bound = midpoint - 1

        elif value_at_midpoint < value:
            lower_bound = midpoint + 1
    return None

if __name__ == '__main__':
    print(binarySearch([3, 17, 75, 80, 202], 22))
    print(binarySearch([3, 17, 75, 80, 202], 202))