"""
Group #3: Factorial sequence
Names: Isaac Watts, Iyanna Thweatt, He Gao
Description: Write a fibonacci sequence that
"""

def fib(n) -> list:
    if n < 0:
        return -1
    li = [0, 1]
    for i in range(2, n):
        li.append(li[i-2] + li[i-1])

    return li


if __name__ == '__main__':
    number = int(input("Enter a number and find the fibonnacci sequence of it: "))
    print(fib(number))


