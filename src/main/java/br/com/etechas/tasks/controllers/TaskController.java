package br.com.etechas.tasks.controllers;


import br.com.etechas.tasks.dto.TaskResponseDTO;
import br.com.etechas.tasks.entity.Task;
import br.com.etechas.tasks.entity.enums.StatusEnum;
import br.com.etechas.tasks.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/task")
public class TaskController {
    //Arthur Bonvecchio Batista
    //Gabriel Whanderson Silva de Castro

    @Autowired
    private TaskService service;



    @GetMapping("/Get")
    public List<TaskResponseDTO> listTasks(){
        List<TaskResponseDTO> result = service.findTasks();
        return result;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> DeleteById(@PathVariable Long id){
        if(service.DeleteListById(id)){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

}
