package com.BISEN.JANMAT.Services;

import java.util.List;

import com.BISEN.JANMAT.modelsPackage.ProjectsNfunds;

public interface ProjectNfundsService {

    ProjectsNfunds createProjectsNfunds(ProjectsNfunds project);
    ProjectsNfunds getProjectsNfunds(Long id);
    List<ProjectsNfunds> getAllProjectsNfunds();
    ProjectsNfunds updateProjectsNfunds(ProjectsNfunds updatedProject, Long id);
    ProjectsNfunds deleteProjectsNfunds(Long id);
}
