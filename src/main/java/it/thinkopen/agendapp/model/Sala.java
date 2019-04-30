/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.thinkopen.agendapp.model;

import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author Ali El
 */
@Entity
@Data

public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String sala;
    
    
    
    
}
