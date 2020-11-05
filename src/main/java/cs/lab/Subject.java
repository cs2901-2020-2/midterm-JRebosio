package cs.lab;

public interface Subject{
    private int a;
    private int b;
    private int c;
    private int d;
    public int GetA(){
        return a;
    }
    public int GetB(){
        return b;
    }
    public int GetC(){
        return c;
    }
    public int GetD(){
        return d;
    }
    public Subejct(int first, int second, int third, int fourth ){
        a=first;
        b=second;
        c= third;
        d=fourth;
    }
}
