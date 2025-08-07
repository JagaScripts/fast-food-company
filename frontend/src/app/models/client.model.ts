export interface Client {
  id: number;
  name: string;
  firstName: string;
  secondName: string;
  isRegular: boolean;
  dni: DNI;
  address: Address;
}

export interface DNI {
  numbers: number;
  letter: string;
  
  // Helper method to get full DNI
  getFullDNI(): string {
    return `${this.numbers}${this.letter}`;
  }
  
  // Validation method
  isValid(dni: string): boolean {
    try {
      dni = dni.toUpperCase();
      const numbers = parseInt(dni.substring(0, 8));
      const letter = dni.charAt(8);
      return this.verifyParameters(dni, letter) && this.verifyLetter(numbers, letter);
    } catch (error) {
      return false;
    }
  }
  
  private verifyParameters(dni: string, letter: string): boolean {
    return dni.length === 9 && /^\d{8}[A-Z]$/.test(dni);
  }
  
  private verifyLetter(numbers: number, letter: string): boolean {
    const letters = 'TRWAGMYFPDXBNJZSQVHLCKE';
    const calculatedLetter = letters[numbers % 23];
    return letter === calculatedLetter;
  }
}

export interface Address {
  streetType: string;
  streetName: string;
  houseNumber: number;
  floor: number;
  door: number;
  city: string;
  postalCode: number;
  province: string;
  country: string;
  
  getFullAddress(): string {
    return `${this.streetType} ${this.streetName}, ${this.houseNumber}, ${this.floor}º${this.door}, ${this.postalCode} ${this.city}, ${this.province}, ${this.country}`;
  }
}
