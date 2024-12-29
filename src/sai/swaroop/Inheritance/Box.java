package sai.swaroop.Inheritance;

public class Box {
    int l;
    int b;
    int w;

    Box(){
        this.l = -1;
        this.b = -1;
        this.w =-1;
    }

    Box(int l, int b, int w){
        this.l = l;
        this.b = b;
        this.w = w;
    }

    // Cube
    Box(int side){
        this.l = side;
        this.w = side;
        this.b = side;
    }

    Box(Box var){
        this.l = var.l;
        this.b = var.b;
        this.w = var.w;
    }

}



