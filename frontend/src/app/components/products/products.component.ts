import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Product } from '../../models/product.model';

@Component({
  selector: 'app-products',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  
  products: Product[] = [];
  filteredProducts: Product[] = [];
  searchTerm: string = '';
  showAddForm: boolean = false;
  
  newProduct: Product = {
    id: 0,
    name: '',
    price: 0,
    image: ''
  };

  constructor() { }

  ngOnInit(): void {
    this.loadProducts();
  }

  private loadProducts(): void {
    // TODO: Load from API
    this.products = [
      { id: 1, name: 'Hamburguesa Clásica', price: 8.50, image: 'burger.jpg' },
      { id: 2, name: 'Pizza Margherita', price: 12.00, image: 'pizza.jpg' },
      { id: 3, name: 'Ensalada César', price: 6.50, image: 'salad.jpg' },
      { id: 4, name: 'Patatas Fritas', price: 4.00, image: 'fries.jpg' }
    ];
    this.filteredProducts = [...this.products];
  }

  onSearch(): void {
    if (!this.searchTerm.trim()) {
      this.filteredProducts = [...this.products];
    } else {
      this.filteredProducts = this.products.filter(product =>
        product.name.toLowerCase().includes(this.searchTerm.toLowerCase())
      );
    }
  }

  addProduct(): void {
    if (this.newProduct.name && this.newProduct.price > 0) {
      this.newProduct.id = this.products.length + 1;
      this.products.push({ ...this.newProduct });
      this.filteredProducts = [...this.products];
      this.resetForm();
      this.showAddForm = false;
    }
  }

  deleteProduct(id: number): void {
    this.products = this.products.filter(p => p.id !== id);
    this.filteredProducts = [...this.products];
  }

  private resetForm(): void {
    this.newProduct = {
      id: 0,
      name: '',
      price: 0,
      image: ''
    };
  }
}
