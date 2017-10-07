import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { Subscription } from 'rxjs/Subscription';
import 'rxjs/add/operator/switchMap';

import {ProjectService} from '../../shared/project/project.service';
import {Project} from '../../shared/project/project';

@Component({
  selector: 'app-project-details',
  templateUrl: './project-details.component.html',
  styleUrls: ['./project-details.component.css']
})
export class ProjectDetailsComponent implements OnInit {
  project: Project;
  subscription: Subscription;
  constructor(private _route: ActivatedRoute, private _projectService: ProjectService) { }

  ngOnInit() {
    this.subscription = this._route.paramMap
    .switchMap(params => {
      console.log("TaskDetailsComponent loaded and url id given is: ", params.get('id'));
      return this._projectService.getProject(params.get('id'));
  }).subscribe(project => this.project = project);
  }

}
