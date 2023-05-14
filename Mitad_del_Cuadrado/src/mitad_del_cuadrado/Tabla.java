package mitad_del_cuadrado;

public class Tabla {
    
    Alumno[] Al;

    public Tabla() {
        
        this.Al = new Alumno[1000];
        
    }
    
    public int mitadCuad(int id){
        int cuadrado, pri3, seisInt;
        String cuad_string;
        String ult6;
        
        cuadrado = (int) Math.pow(id, 2);//elevo la clave al cuadrado
        cuad_string = String.valueOf(cuadrado);//convierto el resultado en una cadena
        ult6 = cuad_string.substring(cuad_string.length() -6);//obtengo los ultimos 6 de la cadena
        seisInt = Integer.parseInt(ult6);//convierto los ultimos 6 de la cadena en entero
        pri3 = seisInt/1000;//obtengo los primeros 3 
        
        return pri3;
    }
    
    public void insertar(Alumno alu){
        int posicion;
        posicion = mitadCuad(alu.id);
        Al[posicion] = alu;
    }
    
}
