package Interview.randomPreparation;


/*You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.

Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).

Return intervals after the insertion.*/


import java.util.Arrays;

public class InsertIntervel {
    public static void main(String[] args) {
        int [][] intervels= {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int [] newI = {4,8};
        System.out.println(Arrays.toString(insert(intervels, newI)));
    }
    public static int[] insert(int[][] intervals, int[] newInterval) {
        int [] loc = new int[2];
        for(int i=0; i<intervals.length;i++){
            if(intervals[i][0] <= newInterval[0] && intervals[i][1] >= newInterval[0]){

                loc[0]=intervals[i][0];
            }
            else if(newInterval[1] >= intervals[i][0] && newInterval[1] <= intervals[i][1]){

                loc[1]=intervals[i][1];


            }
            else if(newInterval[1] >= intervals[i][1] && newInterval[1] <= intervals[i+1][1]){

                loc[1]=newInterval[1];

            }

        }
return loc;
    }
}
