package it.thinkopen.agendapp.model;

import javax.persistence.*;

import lombok.Data;


@Entity
@Data

public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @ManyToOne
   private Utente utente;

    
    @ManyToOne
   private Sala sala;
}