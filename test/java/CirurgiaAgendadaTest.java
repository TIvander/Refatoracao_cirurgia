import static org.junit.jupiter.api.Assertions.assertEquals;

public class CirurgiaAgendadaTest {

    @org.junit.Test
    public void deveAgendar() {
        Cirurgiao cirurgiao = new Cirurgiao();
        Paciente paciente = new Paciente();
        AgendarCirurgia agendamento = new AgendarCirurgia("12876", cirurgiao, paciente);

        CirurgiaAgendada cirurgiaAgendada = new CirurgiaAgendada();

        assertEquals("Não há horário vago nesta data", cirurgiaAgendada.agendar(agendamento));

    }

    //TESTE DA REFATORACAO
    @org.junit.Test
    public void deveAgendarRefatorado() {
        Cirurgiao cirurgiao = new Cirurgiao();
        Paciente paciente = new Paciente();
        AgendarCirurgia agendamento = new AgendarCirurgia("12876", cirurgiao, paciente);
        CirurgiaAgendada cirurgiaAgendada = new CirurgiaAgendada();

        cirurgiaAgendada.agendarRefatorado(agendamento);

        assertEquals("Agendado com sucesso", cirurgiaAgendada.confirmaAgendamentoRefatorado(agendamento));
    }



}