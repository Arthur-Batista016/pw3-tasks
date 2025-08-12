package br.com.etechas.tasks.services;

import br.com.etechas.tasks.dto.TaskResponseDTO;
import br.com.etechas.tasks.entity.Task;
import br.com.etechas.tasks.mapper.TaskMapper;
import br.com.etechas.tasks.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    @Autowired
    private TaskMapper taskMapper;

    //alterar para retornar euma lista de DTO
    public List<TaskResponseDTO> findTasks(){
        List<TaskResponseDTO> result = taskMapper.toResponseDTOList(repository.findAll());
        return result;
    }


}
