package pl.morlinski.wjug;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;

@Entity
public class Talk {
    
    @Id
    @GeneratedValue
    private @Getter int id;
    private @Getter String topic;

}
