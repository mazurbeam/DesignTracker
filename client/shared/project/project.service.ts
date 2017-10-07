import { Injectable } from '@angular/core';
import { Headers, Http, Response } from '@angular/http';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';
import { Observable } from 'rxjs';

import {Project} from './project';

@Injectable()
export class ProjectService {

  private headers = new Headers({'Content-Type': 'application/json'});

  constructor(private http: Http) { }

  getAll(): Observable<any> {
    return this.http.get('http://localhost:8080/projects/all')
      .map((response: Response) => response.json());
  }

  create_project(project: Project): Promise<Project>{
    console.log(project);
    return this.http.post('http://localhost:8080/projects/new', JSON.stringify(project), {headers: this.headers})
      .toPromise()
      .then(res => res.json() as Project)
      .catch(this.handleError);
  }

  private handleError(error: any): Promise<any> {
    console.error('Error', error); // for demo purposes only
    return Promise.reject(error.message || error);
  }
}
