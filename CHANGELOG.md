## 📄 Alpha Change Log

Due to significant reworks behind the scenes and plans to release additional features in the near future, this release
is marked as an alpha release. Bug fixes and new features may be released rapidly and with little or no testing. **It is
recommended to backup your saves** and let us know if you experience any issues with this release!

***

**This release tests our automatic publishing system!** You may see this release appear and disappear as testing is
performed or mod details may be slightly incorrect.

Note: There is no need to update to this version at this time, so you can safely remain on older versions while testing
is performed.

***

### ⚙️ Improvements

- Updated mod dependencies on some versions.

### 🔧 Developer Changes

- Fixed Forge datagen on 1.16 to allow running all 1.16+ versions on modern Java.
- Improved some of the GitHub files, such as the code of conduct and contributing guidelines.
- Added automatic build testing to GitHub Actions, to ensure the mod at least compiles successfully.
- Added automatic publishing to GitHub Actions to improve update speed.
- Fixed data generation on 1.18 causing a bad Forgix merge.
- Removed Maven publishing references, as Maven publishing is currently not being performed.