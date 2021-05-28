package conditionnal;

public class WhileNumberPlayer {

    int limit;

    public WhileNumberPlayer(int limit) {
        this.limit = limit;
        System.out.println("int is equal to " + this.limit);
    }

    public void printSquaresUptoLimit(){

    //for player = 30, output should be 1 4 9 16 25
        int square ;
        int i = 0;

        while(i*i <= limit) {
            square = i*i;
            System.out.println("Square is " + square);
            i++;
        }
    }

    public void printCubesUptoLimit(){
        int cube ;
        int i = 0;

        while(i*i*i <= limit) {
            cube = i*i*i;
            System.out.println("Cube is " + cube);
            i++;
        }

    }
}
