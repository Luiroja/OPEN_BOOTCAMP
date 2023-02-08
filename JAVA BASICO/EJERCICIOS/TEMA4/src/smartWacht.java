public class smartWacht extends  smartDevice {
    boolean isWaterResist;

    public smartWacht() {

    }

    public smartWacht(String nombreDispositivo, String fabricante,
                      String sistemaOperativo,
                      String color, Integer year,
                      boolean ram, boolean apps,
                      boolean isWaterResist) {
        super(nombreDispositivo, fabricante, sistemaOperativo, color, year, ram, apps);
        this.isWaterResist = isWaterResist;
    }
}
