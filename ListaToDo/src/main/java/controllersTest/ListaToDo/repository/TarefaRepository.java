package controllersTest.ListaToDo.repository;

import controllersTest.ListaToDo.modelo.Tarefa;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {

    Boolean existsByNome(String nome);

    void deleteByNome(String nome);


}
