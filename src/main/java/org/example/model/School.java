package org.example.model;


import javax.persistence.*;

@Entity
@Table(name="school")
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(name = "principal_id", referencedColumnName = "id")
    private Principal principal;

    @Column(name="school_number")
    private int school_number;



    public School() {
    }

    public School(int school_number) {
        this.school_number = school_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSchool_number() {
        return school_number;
    }

    public void setSchool_number(int school_number) {
        this.school_number = school_number;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }
}
