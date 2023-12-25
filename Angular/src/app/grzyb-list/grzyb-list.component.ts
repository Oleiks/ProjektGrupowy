import { Component } from '@angular/core';
import { GrzybService } from '../services/grzyb.service';
import { Router } from '@angular/router';
import { DomSanitizer, SafeResourceUrl } from '@angular/platform-browser';

@Component({
  selector: 'app-grzyb-list',
  templateUrl: './grzyb-list.component.html',
  styleUrls: ['./grzyb-list.component.css']
})
export class GrzybListComponent {
  Grzyby: any[] = [];

  constructor(private grzybService: GrzybService,private router: Router, private domSanitizer: DomSanitizer) { }

  ngOnInit(): void {
    this.loadGrzybs();
  }

  private loadGrzybs(): void {
    this.grzybService.getAllGrzyby().subscribe(Grzyby => {
      this.Grzyby = Grzyby;

    });
  }

  viewGrzyb(name: string): void {
    this.router.navigate(['/Detail', name]);
  }
  sanitizeImageUrl(imageUrl: string): SafeResourceUrl {
    return this.domSanitizer.bypassSecurityTrustResourceUrl(imageUrl);
  }
}
