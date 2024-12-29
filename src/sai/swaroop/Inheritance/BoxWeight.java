package sai.swaroop.Inheritance;

public class BoxWeight extends Box {
   int weight;

   public BoxWeight(int l, int b, int w, int weight){
       super(l, b, w);
       this.weight = weight;
   }

    public BoxWeight() {
        super();
        this.weight = -1;
    }
}
