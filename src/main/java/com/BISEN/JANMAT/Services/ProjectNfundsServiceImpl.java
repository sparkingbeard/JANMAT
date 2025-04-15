package com.BISEN.JANMAT.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BISEN.JANMAT.modelsPackage.ProjectsNfunds;
import com.BISEN.JANMAT.repositoryPackage.ProjectsNfundsRepository;

@Service
public class ProjectNfundsServiceImpl implements ProjectNfundsService {

    @Autowired
    ProjectsNfundsRepository projectsAndFunds;

    @Override
    public ProjectsNfunds createProjectsNfunds(ProjectsNfunds project) {
          return projectsAndFunds.save(project);
    }

    @Override
    public ProjectsNfunds getProjectsNfunds(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProjectsNfunds'");
    }

    @Override
    public List<ProjectsNfunds> getAllProjectsNfunds() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllProjectsNfunds'");
    }

    @Override
    public ProjectsNfunds updateProjectsNfunds(ProjectsNfunds updatedProject, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateProjectsNfunds'");
    }

    @Override
    public ProjectsNfunds deleteProjectsNfunds(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteProjectsNfunds'");
    }

}
