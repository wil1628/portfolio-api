package com.wilberJimenez.portafolio_api.repository;

import com.wilberJimenez.portafolio_api.model.Project; // Importamos el modelo de project

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository; // Importamos el repositorio de JpaRepository
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findByFeaturedTrue(); // Busca los proyectos destacados

    List<Project> findByCategory(String category);
}
