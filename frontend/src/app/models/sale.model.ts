export interface Sale {
  id: number;
  clientId: number;
  date: Date;
  total: number;
  discountId?: number;
  client?: Client;
  discount?: Discount;
  saleDetails: SaleDetail[];
}

export interface SaleDetail {
  id: number;
  saleId: number;
  productId: number;
  quantity: number;
  unitPrice: number;
  subtotal: number;
  product?: Product;
}

export interface Discount {
  id: number;
  name: string;
  percentage: number;
  description?: string;
  isActive: boolean;
}
