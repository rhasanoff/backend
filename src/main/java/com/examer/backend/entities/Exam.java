package com.examer.backend.entities;

import java.util.Date;
import javax.persistence.*;

@Entity
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date exam_date;

    private String title;
    private int duration;
    private int total_question;
    private int mark_right;
    private int mark_wrong;
    private String status;

    public long getId() {
        return id;
    }

    public Date getExam_date() {
        return exam_date;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public int getTotal_question() {
        return total_question;
    }

    public int getMark_right() {
        return mark_right;
    }

    public int getMark_wrong() {
        return mark_wrong;
    }

    public String getStatus() {
        return status;
    }
}
