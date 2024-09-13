from timeit import default_timer as timer
from datetime import timedelta

def fib_t(n):
    res = [1, 1]
    [res.append(res[i-1] + res[i-2]) for i in range(2, n)]
    return res[-1]


if __name__ == '__main__':
    user = int(input("Enter a num: "))
    start = timer()
    print(fib_t(user))
    end = timer()
    print(timedelta(seconds=end-start))