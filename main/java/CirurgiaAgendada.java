public class CirurgiaAgendada {
    public AgendarCirurgia cirurgias ;

    public CirurgiaAgendada(){

    }

    public String confirmaAgendamento(AgendarCirurgia agendamento){

        if (agendamento != this.cirurgias) {
            return "Agendado com sucesso";
        } else {
            return "Não há horário vago nesta data";
        }
    }

    public String agendar(AgendarCirurgia agendamento ){
        this.cirurgias = agendamento;
        return confirmaAgendamento(agendamento);
    }

    //REFATORACAO

    public void agendarRefatorado(AgendarCirurgia agendamento){
        this.cirurgias = agendamento;
    }

    public String confirmaAgendamentoRefatorado(AgendarCirurgia agendamento){
        if (agendamento != this.cirurgias) {
            return "Não há horário vago nesta data";

        } else {

            return "Agendado com sucesso";
        }
    }
}
