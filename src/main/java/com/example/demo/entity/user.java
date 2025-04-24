package com.example.demo.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDateTime;
public class user {
    @Entity
    @Table(name = "users")
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "user_id")
        private Long userId;

        @Column(name = "username", length = 50, nullable = false, unique = true)
        private String username;

        @Column(name = "password", length = 255, nullable = false)
        private String password;

        @Column(name = "email", length = 100, nullable = false, unique = true)
        private String email;

        @Column(name = "full_name", length = 100, nullable = false)
        private String fullName;

        @Column(name = "role", length = 20, nullable = false)
        @Enumerated(EnumType.STRING)
        private String role;

        @Column(name = "created_at")
        @CreationTimestamp
        private LocalDateTime createdAt;

        @Column(name = "updated_at")
        @UpdateTimestamp
        private LocalDateTime updatedAt;

        @Column(name = "status")
        private Boolean status = true;
    }
}
