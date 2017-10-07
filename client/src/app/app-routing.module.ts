import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import {HomeComponent} from './home/home.component';
import {ProjectsComponent} from './projects/projects.component';
import {ProjectDetailsComponent} from './projects/project-details/project-details.component';

const routes: Routes = [
    {path: '', component: HomeComponent},
    {path: 'projects', component: ProjectsComponent},
    {path: 'projects/:id', component: ProjectDetailsComponent}
]

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
  })
  export class AppRoutingModule { }