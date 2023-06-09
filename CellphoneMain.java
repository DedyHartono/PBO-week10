package Minggu11;

public class CellphoneMain {
    public static void main(String[] args) {
    Cellphone cp = new Cellphone("Poco", "M3");
    cp.powerOn();
    cp.volumeUp();
    cp.volumeUp();
    cp.volumeDown();
    cp.powerOff();
    cp.powerOff();
    cp.topUpPulsa(50000);
    int sisaPulsa = cp.getSisaPulsa();
    System.out.println("Sisa pulsa: " + sisaPulsa);
    cp.tambahKontak("Dedy Hartono", "085243852167");
    cp.tambahKontak("Doni", "085344123456");
    cp.lihatSemuaKontak();
    cp.cariKontak("Roni");
    cp.cariKontak("Dedy Hartono");
  }
}
