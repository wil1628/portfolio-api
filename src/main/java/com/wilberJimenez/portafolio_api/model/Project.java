package com.wilberJimenez.portafolio_api.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "projects")
@Data // Genera los getters y setters
@NoArgsConstructor // Genera el constructor sin argumentos
@AllArgsConstructor // Genera el constructor con todo los argumentos

public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "imagenUrl")
    private String imagenUrl;

    @Column(name = "githubUrl")
    private String githubUrl;

    @Column(name = "liveUrl")
    private String liveUrl;

    @Column(name = "category")
    private String category;

    @ElementCollection
    private List<String> technologies;

    private boolean featured;
}
