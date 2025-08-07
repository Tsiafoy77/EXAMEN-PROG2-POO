package Ufc;

import java.time.LocalDate;

public class Matchs {
    private int id;
    private LocalDate date;
    private String lieu;

    public Matchs(int id, LocalDate date, String lieu) {
        this.id = id;
        this.date = date;
        this.lieu = lieu;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLieu() {
        return lieu;
    }
}
