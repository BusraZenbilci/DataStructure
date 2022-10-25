public class GeometricProgression extends Progression{

    protected long base;

    public GeometricProgression(long b , long start){
        super(start);
        base = b;
    }

    public GeometricProgression(long b) {
        this(b , 1);
    }

    public GeometricProgression() {
        this(2 , 1);
    }

    protected void advance(){
        current *= base;
    }
}
