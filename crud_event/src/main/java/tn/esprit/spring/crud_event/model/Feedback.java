package tn.esprit.spring.crud_event.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idUser;
    private Long idEvent;
    private String content;
    private int rate;
    private LocalDate date = LocalDate.now();

    // -----------------------------
    // Constructors
    // -----------------------------
    public Feedback() {}

    public Feedback(Long idUser, Long idEvent, String content, int rate, LocalDate date) {
        this.idUser = idUser;
        this.idEvent = idEvent;
        this.content = content;
        this.rate = rate;
        this.date = date;
    }

    // -----------------------------
    // Getters & Setters
    // -----------------------------
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(Long idEvent) {
        this.idEvent = idEvent;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
