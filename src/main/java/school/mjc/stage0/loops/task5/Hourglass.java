package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for(int i=0;i<height
                ;i++){
            if(i<height/2){
                for (int j=1;j<=i;j++) System.out.print(" ");
                for (int j=1;j<=height-2*i;j++) System.out.print("8");
            }else{
                for (int j=1;j<=height-i-1;j++) System.out.print(" ");
                for (int j=1;j<=2*(i-height/2)+1;j++) System.out.print("8");
            }
            System.out.println();
        }
    }
}
