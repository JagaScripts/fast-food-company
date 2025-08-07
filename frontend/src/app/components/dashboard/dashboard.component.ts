import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-dashboard',
  standalone: true,
  imports: [CommonModule, RouterModule],
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  
  stats = {
    totalSales: 0,
    totalProducts: 0,
    totalClients: 0,
    totalCategories: 0
  };

  recentSales: any[] = [];
  topProducts: any[] = [];

  constructor() { }

  ngOnInit(): void {
    this.loadDashboardData();
  }

  private loadDashboardData(): void {
    // TODO: Load data from API
    this.stats = {
      totalSales: 1250,
      totalProducts: 45,
      totalClients: 89,
      totalCategories: 8
    };

    this.recentSales = [
      { id: 1, client: 'Juan Pérez', total: 25.50, date: new Date() },
      { id: 2, client: 'María García', total: 18.75, date: new Date() },
      { id: 3, client: 'Carlos López', total: 32.00, date: new Date() }
    ];

    this.topProducts = [
      { name: 'Hamburguesa Clásica', sales: 45 },
      { name: 'Pizza Margherita', sales: 38 },
      { name: 'Ensalada César', sales: 32 }
    ];
  }
}
