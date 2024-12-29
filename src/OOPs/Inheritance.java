package OOPs;


class Box {
    int l;
    int b;
    int w;
    Box(int l, int b, int w){
        this.l =l;
        this.b=b;
        this.w =w;
    }

    void message(){
        System.out.println("This is box dimensions from parent class : ");
    }

    void dimensions(){
        System.out.println("length: "+ l + "breadth: "  + b + "width:  "  + w);
    }


    // Cube
    Box(int side){
        this.l = side;
        this.b = side;
        this.w = side;
    }
}

class BoxWeight extends Box {
    int wt;

    public BoxWeight(int l, int b, int w, int wt){
        super(l,b,w);
        this.wt =wt;
    }

    void message(){
        super.message();
        System.out.println("This is from child class1 which includes weight of the box");
    }
    @Override
    public void dimensions(){
        System.out.println("length: "+ l + "breadth: "  + b + "width:  "  + w + " weight: " + wt);
    }
}

class BoxPrice extends BoxWeight {
    int cost;

    public BoxPrice(int l, int b,int w, int wt, int cost){
        super(l,b,w,wt);
        this.cost =cost;
    }
    @Override
    public void dimensions() {
        System.out.println("length: " + l + "breadth: " + b + "width:  " +  w + " weight: " + wt + "Price: "+ cost);
    }
}



public class Inheritance {
    public static void main(String[] args) {

        Box a = new Box(1, 2, 3);
        a.message();
        a.dimensions();
        Box b = new BoxWeight(2,3,4,5);
        b.message();
        b.dimensions();
       BoxPrice c = new BoxPrice(3,4,5,6,7);
        c.dimensions();
    }
}
