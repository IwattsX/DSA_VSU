"""
Group #3: Factorial sequence
Names: Isaac Watts, Iyanna Thweatt, He Gao
Description: Write for a factorial of a number
"""

def factorial(n) -> int:
    if n < 0:
        return -1
    if n == 1 or n == 0:
        return 1

    res = 1
    for i in range(2, n+1):
        res *= i
    return res


if __name__ == '__main__':
    number = int(input("Enter a number and find the factorial of it: "))
    print(factorial(number))


