package mx.edu.utng.ugarcia.navigationdreawer;

/**
 * Created by alo_m on 16/02/2018.
 */

public class Room {
    private int imageId;
    private String name;
    private String descripción;
    private String precio;

    public Room(int imageId, String name, String descripción, String precio){
        this.imageId=imageId;
        this.name=name;
        this.descripción=descripción;
        this.precio=precio;
    }



    public Room(){
        this(R.mipmap.ic_launcher_round, "unamed", "without description", "0.00");
    }

    public int getImageId() {
        return imageId;
    }

    public String getName() {
        return name;
    }

    public String getDescripción() {
        return descripción;
    }

    public String getPrecio() {
        return precio;
    }
}
