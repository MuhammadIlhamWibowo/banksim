package banksim;

import java.util.ArrayList;
import java.util.List;

public class Rekening {

    private String rekeningID;
    private String pin;
    private double saldo;
    private String nasabahID;
    private String nasabahName;

    private List<String> logTransaction = new ArrayList<>();

    public Rekening(String rekeningID, String pin, double saldo) {
        this.rekeningID = rekeningID;
        this.pin = pin;
        this.saldo = saldo;
    }

    public String getRekeningID() {
        return rekeningID;
    }

    public String getPin() {
        return pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void tarik(double jumlah) {
        saldo = saldo - jumlah;
    }

    public void setor(double jumlah) {
        saldo = saldo + jumlah;
    }

    public void transfer(double jumlah, Rekening rekTujuan) {
        tarik(jumlah);
        rekTujuan.setor(jumlah);
    }

    public void setNasabahID(String nasabahID) {
        this.nasabahID = nasabahID;
    }

    public void setNasabahName(String nasabahName) {
        this.nasabahName = nasabahName;
    }

    public String getNasabahID() {
        return nasabahID;
    }

    public String getNasabahName() {
        return nasabahName;
    }

    public List<String> getLogTransaction() {
        return logTransaction;
    }

    @Override
    public String toString() {
        return "Rekening{" + "rekeningID=" + rekeningID + ", pin=" + pin + ", saldo=" + saldo + ", nasabahID=" + nasabahID + ", nasabahName=" + nasabahName + '}';

    }

    public void addLogTransaction(String message) {
        logTransaction.add(message);
    }

}
