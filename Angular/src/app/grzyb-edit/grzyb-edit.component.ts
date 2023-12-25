import { Component} from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { GrzybService } from '../services/grzyb.service';

@Component({
  selector: 'app-grzyb-edit',
  templateUrl: './grzyb-edit.component.html',
  styleUrls: ['./grzyb-edit.component.css']
})
export class GrzybEditComponent {
  editGrzybForm: FormGroup;
  originalGrzybData: any;

  constructor(
    private formBuilder: FormBuilder,
    private grzybService: GrzybService,
    private route: ActivatedRoute,
    private router: Router
  ) {
    this.editGrzybForm = this.formBuilder.group({
      name: ['', [Validators.required]],
      author: ['', [Validators.required]],
    });
  }

  ngOnInit(): void {
    const GrzybName = this.route.snapshot.paramMap.get('name')||"";

    this.grzybService.getGrzyb(GrzybName).subscribe(originalData => {
      this.originalGrzybData = originalData;

      this.editGrzybForm.setValue({
        name: originalData.name,
        author: originalData.author,
      });
    });
  }

  onSubmit(): void {
    if (this.editGrzybForm.valid) {
      const editedGrzybData = this.editGrzybForm.value;

      this.grzybService.editGrzyb(this.originalGrzybData.name, editedGrzybData).subscribe(() => {
        this.router.navigate(['/Grzybs']);
      });
    }
  }
}
