package controllersTest.ListaToDo.service;

import controllersTest.ListaToDo.modelo.Tarefa;
import controllersTest.ListaToDo.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    TarefaRepository repository;

    public List<Tarefa> listar(){
        return repository.findAll();
    }

}
