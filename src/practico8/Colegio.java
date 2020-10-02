package practico8;

public class Colegio {

    public static void main(String[] args) {
        
        Materia ingles_1=new Materia(1, "Ingles 1 primer año", 2020);
        Materia matematicas=new Materia(1, "Matematicas primer año", 2020);
        Materia laboratorio_1=new Materia(1, "Laboratorio 1 primer año", 2020);
        
        Alumno alumno1=new Alumno("Martin", "Lopez", 1001);
        Alumno alumno2=new Alumno("Brenda", "Martinez", 1002);
        
        alumno1.agregarMaterias(ingles_1);
        alumno1.agregarMaterias(matematicas);
        alumno1.agregarMaterias(laboratorio_1);
        
        alumno2.agregarMaterias(ingles_1);
        alumno2.agregarMaterias(matematicas);
        alumno2.agregarMaterias(laboratorio_1);
        alumno2.agregarMaterias(laboratorio_1);
        
        System.out.println(alumno1.cantidadMaterias());
        System.out.println(alumno2.cantidadMaterias());
        
 /*
        a) ambos tienen la misma cantidad de materias por que hay una materia que se repite, y no esta permitido materias repetidas.
        
        b) Implemnto un hashSet en la clase alumno y sobre escribo los metodo equals y hashCode en la clase Materia, para que asi, 
           si llega haber un nombre de una materia repetido lo detecte y no lo repita en la coleccion
 */

    }
    
}
