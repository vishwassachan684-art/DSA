class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        lst = []
        maxCandies = max(candies)
        
        for i in candies:
            
            if i + extraCandies >= maxCandies:
                lst.append(True)
            else:
                lst.append(False)
        return lst

