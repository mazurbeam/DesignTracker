import { Component, OnInit, Input } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import 'rxjs/add/operator/switchMap';

import {ProjectService} from '../../shared/project/project.service';
import {Project} from '../../shared/project/project';

@Component({
  selector: 'app-project-list',
  templateUrl: './project-list.component.html',
  styleUrls: ['./project-list.component.css']
})
export class ProjectListComponent implements OnInit {

  @Input() myProjects: Array<any>;
  constructor() { }

  ngOnInit() {
  }

}
