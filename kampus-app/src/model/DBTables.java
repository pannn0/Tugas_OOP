package model;

import java.util.ArrayList;
import java.util.List;

public class DBTables {
    public ArrayList<Mahasiswa> dataMahasiswa = new ArrayList<>();
    public List<Prodi> dataProdi = new ArrayList<>();

    public boolean prodiExists(int prodiId) {
        for (Prodi prodi : dataProdi) {
            if (prodi.getId() == prodiId) {
                return true;
            }
        }
        return false;
    }
}
