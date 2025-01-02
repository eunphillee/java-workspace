package object.day5;

public class Rectangle {

    String shapeName;
    int width;
    int height; 


    public int getArea() {
        return width * height; 
    }

    public int getLength() {
        return 2* (width * height);
    }
    
    public String draw(){
       
       return String.format("draw %s 📗 (%d * %d)", 
                  this.shapeName, this.width, this.height);
    }

} 


     
