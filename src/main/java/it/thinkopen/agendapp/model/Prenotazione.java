package it.thinkopen.agendapp.model;

import java.util.Date;
import javax.persistence.*;

import lombok.Data;


@Entity
@Data

public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date oraInizio;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date oraFine;
    
    @ManyToOne
   private Utente utente;

    
    @ManyToOne
   private Sala sala;
}