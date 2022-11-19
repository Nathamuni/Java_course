package Interview.zoho;

public class SecondMaxEle {
    // to find the second max element without swapping
    public static void main(String[] args) {
        int []a ={8,7,6,5,4,3};

        int max=0,secMax=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max) { // used to switch values if the next(rightside) element is grater
                secMax = max;
                    max = a[i];
            }
           if(a[i]<max && a[i]>secMax) // used when the element on left is grater
                secMax = a[i];

        }System.out.println(secMax);
    }
}
