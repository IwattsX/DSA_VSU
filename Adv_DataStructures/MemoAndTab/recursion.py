from timeit import default_timer as timer
from datetime import timedelta
def fib_m(n : int):
    if n < 0:
        raise Exception("n can't be less than 0")
    if n == 0 or n == 1:
        return n
    return fib_m(n - 1) + fib_m(n-2)

if __name__ == '__main__':
    n = int(input("Enter a number: "))
    start = timer()
    print(fib_m(n))
    end = timer()
    print(timedelta(seconds=end-start))