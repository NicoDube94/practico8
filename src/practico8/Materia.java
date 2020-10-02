package practico8;

import java.util.Objects;

public class Materia {
    private int idMateria;
    private String nombre;
    private int anio;

    public Materia(int idMateria, String nombre, int anio) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    @Override
    public int hashCode() {
        /*int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.nombre);
        return hash;*/
        return nombre.hashCode();
    }
    @Override
    public boolean equals(Object ob){
        Materia m=(Materia)ob;
        if((ob==null)&&(ob instanceof Materia)){
            return nombre.equals(m.nombre);
        }else{
            return false;
        }
    }
}
