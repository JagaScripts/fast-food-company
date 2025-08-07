import { Routes } from '@angular/router';
import { DashboardComponent } from './components/dashboard/dashboard.component';

export const routes: Routes = [
  { path: '', redirectTo: '/dashboard', pathMatch: 'full' },
  { path: 'dashboard', component: DashboardComponent },
  { path: 'products', loadComponent: () => import('./components/products/products.component').then(m => m.ProductsComponent) },
  { path: 'categories', loadComponent: () => import('./components/categories/categories.component').then(m => m.CategoriesComponent) },
  { path: 'clients', loadComponent: () => import('./components/clients/clients.component').then(m => m.ClientsComponent) },
  { path: 'sales', loadComponent: () => import('./components/sales/sales.component').then(m => m.SalesComponent) },
  { path: 'discounts', loadComponent: () => import('./components/discounts/discounts.component').then(m => m.DiscountsComponent) },
  { path: '**', redirectTo: '/dashboard' }
];
