package banksim;

public class AtmAsController {
    
    private Bank bank;
    private String lokasi;
    private Nasabah nasabahAktif;
    private Rekening rekeningAktif;

    public AtmAsController(Bank bank, String lokasi) {
        this.bank = bank;
        this.lokasi = lokasi;
    }

    public Bank getBank() {
        return bank;
    }

    public String getLokasi() {
        return lokasi;
    }

    public Nasabah getNasabahAktifAsModel() {
        return nasabahAktif;
    }

    public Rekening getRekeningAktifAsModel() {
        return rekeningAktif;
    }
    
    public boolean login (String pin) {
    
        if (bank.findRekeningByPin(pin)== null) {
            return false;
        }
        else {
            rekeningAktif = bank.findRekeningByPin(pin);
            nasabahAktif = bank.findNasabahById(rekeningAktif.getNasabahID());
            return true;
        }
        
    }
    
    public void logOut() {
        rekeningAktif = null;
        nasabahAktif = null;
    }
    
    public void tarik (double jumlah) {
        rekeningAktif.tarik(jumlah);
    }
    public void setor (double jumlah) {
        rekeningAktif.setor(jumlah);
    }
    public void transfer (double jumlah, String noRek) {
        rekeningAktif.tarik(jumlah);
        bank.findRekeningById(noRek).setor(jumlah);
    }
    
    public void getSaldo (){
        System.out.println("Saldo Anda :"+rekeningAktif.getSaldo());
    }
    
    public void transfer (double jumlah, Rekening rekTujuan){
        rekeningAktif.tarik(jumlah);
        rekTujuan.setor(jumlah);
       
    }
    
}
