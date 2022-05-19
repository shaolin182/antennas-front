package org.sebi.incident;

import java.util.Date;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Incident extends PanacheEntity {

    public Integer id;
    public String description;
    public Date date;
    public boolean status;
    
}
