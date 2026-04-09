# Golden Carrot Cake

A Minecraft Fabric mod for version 1.21.1 that adds a delicious Golden Carrot Cake food item.

## Features

- **Golden Carrot Cake**: A premium food item crafted from golden carrots
  - Restores **8 hunger points** (4 full hunger bars)
  - Grants **Regeneration I** effect for **10 seconds**
  - High saturation for longer-lasting hunger satisfaction
  - Stacks up to 64 items

## Crafting Recipe

The Golden Carrot Cake uses a shapeless crafting recipe:

| Ingredient | Quantity |
|------------|----------|
| Golden Carrot | 2 |
| Sugar | 1 |
| Wheat | 1 |

Simply place these items anywhere in your crafting grid to create a Golden Carrot Cake.

## How to Use

1. Craft the Golden Carrot Cake using the recipe above
2. Place the cake in your hotbar
3. Right-click (use) to eat the cake
4. Enjoy the hunger restoration and regeneration effect!

## Item Details

- **Item ID**: `goldencarrotcake:golden_carrot_cake`
- **Food Value**: 8 hunger points
- **Saturation**: 0.8 modifier (high)
- **Effect**: Regeneration I for 10 seconds (100% chance)
- **Stack Size**: 64

## Commands

You can give yourself the item using:
```
/give @s goldencarrotcake:golden_carrot_cake
```

## Requirements

- Minecraft 1.21.1
- Fabric Loader 0.16.0 or higher
- Fabric API 0.116.10+1.21.1 or compatible version
- Java 21

## Installation

1. Install Fabric Loader for Minecraft 1.21.1
2. Download and install Fabric API
3. Download the `golden-carrot-cake-1.0.0.jar` from the releases or `build/libs/` folder
4. Place the JAR file in your `.minecraft/mods/` folder
5. Launch Minecraft with the Fabric profile

## Building from Source

```bash
git clone https://github.com/Simplifine-gamedev/golden-carrot-cake.git
cd golden-carrot-cake
./gradlew build
```

The compiled mod will be in `build/libs/golden-carrot-cake-1.0.0.jar`

## License

This mod is free to use and modify.

## Author

Created by ali77sina
