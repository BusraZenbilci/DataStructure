public class Progression {

    protected long current;

    public Progression() {  //Constructs a progression starting at zero.
        this(0);
    }

    public Progression(long start) {  //Constructs a progression with given start value
        current = start;
    }

    public long nextValue(){
        long answer = current;
        advance();
        return answer;
    }

    protected void advance(){   //Advances the current value to the next value of the progression
        current++;
    }

    public void printProgression(int n){  //Prints the next n values of the progression, separated by spaces.
        System.out.print(nextValue());

        for(int j=1 ; j<n ; j++){
            System.out.print(" " + nextValue());
        }
        System.out.println();
    }


}
