package lab.phb.mhswebapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
//@Table(name = "mahasiswa")
public class Mahasiswa {
    
    @Id
    @Getter @Setter
    private String nim;
    
    @Getter @Setter
    private String nama;
    
    @Getter @Setter
    private String jurusan;
    
}
