package controllersTest.ListaToDo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import controllersTest.ListaToDo.modelo.Tarefa;
import controllersTest.ListaToDo.service.TarefaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class TarefaControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockitoBean
    private TarefaService servico;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void listarTudo() throws Exception {

        Tarefa tarefa = new Tarefa();
        tarefa.setNome("teste");
        when(servico.listar()).thenReturn(List.of(tarefa));

        mockMvc.perform(get("/tarefas"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].nome").value("teste"));

    }

    @Test
    void adicionarTarefa() {
    }

    @Test
    void deletarTarefa() {
    }
}