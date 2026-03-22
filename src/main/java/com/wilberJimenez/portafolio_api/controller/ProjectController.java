package com.wilberJimenez.portafolio_api.controller;

import com.wilberJimenez.portafolio_api.model.Project;
import com.wilberJimenez.portafolio_api.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService projectService;

    // GET /api/projects/featured - Obtener proyectos
    @GetMapping
    public ResponseEntity<List<Project>> getAllProjects() {
        return ResponseEntity.ok(projectService.getAllProyects());
    }

    // GET /api/projects/featured — solo los destacados
    @GetMapping("/featured")
    public ResponseEntity<List<Project>> getFeatured() {
        return ResponseEntity.ok(projectService.getFeaturedProjects());
    }

    // GET /api/projects/{id} — uno específico
    @GetMapping("/{id}")
    public ResponseEntity<Project> getById(@PathVariable Long id) {
        return ResponseEntity.ok(projectService.getProjectById(id));
    }

    // POST /api/projects — crear un proyecto (lo usarás para cargar datos)
    @PostMapping
    public ResponseEntity<Project> create(@RequestBody Project project) {
        return ResponseEntity.ok(projectService.saveProject(project));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Project> update(@PathVariable Long id, @RequestBody Project project) {
        project.setId(id);
        return ResponseEntity.ok(projectService.saveProject(project));
    }
}