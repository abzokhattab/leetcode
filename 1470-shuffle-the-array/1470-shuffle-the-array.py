class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        res = [None]*2*n
        k=0
        for i in range(0,n,1):
            res[k]=nums[i]
            k+=1
            res[k]=nums[i+n]
            k+=1
        return res