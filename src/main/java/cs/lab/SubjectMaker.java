package facade_software;

public class SubjectMaker {

    private Subject Pie;
    private Subject Bar;

    public SubjectMaker(int first, int second, int third, int fourth){
        Pie= new PieChart(first, second, third, fourth);
        Bar= new BarChart(first, second, third, fourth);
    }

    public int getAPie(){
        return Pie.GetA();;
    }

    public int getBPie(){
       return Pie.GetB();
    }

   public int getCPie(){
       return Pie.GetC();
    }

    public int getDPie(){
       return Pie.GetD();
    }


     public int getABar(){
        return Bar.GetA();;
    }

    public int getBBar(){
       return Bar.GetB();
    }

   public int getCBar(){
        return Bar.GetC();
    }

    public int getDBar(){
        return Bar.GetD();
    }

}
