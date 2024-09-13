"""
Name : Isaac Watts
Date: 02/20/2024
Description: printManager for first, second, and third documents inside of a queue in order
Translated ruby code
"""

# implementing a queue by using a list
class queue():
    def __init__(self):
        self.q = list()
        
    
    def enqueue(self, val):
        self.q.append(val)
    
    def read(self):
        # This will return the first element but not remove it
        if self.q:
            return self.q[0]
        else:
            return None
        
    def dequeue(self):
        # This one will remove the first element and return it
        if self.q:
            return self.q.pop(0)
        else:
            return None
    

class PrintManager():
    # initialize 
    def __init__(self):
        self.queue = queue()
    
    # append the document into the queue
    def queue_print_job(self, document):
        self.queue.enqueue(document)
    
    # function that will print out everything in the queue
    def run(self):
        while self.queue.read():
            self.__print(self.queue.dequeue())
    
    # Make the print function private
    def __print(self, document):
        print(document)



if __name__ == '__main__':
    print_manager = PrintManager()
    print_manager.queue_print_job("First Document")
    print_manager.queue_print_job("Second Document")
    print_manager.queue_print_job("Third Document")
    print_manager.run()