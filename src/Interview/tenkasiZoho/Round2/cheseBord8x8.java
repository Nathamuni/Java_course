package Interview.tenkasiZoho.Round2;

public class cheseBord8x8 {
    public static void main(String[] args) {
        int [] start = {0,2};
        int [] target ={3,1};

        int i = start[0];
        int j = start[1];
        sayMyName(i,j,target);

    }

    private static void sayMyName(int i,int j, int[] target) {
        System.out.println("["+i +" , "+j+"]");
        //====== diagonal ===================================
        if(i==target[0]  && j == target[1]) return;

        else if(i>target[0]  && j>target[1]){
            sayMyName(i-1,j-1,target);
        }

        else if(i<target[0]  && j<target[1]){
            sayMyName(i+1,j+1,target);
        }
        else if(i<target[0]  && j>target[1]){
            sayMyName(i+1,j-1,target);
        }
        else if(i>target[0]  && j<target[1]){
            sayMyName(i-1,j+1,target);
        }
        //=====================================================
       else if(i==target[0] && j<target[1]){
            sayMyName(i,j+1,target);
        }
       else if(i==target[0] && j>target[1]){
            sayMyName(i,j-1,target);
        }
       else if(i<target[0] && j==target[1]) {
            sayMyName(i+1,j,target);
        }
       else if(i>target[0] && j==target[1]) {
            sayMyName(i-1,j,target);
        }
        else System.out.println("Enter Valid input");
    }
}
