package com.wilberJimenez.portafolio_api;

import com.wilberJimenez.portafolio_api.model.Project;
import com.wilberJimenez.portafolio_api.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final ProjectRepository projectRepository;

    @Override
    public void run(String... args) {

        // Evita duplicar datos si ya existen
        if (projectRepository.count() > 0)
            return;

        // ── 1. Fly74 — Aerolínea ──────────────────────────────────────
        Project aerolinea = new Project();
        aerolinea.setTitle("Fly74 — Aerolínea");
        aerolinea.setDescription(
                "Sitio web oficial de la aerolínea costarricense Fly74. " +
                        "Incluye presentación de marca, información de aeronave, piloto y secciones responsivas.");
        aerolinea.setCategory("Web");
        aerolinea.setTechnologies(List.of("React", "Tailwind CSS", "Vite", "Vercel"));
        aerolinea.setGithubUrl("https://github.com/wil1628/Aerolinea");
        aerolinea.setLiveUrl("https://fly74.com");
        aerolinea.setFeatured(true);
        projectRepository.save(aerolinea);

        // ── 2. Sistema de Citas Médicas ───────────────────────────────
        Project citas = new Project();
        citas.setTitle("Sistema de Citas Médicas");
        citas.setDescription(
                "Aplicación web para gestión de citas médicas con módulos de " +
                        "pacientes, doctores y agenda. Incluye autenticación y panel administrativo.");
        citas.setCategory("Web");
        citas.setTechnologies(List.of("VB.NET", "ASP.NET WebForms", "SQL Server", "JavaScript", "Bootstrap"));
        citas.setGithubUrl("https://github.com/wil1628/SistemaCitasMedicas");
        citas.setLiveUrl(null);
        citas.setFeatured(true);
        projectRepository.save(citas);

        // ── 3. Biblioteca Spring Boot ─────────────────────────────────
        Project biblioteca = new Project();
        biblioteca.setTitle("Biblioteca Spring Boot");
        biblioteca.setDescription(
                "Sistema de gestión de biblioteca con módulos de libros, usuarios y préstamos. " +
                        "Incluye gráficos interactivos de métricas con Chart.js y arquitectura MVC.");
        biblioteca.setCategory("Web");
        biblioteca.setTechnologies(List.of("Java", "Spring Boot", "MySQL", "Tailwind CSS", "Chart.js", "Maven"));
        biblioteca.setGithubUrl("https://github.com/wil1628/biblioteca-springboot");
        biblioteca.setLiveUrl(null);
        biblioteca.setFeatured(true);
        projectRepository.save(biblioteca);

        // ── 4. Bienes Raíces ──────────────────────────────────────────
        Project bienesRaices = new Project();
        bienesRaices.setTitle("Bienes Raíces");
        bienesRaices.setDescription(
                "Plataforma de propiedades inmobiliarias con panel de administración, " +
                        "registro de usuarios, agendar citas y visualización de datos.");
        bienesRaices.setCategory("Web");
        bienesRaices.setTechnologies(List.of("PHP", "MySQL", "JavaScript", "CSS", "Bootstrap"));
        bienesRaices.setGithubUrl("https://github.com/wil1628/BienesRaices");
        bienesRaices.setLiveUrl(null);
        bienesRaices.setFeatured(false);
        projectRepository.save(bienesRaices);

        // ── 5. Inventario CLI ─────────────────────────────────────────
        Project inventario = new Project();
        inventario.setTitle("Inventario CLI");
        inventario.setDescription(
                "Sistema de gestión de inventario por línea de comandos. " +
                        "Permite consultar, registrar productos y gestionar sesiones con base de datos.");
        inventario.setCategory("CLI");
        inventario.setTechnologies(List.of("Python", "MySQL"));
        inventario.setGithubUrl("https://github.com/wil1628/Inventario-");
        inventario.setLiveUrl(null);
        inventario.setFeatured(false);
        projectRepository.save(inventario);

        System.out.println("✅ Proyectos de Wilber cargados correctamente.");
    }
}
