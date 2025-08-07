export interface Product {
  id: number;
  name: string;
  price: number;
  image?: string;
  categories?: Category[];
}

export interface Category {
  id: number;
  name: string;
  description?: string;
}

export interface CategoryProduct {
  id: number;
  categoryId: number;
  productId: number;
  category?: Category;
  product?: Product;
}
