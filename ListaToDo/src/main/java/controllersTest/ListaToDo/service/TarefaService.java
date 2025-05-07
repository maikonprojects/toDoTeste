package controllersTest.ListaToDo.service;

import controllersTest.ListaToDo.modelo.Tarefa;
import controllersTest.ListaToDo.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    TarefaRepository repository;

    public List<Tarefa> listar(){
        return repository.findAll();
    }


    public Tarefa cadastrar(Tarefa tarefa){
        Tarefa tarefaCriada =repository.save(tarefa);

        return tarefaCriada;
    }

    public void deletar(String nome){
        if (repository.existsByNome(nome)){
            repository.deleteByNome(nome);
        }

    }



}
