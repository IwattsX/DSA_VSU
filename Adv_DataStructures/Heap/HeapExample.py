from heapq import heapify, heappop, heappush
import random


randNums = [random.randint(0,100) for e in range(10)]

print(f"The list is {randNums}")
print("--------")


heap1 = []
heapify(heap1)

heap2 = []
heapify(heap2)

[heappush(heap1, e) for e in randNums]
[heappush(heap2, e * -1) for e in randNums]

print(f"Min_Heap before pop {heap1}")

li2 = [e*-1 for e in heap2]

print(f"Max_Heap before pop {li2}")
print()

x1 = heappop(heap1)
x2 = heappop(heap2)

print(f"{x1} was popped from the heap: {heap1}")

li2 = [e*-1 for e in heap2]
print(f"{x2 * -1} was popped from the heap: {li2}")