public class koreksi {
    // Atribut / field
    String jenis_hp;
    int tahun_pembuatan;

    // Setter method
    public void setDataHP(String jenis_hp, int tahun_pembuatan) {
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }

    // Getter untuk jenis_hp
    public String getJenisHP() {
        return this.jenis_hp;
    }

    // Getter untuk tahun_pembuatan
    public int getTahunPembuatan() {
        return this.tahun_pembuatan;
    }

    // Method utama (entry point)
    public static void main(String[] args) {
        HandPhone hp = new HandPhone();
        hp.setDataHP("Samsung", 2023);

        // Menampilkan hasil
        System.out.println("Jenis HP     : " + hp.getJenisHP());
        System.out.println("Tahun Buat   : " + hp.getTahunPembuatan());
    }
}