import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PredictionPage } from '../prediction/prediction.page';
import { HomePage } from './home.page';

const routes: Routes = [
  {
    path: '',
    component: HomePage,
  },
  {
    path:'prediction',
    component: PredictionPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HomePageRoutingModule {}
