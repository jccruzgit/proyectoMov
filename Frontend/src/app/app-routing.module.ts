import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateComponent } from './Cliente/create/create.component';
import { DeleteComponent } from './Cliente/delete/delete.component';
import { ReadComponent } from './Cliente/read/read.component';
import { UpdateComponent } from './Cliente/update/update.component';

const routes: Routes = [
  { path: 'listar', component:ReadComponent },
  { path: 'nuevo',  component:CreateComponent},
  { path: 'actualizar', component:UpdateComponent},
  { path: 'eliminar', component: DeleteComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
