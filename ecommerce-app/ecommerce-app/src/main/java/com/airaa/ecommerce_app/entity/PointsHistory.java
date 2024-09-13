package com.airaa.ecommerce_app.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "points_history")
public class PointsHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int pointsEarned;
    private int pointsSpent;
    private String description;
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPointsEarned() {
        return pointsEarned;
    }

    public void setPointsEarned(int pointsEarned) {
        this.pointsEarned = pointsEarned;
    }

    public int getPointsSpent() {
        return pointsSpent;
    }

    public void setPointsSpent(int pointsSpent) {
        this.pointsSpent = pointsSpent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "PointsHistory{" +
                "id=" + id +
                ", pointsEarned=" + pointsEarned +
                ", pointsSpent=" + pointsSpent +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", user=" + user +
                '}';
    }
}
