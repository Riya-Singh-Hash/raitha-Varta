# Raitha-Varta 🌾

### Android-Based Agriculture Advisory Application

Raitha-Varta is an Android application developed to simplify agricultural advisory information for farmers. The application converts lengthy crop advisories and farming recommendations into short, swipeable flash cards with crop images and actionable tips. The project focuses on improving accessibility, usability, and offline availability of farming knowledge for rural users.

---

# 📌 Problem Statement

Agricultural experts and Krishi Vigyana Kendras (KVKs) often release farming advisories in lengthy PDF documents or text-heavy formats that are difficult for farmers to read and understand quickly.

Farmers require:

* Simple and concise farming guidance
* Crop-specific recommendations
* Easy-to-use mobile interfaces
* Offline accessibility in rural areas

Raitha-Varta solves this problem by presenting farming tips as short visual flash cards.

---

# 🚀 Features

✅ Swipeable farming flash cards using ViewPager2
✅ Crop-specific advisory tips
✅ Offline-first architecture using Room Database
✅ High-contrast farmer-friendly UI
✅ Crop image support using Glide
✅ MVVM Architecture
✅ Fast and lightweight Android application
✅ Support for multiple crops:

* Paddy
* Coconut
* Tomato
* Areca Nut

---

# 🛠 Tech Stack

| Technology        | Purpose                 |
| ----------------- | ----------------------- |
| Kotlin            | Android App Development |
| Android Studio    | IDE                     |
| XML Layouts       | UI Design               |
| ViewPager2        | Swipeable Flash Cards   |
| Room Database     | Offline Storage         |
| Glide             | Image Loading           |
| MVVM Architecture | Clean Code Structure    |
| LiveData          | UI State Updates        |
| Coroutines        | Background Processing   |
| Git & GitHub      | Version Control         |

---

# 🏗 Architecture

The project follows the MVVM (Model-View-ViewModel) architecture.

### Layers:

* **Presentation Layer** → UI & ViewPager2
* **ViewModel Layer** → UI State Management
* **Repository Layer** → Data Handling
* **Room Database Layer** → Local Storage

---

# 📂 Project Structure

```text
app/
 ├── data/
 │    └── local/
 │         ├── TipDao.kt
 │         ├── TipDatabase.kt
 │         └── TipEntity.kt
 │
 ├── repository/
 │    └── TipRepository.kt
 │
 ├── ui/
 │    ├── adapter/
 │    │     └── TipPagerAdapter.kt
 │    │
 │    └── viewmodel/
 │          └── TipViewModel.kt
 │
 ├── res/
 │    ├── layout/
 │    │     ├── activity_main.xml
 │    │     └── item_tip.xml
 │    │
 │    └── drawable/
 │
 └── MainActivity.kt
```

---

# ⚙️ Installation & Setup

## Prerequisites

* Android Studio
* Android SDK
* Kotlin Support
* Git

---

# 📥 Clone Repository

```bash
git clone https://github.com/Riya-Singh-Hash/raitha-Varta.git
```

---

# ▶️ Open Project

1. Open Android Studio
2. Click **Open Project**
3. Select the cloned folder

---

# ▶️ Run Application

1. Connect Android device OR start emulator
2. Click:

```text
Run ▶
```

OR press:

```text
Shift + F10
```

---

# 🌟 Future Enhancements

* Kannada language support
* AI-generated farming recommendations
* Weather-based crop alerts
* Pest disease detection using camera
* Voice assistant support
* Push notifications for daily tips

---

# 📊 Key Learning Outcomes

* Android application development using Kotlin
* MVVM architecture implementation
* Room Database integration
* Offline-first mobile app design
* UI/UX design for rural users
* Dependency and Gradle management
* Debugging and testing Android applications

---

# 👨‍💻 Developed By

Riya Singh
Department of Computer Science & Engineering

---

# 📚 References

* Android Developers Documentation
* Kotlin Documentation
* Room Database Documentation
* Glide Documentation
* ViewPager2 Documentation

---

# 📌 Conclusion

Raitha-Varta demonstrates how mobile technology can simplify agricultural knowledge delivery for rural farmers. By converting complex farming advisories into short visual flash cards, the application improves accessibility, usability, and digital inclusion in agriculture.
