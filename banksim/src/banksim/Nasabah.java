package banksim;

public class Nasabah {

    private String name;
    private String id;

    public Nasabah(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Nasabah {" + "name=" + name + ", id=" + id + '}';
    }

}
