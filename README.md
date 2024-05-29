# Fly-Weight

This repository contains a Java implementation demonstrating the Flyweight design pattern, which is used to minimize memory usage and improve performance by sharing as much data as possible with related objects. In this example, the Flyweight pattern is applied to a weapon shop scenario.

## Contents

- [Introduction](#introduction)
- [Usage](#usage)
- [Structure](#structure)

## Introduction

The Flyweight pattern is utilized here to optimize the creation and management of various types of guns in a weapon shop. By sharing common parts of gun objects, memory usage is reduced, and performance is improved.

## Usage

To run the application, execute the `Application.java` file located in the `src` directory. This will simulate enumerating the shelves of the weapon shop, showcasing the creation and shooting of different types of guns.

```java
public class Application {

    public static void main(String[] args) {
        WeaponShop shop = new WeaponShop();
        shop.enumerateShelves();
    }
}
```

## Structure

The project consists of the following key components:

- `WeaponShop`: Represents the weapon shop where guns are stored and enumerated. It uses the Flyweight pattern to manage guns efficiently.
- `GunFactory`: Implements the Flyweight factory responsible for creating and caching different types of guns.
- `GunType`: Enumerates the various types of guns available in the shop.
- `Shooting`: Defines the interface for shooting behavior.
- Gun implementations (`HandGun`, `Musket`, `Sniper`, `Submachine`): Concrete implementations of different types of guns.
```

Feel free to use or modify it further!
```
