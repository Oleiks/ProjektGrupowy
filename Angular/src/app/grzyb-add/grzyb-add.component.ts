import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { GrzybService } from '../services/grzyb.service';

@Component({
  selector: 'app-grzyb-add',
  templateUrl: './grzyb-add.component.html',
  styleUrls: ['./grzyb-add.component.css']
})
export class GrzybAddComponent {
  addGrzybForm: FormGroup;

  constructor(
    private formBuilder: FormBuilder,
    private GrzybService: GrzybService,
    private router: Router
  ) {
    this.addGrzybForm = this.formBuilder.group({
      name: ['', [Validators.required]],
      author: ['', [Validators.required]],
    });
  }

  onSubmit(): void {
    if (this.addGrzybForm.valid) {
      const GrzybData = this.addGrzybForm.value;

      this.GrzybService.addGrzyb(GrzybData).subscribe(() => {
        this.router.navigate(['/Grzybs']);
      });
    }
  }
}
