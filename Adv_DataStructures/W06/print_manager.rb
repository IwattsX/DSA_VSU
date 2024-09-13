class PrintManager
    def initialize
      @queue = Queue.new
    end
  
    def queue_print_job(document)
      @queue.enqueue(document)
    end
  
    def run
      # Each time this loop runs, we read the document
      # at the front of the queue:
      while @queue.read
        # We dequeue the document and print it:
        print(@queue.dequeue)
      end
    end
  
    private
  
    def print(document)
      # Code to run the actual printer goes here.
      # For demo purposes, we'll print to the terminal:
      puts document
    end
  end
  