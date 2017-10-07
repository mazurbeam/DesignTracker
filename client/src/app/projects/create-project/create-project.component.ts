import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router'

import { ProjectService } from '../../shared/project/project.service';

import {Project} from '../../shared/project/project';

@Component({
  selector: 'app-create-project',
  templateUrl: './create-project.component.html',
  styleUrls: ['./create-project.component.css']
})
export class CreateProjectComponent implements OnInit {

  new_project: Project

  constructor(private project_service: ProjectService, private router: Router) { }

  ngOnInit() {
    this.new_project = new Project;
  }

  create(){
    console.log("create componenet level"+this.new_project)
    this.project_service.create_project(this.new_project)
      .then(data => console.log(this.new_project))
      .catch(err => console.log(err))
  }

}
