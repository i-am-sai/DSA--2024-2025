package sai.swaroop.Inheritance;

public class BoxPrice extends BoxWeight{
    int cost;

    BoxPrice(){ // Simple Empty constructor
        super();
        this.cost = -1;
    }

    public BoxPrice(int l, int b, int w, int weight, int price){
        super(l,b,w,weight);
        this.cost = price;
    }

}
