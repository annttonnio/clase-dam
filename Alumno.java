public class Alumno {
    
    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        nombre = nombreCompleto;
        numeroMatricula = numeroMatriculaAlumno;
        edad = edadAlumno;
        int lengthNom = nombre.length();
        int lengthMat = numeroMatricula.length();
        if (lengthNom < 3){
            System.out.println ("Nombre demasiado corto");
        }  
        
        if (lengthMat < 4) {
            System.out.println ("Numero de matricula demasiado corto");
        } 
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " años");
    }
    public String getNombreAlumno(){
        String nombreAlumno = nombre;
        return nombreAlumno;
    }
    public String getNumeroMatriculaAlumno(){
        String numeroMatriculaAlumno = numeroMatricula;
        return numeroMatriculaAlumno;
    }
    public int getEdadAlumno(){
        int edadAlumno = edad;
        return edadAlumno;
    }
    
    
    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        String variableNUG = "";
        int lengthNom = nombre.length();
        int lengthMat = numeroMatricula.length();
        
        if(lengthNom < 3 && lengthMat < 4){
            variableNUG = nombre + numeroMatricula;
        }
        else{
            if (lengthNom < 3 || lengthMat < 4){
                if(lengthNom < 3){
                    variableNUG = nombre + numeroMatricula.substring(0,4);
                }
                if(lengthMat < 4){
                    variableNUG = nombre.substring(0,3) + numeroMatricula;
                }
            }
            else{
                variableNUG = nombre.substring(0,3) + numeroMatricula.substring(0,4);
            }
        }
        
        return variableNUG;
        
    }
}
