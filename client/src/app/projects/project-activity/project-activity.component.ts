import { Component, OnInit, Input } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import 'rxjs/add/operator/switchMap';
import {Project} from '../../shared/project/project';
import {ProjectService} from '../../shared/project/project.service';



@Component({
  selector: 'app-project-activity',
  templateUrl: './project-activity.component.html',
  styleUrls: ['./project-activity.component.css']
})
export class ProjectActivityComponent implements OnInit {
  
  @Input() myProject: Project;
  constructor() { }

  ngOnInit() {
    console.log(this.myProject);
  }

}
