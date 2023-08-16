public class CyclicSortQuestion {
    public static void main(String [] args){
        int [] arr={3,5,2,1};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int [] nums)
    {
        int i=0;
        while(i< nums.length)
        {
            int correct=nums[i]-1;
            if(nums[i]<nums.length&&nums[i]!= nums[correct]){
                swap(nums,i,correct);
            }else{
            i++;
        }
        }
        for(int index=0;index< nums.length;index++) {
            if (nums[index]!= index+1) {
                return index;

            }

            }
        return nums.length;

        }




            static void swap(int [] nums,int first,int second){
                int temp=nums[first];
                nums[first]=nums[second];
                nums[second]=temp;
            }
        }


