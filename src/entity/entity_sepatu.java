package entity;

public class entity_sepatu {
    public String merk,jenis;
    public int harga;

    public entity_sepatu(String merk, String jenis, int harga) {
        this.merk = merk;
        this.jenis = jenis;
        this.harga = harga;
    }

    public String getMerksepatu() {
        return merk;
    }

    public void setMerksepatu(String merk) {
        this.merk = merk;
    }

    public String getJenissepatu() {
        return jenis;
    }

    public void setJenissepatu(String jenis) {
        this.jenis = jenis;
    }

    public int getHargasepatu() {
        return harga;
    }

    public void setHargasepatu(int harga) {
        this.harga = harga;
    }
}
