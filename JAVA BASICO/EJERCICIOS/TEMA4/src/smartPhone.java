import java.lang.reflect.Array;

public class smartPhone extends smartDevice{
    String modelCamara;
    String [] videoGames = {};
    boolean auriculares;

    public smartPhone () {

    }

    public smartPhone(String nombreDispositivo, String fabricante,
                      String sistemaOperativo, String color,
                      Integer year, boolean ram, boolean apps,
                      String modelCamara, String[] videoGames,
                      boolean auriculares) {
        super(nombreDispositivo, fabricante, sistemaOperativo, color, year, ram, apps);
        this.modelCamara = modelCamara;
        this.videoGames = videoGames;
        this.auriculares = auriculares;
    }
}
