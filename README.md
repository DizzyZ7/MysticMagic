# 🌟 MysticMagic

> A magical Forge mod for Minecraft 1.20.1  
> Adds Mystic Ore world generation and a powerful Magic Wand.

---

## ✨ Features

### 🧱 Mystic Ore
- Naturally generates in the Overworld
- Appears between Y=5 and Y=40
- Small veins (up to 4 blocks)
- Emits light
- Balanced rarity

### 🪄 Magic Wand
- Craftable item
- Right-click on Stone to transform it into a Gold Block
- Plays magical sound
- Spawns enchant particles
- Server-safe logic (no client desync)

---

## 🛠 Technical Overview

- Minecraft Forge 1.20.1 (44+)
- Java 17
- Uses DeferredRegister
- Clean modular architecture
- JSON-based recipes and models
- Custom world generation (ConfiguredFeature / PlacedFeature)

Project structure:

```
src/main/java/com/username/mysticmagic/
 ├── MysticMagic.java
 ├── blocks/
 ├── items/
 └── world/

src/main/resources/
 ├── META-INF/mods.toml
 ├── assets/mysticmagic/
 └── data/mysticmagic/recipes/
```

---

## 📦 Installation (Users)

1. Install Minecraft Forge 1.20.1
2. Download the latest release
3. Put the `.jar` file into your `mods/` folder
4. Launch the game

---

## 🔨 Installation (Developers)

Clone the repository:

```bash
git clone https://github.com/DizzyZ7/MysticMagic.git
cd MysticMagic
```

Build the mod:

```bash
./gradlew build
```

Output jar will be located in:

```
build/libs/
```

---

## 🧪 Development Notes

- Registrations use DeferredRegister
- World generation is registered during mod initialization
- No client-only logic in server code
- Scalable architecture for future expansion

---

## 🚀 Future Ideas

- Timed gold reversion
- Mana system
- Custom particles
- Spell upgrade system
- Magic mobs
- Custom dimension

---

## 📜 License

MIT License

---

## 👤 Author

Developed by DizzyZ7  
GitHub: https://github.com/DizzyZ7
