class TwoSum():
    def __init__(self):
        self.hashtable = {}
        self.arr = []

    def add(self, num):
        for elem in self.arr:
            self.hashtable[elem+num] = True
        self.arr.append(num)
    
    def find(self, total):
        if total in self.hashtable:
            return True
        return False

# ts = TwoSum()
# ts.add(1)
# ts.add(3)
# print(ts.find(4))
# print(ts.find(7))