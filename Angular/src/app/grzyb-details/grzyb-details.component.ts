import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { GrzybService } from '../services/grzyb.service';
import { DomSanitizer, SafeResourceUrl } from '@angular/platform-browser';

@Component({
  selector: 'app-grzyb-details',
  templateUrl: './grzyb-details.component.html',
  styleUrls: ['./grzyb-details.component.css']
})
export class GrzybDetailsComponent {
  Grzyb: any;
  constructor(private grzybService: GrzybService,private router: Router,private route:ActivatedRoute, private domSanitizer: DomSanitizer) { }
  ngOnInit(): void {
    this.loadGrzyb();
  }
  private loadGrzyb(): void {
    const name = this.route.snapshot.paramMap.get('name')||"";
    this.grzybService.getGrzyb(name).subscribe(Grzyb => {
      this.Grzyb = Grzyb;
    });
  }
  sanitizeImageUrl(imageUrl: string): SafeResourceUrl {
    return this.domSanitizer.bypassSecurityTrustResourceUrl(imageUrl);
  }
}
