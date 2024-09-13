# Name : Isaac Watts
# Date : 04/08/2024
# Description: 
# Create Python code implementation of an array-based heap (see Arrays as HeapsLinks to an external site. section)
# Name the file using YOURLASTNAME_arrays_as_heaps.py (e.g reynolds_arrays_as_heaps.py)
# Use the following Heap as a test case:
"""
          10 
        /    \
        9     8
       / \    / \
       6  5   7  4
      / \ /
      2 1 3
"""


class Heap():
    def __init__(self):
        self.data = []

    def root(self):
        return self.data[0]
    
    def last(self):
        return self.data[-1]
    
    def left_child_index(self, index):
        return (index * 2) + 1
    
    def right_child_index(self, index):
        return (index * 2) + 2
    
    def parent_index(self, index):
        return (index-1)//2
    
    def insert(self, value):
        self.data.append(value)

        new_node_index = len(self.data) - 1


        while new_node_index > 0 and self.data[new_node_index] > self.data[self.parent_index(new_node_index)]:
            self.data[self.parent_index(new_node_index)], self.data[new_node_index] = self.data[new_node_index], self.data[self.parent_index(new_node_index)]

            new_node_index = self.parent_index(new_node_index)
    
    def delete(self):

        self.data[0] = self.data.pop()

        trickle_node_index = 0

        while self.has_greater_child(trickle_node_index):
            larger_child_index = self.calculate_larger_child_index(trickle_node_index)

            self.data[trickle_node_index], self.data[larger_child_index] = self.data[larger_child_index], self.data[trickle_node_index]

            trickle_node_index = larger_child_index

    def has_greater_child(self, index):
        return ((self.data[self.left_child_index(index)] and
                self.data[self.left_child_index(index)] > self.data[index]) 
                or 
                (self.data[self.right_child_index(index)] and 
                 self.data[self.right_child_index(index)] > self.data[index]))
    

    def calculate_larger_child_index(self, index):
        if not self.data[self.right_child_index(index)]:
            return self.left_child_index(index)
        if self.data[self.right_child_index(index)] > self.data[self.left_child_index(index)]:
            return self.right_child_index(index)
        else:
            return self.left_child_index(index)

if __name__ == '__main__':

    # Since heaps are weakly ordered, gotta initialize the array specifically for insertion.
    arr = [10, 9, 8, 6, 5, 7, 4, 2, 1, 3]
    heapObj = Heap()

    # Heapify
    for elem in arr:
        heapObj.insert(elem)
    
    print("Heap Obj:")
    print(heapObj.data)
    
    size = len(heapObj.data)

    # Left child: (current index * 2) + 1. Right child: (current index * 2) + 2.
    for i in range(size):
        print(f"Parent: {heapObj.data[i]}")
        if i*2 + 1 >= size:
            print("Left child: None")
        else:
            print(f"Left child: {heapObj.data[heapObj.left_child_index(i)]}")
        if i * 2 + 2 >= size:
            print("Right child is None")
        else:
            print(f"Right child: {heapObj.data[heapObj.right_child_index(i)]}")
        print()

    heapObj.delete()

    print("Heap obj after deletion: ")
    print(heapObj.data)