package controllersTest.ListaToDo.controller;

import controllersTest.ListaToDo.modelo.Tarefa;
import controllersTest.ListaToDo.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<String> adicionarTarefa(@RequestBody Tarefa tarefa){
        Tarefa tarefa1 = service.cadastrar(tarefa);
        return ResponseEntity.status(201).body("Tarefa adicionada: " + tarefa1.getNome());

    }

    @DeleteMapping("/{nome}")
    public ResponseEntity<String> deletarTarefa(@PathVariable String nome){
        service.deletar(nome);
        return ResponseEntity.status(200).body("Tarefa removida: " + nome);

    }



}
