package question2;

public class Geometry {
    private String type;
    private String color;

    public static int surface(int longueur, int largeur){
        return longueur*largeur;
    }
    public static int perimeter(int cote){
        return cote*4;
    }

    public void setType(String type){
        this.type=type;
    }

    public String getType(){
        return this.type;
    }

    public String toString(){
        return "Type:".concat(this.type);
    }

    public boolean equals(Geometry geometry){
        return this.getType().equals(geometry.getType());
    }
}


