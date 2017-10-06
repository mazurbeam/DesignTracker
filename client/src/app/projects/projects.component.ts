import { Component, OnInit } from '@angular/core';

import { ProjectService } from '../shared/project/project.service';

@Component({
  selector: 'app-projects',
  templateUrl: './projects.component.html',
  styleUrls: ['./projects.component.css']
})
export class ProjectsComponent implements OnInit {

  projects: Array<any>;

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
