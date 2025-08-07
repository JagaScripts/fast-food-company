# Fast Food Company - Frontend Angular

Esta es la aplicación frontend Angular para el sistema de gestión de Fast Food Company, que reemplaza la interfaz de escritorio Java Swing con una aplicación web moderna.

## 🚀 Características

- **Dashboard interactivo** con estadísticas en tiempo real
- **Gestión de productos** con CRUD completo
- **Gestión de categorías** 
- **Gestión de clientes** con validación de DNI
- **Sistema de ventas** con TPV integrado
- **Gestión de descuentos**
- **Interfaz responsive** para móviles y tablets
- **Diseño moderno** con gradientes y animaciones

## 🛠️ Tecnologías

- **Angular 18** - Framework principal
- **TypeScript** - Lenguaje de programación
- **CSS3** - Estilos modernos con variables CSS
- **HTML5** - Estructura semántica
- **RxJS** - Programación reactiva

## 📁 Estructura del Proyecto

```
frontend/src/app/
├── components/
│   ├── dashboard/          # Dashboard principal
│   ├── products/           # Gestión de productos
│   ├── categories/         # Gestión de categorías
│   ├── clients/            # Gestión de clientes
│   ├── sales/              # Sistema de ventas
│   └── discounts/          # Gestión de descuentos
├── models/                 # Interfaces TypeScript
│   ├── product.model.ts
│   ├── client.model.ts
│   └── sale.model.ts
└── app.component.*         # Componente raíz
```

## 🎨 Diseño

La aplicación utiliza un sistema de diseño moderno con:

- **Paleta de colores**: Naranja (#ff6b35) y amarillo (#f7931e)
- **Tipografía**: Segoe UI para mejor legibilidad
- **Componentes**: Cards, botones, formularios modernos
- **Responsive**: Adaptable a todos los dispositivos
- **Animaciones**: Transiciones suaves y efectos hover

## 🚀 Instalación y Desarrollo

### Prerrequisitos

- Node.js 18+ 
- npm o yarn

### Instalación

```bash
cd frontend
npm install
```

### Desarrollo

```bash
npm start
```

La aplicación estará disponible en `http://localhost:4200`

### Build de Producción

```bash
npm run build
```

## 📊 Funcionalidades Implementadas

### ✅ Completadas

- [x] Estructura base de la aplicación
- [x] Dashboard con estadísticas
- [x] Gestión de productos (CRUD básico)
- [x] Navegación entre secciones
- [x] Diseño responsive
- [x] Modelos TypeScript

### 🔄 En Desarrollo

- [ ] Conexión con API REST
- [ ] Gestión de categorías
- [ ] Gestión de clientes
- [ ] Sistema de ventas
- [ ] Gestión de descuentos
- [ ] Autenticación de usuarios

## 🔗 Integración con Backend

La aplicación está diseñada para conectarse a una API REST que reemplace la base de datos Java. Los endpoints principales serán:

- `GET /api/products` - Listar productos
- `POST /api/products` - Crear producto
- `PUT /api/products/:id` - Actualizar producto
- `DELETE /api/products/:id` - Eliminar producto

## 🎯 Objetivos

1. **Migración completa** del sistema Java Swing a web
2. **Mejora de UX** con interfaz moderna
3. **Accesibilidad** desde cualquier dispositivo
4. **Escalabilidad** para futuras funcionalidades
5. **Mantenibilidad** con código TypeScript tipado

## 📝 Notas de Desarrollo

- La aplicación usa componentes standalone de Angular 18
- Los estilos utilizan variables CSS para consistencia
- Los modelos TypeScript reflejan las entidades Java originales
- La navegación usa lazy loading para optimizar el rendimiento

## 🤝 Contribución

1. Crear una rama para tu feature
2. Implementar los cambios
3. Crear un pull request
4. Seguir las reglas de commit establecidas

## 📄 Licencia

Este proyecto es parte del sistema Fast Food Company.
