package com.appcraft.rdvmedecins.domain;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public class AbstractEntity implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @Version
    protected  Long version;

    @Override
    public int hashCode() {
        int hash = 0;
        hash +=(id !=null ? id.hashCode() : 0);
        return hash;
    }

    public AbstractEntity build(Long id, Long version){
        this.id = id;
        this.version = version;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        String class1 = this.getClass().getName();
        String class2= obj.getClass().getName();
        if(!class2.equals(class1)){
            return false;
        }
        AbstractEntity other = (AbstractEntity) obj;
        return this.id == ((AbstractEntity) obj).id;
    }

    public static Long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}