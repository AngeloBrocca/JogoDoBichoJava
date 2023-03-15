import java.util.ArrayList;

public class Bicho {
    String nome;
    int ind;

    public Bicho(String nome,int ind){
        this.nome = nome;
        this.ind = ind;
    }

    //metodo que atribui as dezenas do bicho
    public ArrayList<Integer> getDz() {
        ArrayList<Integer> dz = new ArrayList<Integer>();
        int fd = ind * 4;

        dz.add(fd - 3);
        dz.add(fd - 2);
        dz.add(fd - 1);
    
        if (fd == 100) {
            dz.add(0);
        } else {
            dz.add(fd);
        }
    
        return dz;
    }
}
