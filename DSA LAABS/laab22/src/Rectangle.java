public class Rectangle {
    double length= 1.0;
    double width= 1.0;
    public void setLength(double length){
        if (length>0.0 && length<20.0){
            this.length=length;
        }else {
            System.out.println("provide proper length");
        }


    }
    public void setWidth(double width){

        if(width>0.0 && width<20.0){
            this.width=width;
        }else
            System.out.println("provide proper width:");

    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;

    }
    public void Perimeter(){

    double p=2*(length*width);

        System.out.println("primeter :"+p);
    }public void Area(){
        double A=width*length;
        System.out.println("Area :"+A);
    }

    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.setLength(5.0);
        r.setWidth(10.0);
       r.getLength();
       r.getWidth();
       r.Perimeter();
       r.Area();
    }

}
