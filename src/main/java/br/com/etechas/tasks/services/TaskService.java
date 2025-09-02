package br.com.etechas.tasks.services;

import br.com.etechas.tasks.dto.TaskResponseDTO;
import br.com.etechas.tasks.entity.Task;
import br.com.etechas.tasks.entity.enums.StatusEnum;
import br.com.etechas.tasks.mapper.TaskMapper;
import br.com.etechas.tasks.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityReturnValueHandler;

import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    //Arthur Bonvecchio Batista
    //Gabriel Whanderson Silva de Castro


    @Autowired
    private TaskRepository repository;

    @Autowired
    private TaskMapper taskMapper;


    //alterar para retornar euma lista de DTO
    public List<TaskResponseDTO> findTasks(){
        List<TaskResponseDTO> result = taskMapper.toResponseDTOList(repository.findAll());
        return result;
    }

    public Optional<Task> findTaskById(Long id){
        return repository.findById(id);

    }

    public boolean DeleteListById(Long id) {
        var tarefa = repository.findById(id);

        if(tarefa.isEmpty()){
            return false;
        }if(tarefa.get().isPending()){
            repository.deleteById(id);
            return true;
        }
        throw new RuntimeException("Erro");

    }


}
