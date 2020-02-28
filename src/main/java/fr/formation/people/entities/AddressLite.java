package fr.formation.people.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Cette classe est mappé avec une table
@Table(name = "addresses")
public class AddressLite {

    @Id // Ce champ est la clef primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Nom de la table != de la classe
    private Long id;



    public AddressLite() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "Address [id=" + id + "]";
    }




}
