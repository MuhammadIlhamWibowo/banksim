package banksim;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private final String name;
    private final List<Rekening> listRekening = new ArrayList<>();
    private final List<Nasabah> listNasabah = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public void addRekening(Rekening rek) {
        listRekening.add(rek);
    }

    public void addNasabah(Nasabah nasabah) {
        listNasabah.add(nasabah);
    }

    public void registrasiNasabah(Nasabah nasabah, Rekening rekening) {
        addNasabah(nasabah);
        rekening.setNasabahID(nasabah.getId());
        rekening.setNasabahName(nasabah.getName());
        addRekening(rekening);

    }

    public void printAllRekening() {

        for (Rekening rek : listRekening) {
            System.out.println(rek);
        }
    }

    public String getName() {
        return name;
    }

    public Rekening findRekeningById(String id) {
        for (Rekening rekening : listRekening) {

            if (rekening.getRekeningID().equals(id)) {
                return rekening;
            }

        }
        return null;
    }

    public Nasabah findNasabahById(String id) {

        for (Nasabah nasabah : listNasabah) {
            if (nasabah.getId().equals(id)) {
                return nasabah;
            }
        }
        return null;
    }

    public Rekening findRekeningByPin(String pin) {
        for (Rekening rekening : listRekening) {
            if (rekening.getPin().equals(pin)) {
                return rekening;
            }
        }
        return null;
    }

    public List<Rekening> getListRekening() {
        return listRekening;
    }

    public List<Nasabah> getListNasabah() {
        return listNasabah;
    }

}
