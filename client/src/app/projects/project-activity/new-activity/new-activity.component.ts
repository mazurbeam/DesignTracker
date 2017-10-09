import { Component, OnInit } from '@angular/core';

import {Activity} from '../../../shared/activity/activity'

@Component({
  selector: 'app-new-activity',
  templateUrl: './new-activity.component.html',
  styleUrls: ['./new-activity.component.css']
})
export class NewActivityComponent implements OnInit {

  activity: Activity;
  

  constructor() { }

  ngOnInit() {
    this.activity = new Activity;
  }

  startActivity(){
    console.log("starting activity");
    this.activity.startTime = new Date();
    console.log("start time: "+this.activity.startTime);
  }

}
