class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        import numpy as np

        isDuplicate = False
        if len(np.unique(nums)) != len(nums):
            isDuplicate = True
        
        return isDuplicate
