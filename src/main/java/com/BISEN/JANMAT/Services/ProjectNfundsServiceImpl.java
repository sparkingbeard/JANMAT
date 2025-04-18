package com.BISEN.JANMAT.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BISEN.JANMAT.modelsPackage.ProjectsNfunds;
import com.BISEN.JANMAT.repositoryPackage.ProjectsNfundsRepository;

@Service
public class ProjectNfundsServiceImpl implements ProjectNfundsService {

    @Autowired
    ProjectsNfundsRepository projectsRepo;

    @Override
    public ProjectsNfunds createProjectsNfunds(ProjectsNfunds project) {
          return projectsRepo.save(project);
    }

    @Override
    public ProjectsNfunds getProjectsNfundsById(Long id) {
        return projectsRepo.findById(id).orElse(null);
    }

    @Override
    public List<ProjectsNfunds> getAllProjectsNfunds() {
       return projectsRepo.findAll();
    }

    
    @Override
    public void deleteProjectsNfunds(Long id) {
       projectsRepo.deleteById(id);
    }

    @Override
    public ProjectsNfunds updateProjectsNfunds(ProjectsNfunds updatedProject, Long id) {
        ProjectsNfunds existing = (projectsRepo.findById(id).orElse(null));
        if(existing != null){
            existing.setDescription(updatedProject.getDescription());
            existing.setStartDate(updatedProject.getStartDate());
            existing.setEndDate(updatedProject.getEndDate());
            existing.setAllocateAmount(updatedProject.getAllocateAmount());
            existing.setSpentAmount(updatedProject.getSpentAmount());
            existing.setProjectStatus(updatedProject.getProjectStatus());
            return projectsRepo.save(existing);
        }
        return null;
    }

}

