package banksim;

import java.util.List;

public class RekeningRepository implements Container {

    Bank bank;
    List<Rekening> listRekening;

    public RekeningRepository(Bank bank) {
        this.bank = bank;
        listRekening = bank.getListRekening();
    }

    @Override
    public Iterator getIterator() {

        return new RekeningIterator();

    }

    private class RekeningIterator implements Iterator {

        private int index;

        @Override
        public boolean hasNext() {

            if (index < listRekening.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Rekening next() {

            if (this.hasNext()) {
                return listRekening.get(index++);
            }
            return null;

        }

    }

}
