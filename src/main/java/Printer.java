public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaper(){
        return this.paper;
    }

    public int getToner(){
        return  this.toner;
    }

    public void print(int pages, int copies){
        if (this.paper - pages * copies >= 0 && this.toner - pages * copies >= 0){
        this.paper = this.paper - pages * copies;
        this.toner = this.toner - pages * copies;
    }}


}
