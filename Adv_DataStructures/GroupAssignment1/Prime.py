"""
Group #3: Prime sequence
Names: Isaac Watts, Iyanna Thweatt, He Gao
Description: All prime numbers from 1 to n
"""

# sieve
def prime(num):
    prime = [True for i in range(num+1)]

    p = 2
    while (p * p <= num):
        if (prime[p] == True):
 
            # Updating all multiples of p
            for i in range(p * p, num+1, p):
                prime[i] = False
        p += 1
 
    for p in range(2, num+1):
        if prime[p]:
            print(p)
 
 


if __name__ == '__main__':
    number = int(input("Enter a number and find the prime numbers from 1 to N: "))
    prime(number)


