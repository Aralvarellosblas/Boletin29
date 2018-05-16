package ejercicio29;

/**
 *
 * @author Arturo
 */
public abstract class Barco{

    protected int eslora;
    private String matricula;

    public Barco(){
    }

    public Barco(int eslora, String matricula){
        this.eslora=eslora;
        this.matricula=matricula;
    }

    public int getEslora(){
        return eslora;
    }

    public void setEslora(int eslora){
        this.eslora=eslora;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula=matricula;
    }

    @Override
    public String toString(){
        return "Barco{"+"eslora="+eslora+", Matricula="+matricula+'}';
    }

    abstract public int alquiler(int dias);

}
