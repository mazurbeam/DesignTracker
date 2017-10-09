import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProjectsComponent } from './projects/projects.component';
import { ProjectListComponent } from './projects/project-list/project-list.component';
import { ProjectService } from './shared/project/project.service';
import { ActivityService } from './shared/activity/activity.service';
import { CreateProjectComponent } from './projects/create-project/create-project.component';
import { HomeComponent } from './home/home.component';
import { ProjectDetailsComponent } from './projects/project-details/project-details.component';
import { ProjectActivityComponent } from './projects/project-activity/project-activity.component';
import { NewActivityComponent } from './projects/project-activity/new-activity/new-activity.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatCardModule, MatButtonToggleModule, MatToolbarModule, MatMenuModule} from '@angular/material';


@NgModule({
  declarations: [
    AppComponent,
    ProjectsComponent,
    ProjectListComponent,
    CreateProjectComponent,
    HomeComponent,
    ProjectDetailsComponent,
    ProjectActivityComponent,
    NewActivityComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpModule,
    BrowserAnimationsModule,
    MatCardModule,
    MatToolbarModule,
    MatMenuModule,
    MatButtonToggleModule
  ],
  providers: [ProjectService, ActivityService],
  bootstrap: [AppComponent]
})
export class AppModule { }
