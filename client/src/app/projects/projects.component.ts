import { Component, OnInit } from '@angular/core';

import { ProjectService } from '../shared/project/project.service';
import {Project} from 'w../shared/project/project';

@Component({
  selector: 'app-projects',
  templateUrl: './projects.component.html',
  styleUrls: ['./projects.component.css']
})
export class ProjectsComponent implements OnInit {

  projects: Array<Project>;

  constructor(private projectService: ProjectService) {}
   

  ngOnInit() {
    this.projectService.getAll().subscribe(
      data => {
        this.projects = data;
      },
      error => console.log(error)
    );
  }

}
