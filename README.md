![Grasscutter](https://socialify.git.ci/Grasscutters/Grasscutter/image?description=1&forks=1&issues=1&language=1&logo=https%3A%2F%2Fs2.loli.net%2F2022%2F04%2F25%2FxOiJn7lCdcT5Mw1.png&name=1&owner=1&pulls=1&stargazers=1&theme=Light)
<div align="center"><img alt="Documentation" src="https://img.shields.io/badge/Wiki-Grasscutter-blue?style=for-the-badge&link=https://github.com/Grasscutters/Grasscutter/wiki&link=https://github.com/Grasscutters/Grasscutter/wiki"> <img alt="GitHub release (latest by date)" src="https://img.shields.io/github/v/release/Grasscutters/Grasscutter?logo=java&style=for-the-badge"> <img alt="GitHub" src="https://img.shields.io/github/license/Grasscutters/Grasscutter?style=for-the-badge"> <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/Grasscutters/Grasscutter?style=for-the-badge"> <img alt="GitHub Workflow Status" src="https://img.shields.io/github/workflow/status/Grasscutters/Grasscutter/Build?logo=github&style=for-the-badge"></div>

<div align="center"><a href="https://discord.gg/T5vZU6UyeG"><img alt="Discord - Grasscutter" src="https://img.shields.io/discord/965284035985305680?label=Discord&logo=discord&style=for-the-badge"></a></div>

[EN](README.md) | [简中](docs/README_zh-CN.md) | [繁中](docs/README_zh-TW.md) | [FR](docs/README_fr-FR.md) | [ES](docs/README_es-ES.md) | [HE](docs/README_HE.md) | [RU](docs/README_ru-RU.md) | [PL](docs/README_pl-PL.md) | [ID](docs/README_id-ID.md) | [KR](docs/README_ko-KR.md) | [FIL/PH](docs/README_fil-PH.md) | [NL](docs/README_NL.md) | [JP](docs/README_ja-JP.md) | [IT](docs/README_it-IT.md) | [VI](docs/README_vi-VN.md)

**Attention:** We always welcome contributors to the project. Before adding your contribution, please carefully read our [Code of Conduct](https://github.com/Grasscutters/Grasscutter/blob/stable/CONTRIBUTING.md).

## Current features

* Logging in
* Combat
* Friends list
* Teleportation
* Gacha system
* Co-op *partially* works
* Spawning monsters via console
* Inventory features (receiving items/characters, upgrading items/characters, etc)

## Quick setup guide

**Note**: For support please join our [Discord](https://discord.gg/T5vZU6UyeG).

### Quick Start (automatic)

- Get Java 17: https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html
- Get [MongoDB Community Server](https://www.mongodb.com/try/download/community)
- Get game version REL3.7 (3.7 client can be found here if you don't have it): https://github.com/MAnggiarMustofa/GI-Download-Library/blob/main/GenshinImpact/Client/3.7.0.md)

- Download the [latest Cultivation version](https://github.com/Grasscutters/Cultivation/releases/latest). Use the `.msi` installer.
- After opening Culivation (as admin), press the download button in the upper right corner. 
- Click `Download All-in-One`
- Click the gear in the upper right corner
- Set the game Install path to where your game is located.
- Set the Custom Java Path to `C:\Program Files\Java\jdk-17\bin\java.exe`
- Leave all other settings on default

- Click the small button next to launch.
- Click the launch button.
- Log in with whatever username you want. Password doesn't matter.

### Building

Grasscutter uses Gradle to handle dependencies & building.

**Requirements:**

- [Java SE Development Kits - 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) or higher
- [Git](https://git-scm.com/downloads)

##### Windows

```shell
git clone --recurse-submodules https://github.com/Grasscutters/Grasscutter.git
cd Grasscutter
.\gradlew.bat # Setting up environments
.\gradlew jar # Compile
```

##### Linux (GNU)

```bash
git clone --recurse-submodules https://github.com/Grasscutters/Grasscutter.git
cd Grasscutter
chmod +x gradlew
./gradlew jar # Compile
```

You can find the output jar in the root of the project folder.

### Troubleshooting 

For a list of common issues and solutions and to ask for help, please join [our Discord server](https://discord.gg/T5vZU6UyeG) and go to the support channel.
