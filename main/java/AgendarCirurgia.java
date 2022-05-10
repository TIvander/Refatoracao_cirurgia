public class AgendarCirurgia {
    public String procedimento;
    public Cirurgiao cirurgiaoPrincipal;
    public Paciente paciente;

    public AgendarCirurgia(String procedimento, Cirurgiao cirurgiao, Paciente paciente){
        this.procedimento = procedimento;
        this.cirurgiaoPrincipal = cirurgiao;
        this.paciente = paciente;
    }


}
