package com.fundamentals.entity;

import javax.persistence.*;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "application_id")
    private Application application;

    @ManyToOne
    @JoinTable(name = "ticket_release", joinColumns = @JoinColumn(name = "ticket_fk"), inverseJoinColumns = @JoinColumn(name = "release_fk"))
    private Release release;

    private String status;

    public Ticket() {}

    public Ticket(Integer id,
                  String title,
                  String description,
                  Application application,
                  Release release,
                  String status
    ) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.application = application;
        this.release = release;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", application=" + application +
                ", release=" + release +
                ", status='" + status + '\'' +
                '}';
    }
}
