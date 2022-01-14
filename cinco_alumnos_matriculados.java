

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class cinco_alumnos_matriculados.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class cinco_alumnos_matriculados
{
    private ClaseDam claseDam1;
    private Alumno Antonio;
    private Alumno Beatriz;
    private Alumno Carlos;
    private Alumno Dario;
    private Alumno Elena;

    /**
     * Default constructor for test class cinco_alumnos_matriculados
     */
    public cinco_alumnos_matriculados()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        claseDam1 = new ClaseDam(5);
        Antonio = new Alumno("Antonio Alvarez", "1357", 21);
        Beatriz = new Alumno("Beatriz Bosco", "2468", 22);
        Carlos = new Alumno("Carlos Cepeda", "3579", 23);
        Dario = new Alumno("Dario Diez", "4680", 24);
        Elena = new Alumno("Elena Escudero", "5791", 25);
        claseDam1.matricularAlumno(Antonio);
        claseDam1.matricularAlumno(Beatriz);
        claseDam1.matricularAlumno(Carlos);
        claseDam1.matricularAlumno(Dario);
        claseDam1.matricularAlumno(Elena);
        claseDam1.imprimeDetalles();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
