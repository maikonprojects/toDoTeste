package controllersTest.ListaToDo.controller;

import controllersTest.ListaToDo.modelo.Tarefa;
import controllersTest.ListaToDo.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    TarefaService service;

    @GetMapping
    public ResponseEntity<List<Tarefa>> listarTudo(){
        return ResponseEntity.status(200).body(service.listar());
    }

}
