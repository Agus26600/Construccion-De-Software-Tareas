public class ClasificadorDia {
    private static final int LUNES = 1;
    private static final int MARTES = 2;
    private static final int MIERCOLES = 3;
    private static final int JUEVES = 4;
    private static final int VIERNES = 5;
    private static final int SABADO = 6;
    private static final int DOMINGO = 7;
    private static final String DIA_LABORAL = "Dia Laboral";
    private static final String FIN_DE_SEMANA = "Fin de Semana";
    private String turno;
    private int numeroDia;


    public ClasificadorDia(String turno, int numeroDia){
        this.turno = turno;
        this.numeroDia = numeroDia;
    }

    @Override 
    public String toString(){
        return "Turno: " + turno + ", Dia: " + numeroDia;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getNumeroDia() {
        return numeroDia;
    }
    public void setNumeroDia(int numeroDia) {
        this.numeroDia = numeroDia;
    }


    public String clasificarDiaSemana(int numeroDia){

        //clausula de guarda
        if (numeroDia != LUNES && numeroDia != MARTES && numeroDia != MIERCOLES && numeroDia != JUEVES && numeroDia != VIERNES && numeroDia != SABADO && numeroDia != DOMINGO){
            return "Dia Invalido";
        } 

        if (numeroDia >= LUNES && numeroDia <= VIERNES){
            return DIA_LABORAL;
        } else {
            return FIN_DE_SEMANA;
        }

    }

    public boolean esTurnoManana(String turno){
        if (turno.equals("Manana")){
            return true;
        } else {
            return false;
        }

    }


}
