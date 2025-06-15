markdown

# Temperature Conversion Application

This is a Java application that prints a temperature conversion table from Celsius to Fahrenheit degrees.

## Author
- Lennox Magak

## Description
The `TemperatureConversion` class generates a table converting Celsius to Fahrenheit temperatures, ranging from -50°C to +50°C in 10-degree increments.

## Features
- Displays a conversion table with Celsius and equivalent Fahrenheit temperatures.
- Includes input validation to ensure Celsius temperatures are not below the absolute zero (-273.15°C).

## Usage
- Run the `main` method to print the conversion table.
- The `celsiusToFahrenheit` method handles individual conversions and throws an `IllegalArgumentException` for invalid inputs.

## Methods
- `main(String[] args)`: Prints the temperature conversion table.
- `celsiusToFahrenheit(double c)`: Converts a Celsius temperature to Fahrenheit, with validation.