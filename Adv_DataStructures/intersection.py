# def intersection(firstArray, secondArray):
#     result = [e for e in firstArray if e in secondArray]
#     return result

# def intersection(firstArray, secondArray):
#     result = list(set(firstArray) & set(secondArray))
#     return result

def intersection(firstArray, secondArray):
    result = [e for e in firstArray if e in secondArray]
    return result

def union(firstArray, secondArray):
    res = list(set(firstArray) | set(secondArray))
    return res

print(f"Intersection: {intersection([1,2,3,4], [2,3,8,9])}")
print(f"Union: {union([1,2,3,4], [2,3,8,9])}")

def avg_of_even(array):
    even_array = [e for e in array if e & 1 == 0]
    print(even_array)
    return sum(even_array)

print(avg_of_even([1,2,7,8,10]))


def avg_celcius(farhenheit_reading : list()):
    celcius_numbers = [(temp - 32) / 1.8 for temp in farhenheit_reading]

    return sum(celcius_numbers)/len(celcius_numbers)

print(avg_celcius([80,90,100,60,70,32]))