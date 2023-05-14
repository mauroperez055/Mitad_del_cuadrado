package mitad_del_cuadrado;


public class Mitad_del_Cuadrado {

    
    public static void main(String[] args) {
        
        Alumno alu1;
        Alumno alu2;
        Alumno alu3;

        Tabla tHash = new Tabla();
        
        alu1 = new Alumno(2023, "Mauro");
        alu2 = new Alumno(2019, "Gabriel");
        alu3 = new Alumno(2004, "Perez");

        tHash.insertar(alu1);
        tHash.insertar(alu2);
        tHash.insertar(alu3);


        System.out.println("");
        System.out.println("alumno: " + alu1.getNombre());
        System.out.println("id: " + alu1.getId());
        System.out.println("posicion: " + tHash.mitadCuad(alu1.getId()));
        System.out.println("");
        System.out.println("alumno: " + alu2.getNombre());
        System.out.println("id: " + alu2.getId());
        System.out.println("posicion: " + tHash.mitadCuad(alu2.getId()));
        System.out.println("");
        System.out.println("alumno: " + alu3.getNombre());
        System.out.println("id: " + alu3.getId());
        System.out.println("posicion: " + tHash.mitadCuad(alu3.getId()));

    }
    
}
