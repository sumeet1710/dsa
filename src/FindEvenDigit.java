public class FindEvenDigit {
    public static void main(String[] args) {
        int [] arr={12,345,6754,33,38,587};

        System.out.println(findNumbers( arr));
    }
    static int digits(int num){
        while( num<0){
            num=num*-1;}
        while(num==0){
            num=1;
        }
        int count=0;
        while(num>0){

            count++;
            num=num/10;
        }
        return count;
    }
    static boolean even(int num){
        int numberOfDigits=digits(num);
        return numberOfDigits%2==0;
    }
    static int findNumbers(int[]arr){
        int count=0;
        for(int num:arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
}
