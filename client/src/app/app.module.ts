import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { ProjectsComponent } from './projects/projects.component';
import { ProjectListComponent } from './projects/project-list/project-list.component';
import { ProjectService } from './shared/project/project.service';
import { ActivityService } from './shared/activity/activity.service';


@NgModule({
  declarations: [
    AppComponent,
    ProjectsComponent,
    ProjectListComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [ProjectService, ActivityService],
  bootstrap: [AppComponent]
})
export class AppModule { }
