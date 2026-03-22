package com.wilberJimenez.portafolio_api.service;

import com.wilberJimenez.portafolio_api.model.Project;
import com.wilberJimenez.portafolio_api.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;

    // Obtener todos los proyectos
    public List<Project> getAllProyects() {
        return projectRepository.findAll();
    }

    // Obtener un proyecto destacado
    public List<Project> getFeaturedProjects() {
        return projectRepository.findByFeaturedTrue();
    }

    // Obtenemos un proyecto por su id
    public Project getProjectById(Long id) {
        return projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Proyecto no encontrado"));
    }

    // Guardar un nuevo proyecto
    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }
}
