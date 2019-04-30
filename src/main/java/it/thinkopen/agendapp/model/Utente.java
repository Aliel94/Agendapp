package it.thinkopen.agendapp.model;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author Ali El
 */
@Entity
@Data

public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long  id;
    private String email;
    private String password;
    
  }
