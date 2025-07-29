package br.com.etechas.tasks.entity;

import br.com.etechas.tasks.entity.enums.StatusEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "TBL_TAREFA")
@Getter
@Setter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "TX_TITULO")
    private String title;

    @Column(name = "TX_DESCRIPTION")
    private String description;

    @Column(name = "TX_REPONSIBLE")
    private String responsible;

    @Column(name = "DT_DUEDATE")
    private LocalDate dueDate;

    @Column(name = "TX_STATUS")
    @Enumerated(EnumType.STRING)
    private StatusEnum status;

}