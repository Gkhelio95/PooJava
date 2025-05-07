# Java OOP Example: Vehicles

This project is a simple Java program demonstrating **Object-Oriented Programming (OOP)** concepts such as **inheritance**, **method overriding**, and **encapsulation** using a vehicle simulation with cars and motorcycles.

## File: `tareapoo.java`

### Overview

The program simulates the behavior of different vehicle types: a car (`Auto`) and a motorcycle (`Moto`). It allows each vehicle to accelerate, brake, and display its details. The design leverages inheritance to avoid code duplication and to demonstrate polymorphism.

### Structure

#### 1. `Vehiculo` (Base Class)

This is the parent class that contains properties and methods common to all vehicles:

- **Attributes**: `marca`, `modelo`, `anio`, `velocidad`
- **Methods**:
  - `acelerar(int cantidad)`: Increases speed
  - `frenar(int cantidad)`: Decreases speed, but not below 0
  - `detalles()`: Prints basic vehicle details

#### 2. `Auto` (Subclass)

Inherits from `Vehiculo` and adds:

- **Attribute**: `puertas`
- **Overrides**: `detalles()` to include the number of doors

#### 3. `Moto` (Subclass)

Inherits from `Vehiculo` and adds:

- **Attribute**: `tipoManillar` (handlebar type)
- **Overrides**: `detalles()` to include handlebar type

#### 4. `Test` (Main Class)

Creates instances of `Auto` and `Moto`, simulates acceleration and braking, and prints their details.

### Sample Output


### Concepts Demonstrated

- **Class inheritance**: `Auto` and `Moto` extend `Vehiculo`.
- **Constructor chaining**: Using `super(...)` to initialize inherited properties.
- **Method overriding**: Each subclass customizes the `detalles()` method.
- **Encapsulation**: Logical grouping of attributes and behavior per vehicle type.

## How to Compile and Run

Make sure you have Java installed. Then:

```bash
javac tareapoo.java
java Test.Test

---

Would you like this saved as a `.md` file or combined with the previous README?
