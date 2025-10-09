
# 📰 HeadLines Plus – Personalized News Recommendation System

A modular Java-based application that delivers personalized news recommendations based on user interactions and preferences. Built with JavaFX, MySQL, and core Object-Oriented Programming principles, this system offers content categorization, adaptive learning, and a user-friendly interface.

---

## 🚀 Features

### 👤 User Functionality
- ✅ **User Registration & Login** (with validation)
- 📂 **View Uncategorized and Categorized Articles**
- 👍 **Interact with Articles** (Read, Like, Skip)
- 🧠 **Personalized Recommendations** (via TF-IDF + weighting)
- 📜 **View Interaction History**
- 🛠 **Update Account Information**

### 🛠 Admin Functionality
- 🔐 **Admin Login**
- 👥 **View & Delete Registered Users**
- 🌐 **Activate NewsAPI** to fetch new articles
- 💾 **Store Fetched Articles** in the database

---

## 🧠 Recommendation Engine

- 📊 **TF-IDF Vectorization** of combined article text (title + description + content)
- 🧮 **Cosine Similarity** for relevance computation
- 📈 **Adaptive Weighting Algorithm** to refine future recommendations
- 📂 **User-Specific Dataset** created dynamically from past interactions

---

## 🧱 System Architecture

```text
+-----------------------------+
|        JavaFX GUI          |
| (Login, Register, Articles)|
+-------------+--------------+
              |
              v
+-------------+--------------+
|       Controllers Layer     |
| (HomeController, NewsApp...)|
+-------------+--------------+
              |
              v
+-------------+--------------+
|       Core Classes Layer    |
| (User.java, Article.java...)|
+-------------+--------------+
              |
              v
+-------------+--------------+
|    Services and Utilities   |
| (APIService, NewsParser...) |
+-------------+--------------+
              |
              v
+-------------+--------------+
|     MySQL Database Layer    |
| (users, articles, preferences) |
+-----------------------------+
```

---

## 🧰 Tech Stack

| Layer              | Technology                         |
|--------------------|-------------------------------------|
| 👨‍💻 GUI Frontend     | JavaFX + FXML + CSS                |
| 💡 Business Logic    | Java (OOP principles)              |
| 🧠 ML Integration     | TF-IDF + Cosine Similarity         |
| 🔗 API Integration    | NewsAPI.org                        |
| 🗄️ Database           | MySQL (via JDBC)                   |
| 📁 File Handling      | CSV/JSON where needed              |
| 🧪 Testing            | Manual Testing + Debugging         |

---

## ⚙️ Setup Instructions

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/headlines-plus.git
   ```

2. **Open Project** in IntelliJ IDEA (or any Java IDE with JavaFX support)

3. **Set Up Database**:
   - Create a MySQL database named: `news_appdb`
   - Use the provided [DB dump](https://drive.google.com/drive/folders/1syL2YVZ4NqC_49GVhmQ_IMqM3PBWn40E?usp=sharing) to restore tables: `users`, `articles`, `user_preferences`, etc.

4. **Insert Your API Key**:
   - Get a free key from [NewsAPI.org](https://newsapi.org)
   - Paste it in `APIService.java`

5. **Run the Application**:
   - Start from `Main.java`
   - Explore features: Register → Browse → Interact → Get Recommendations!

---

## 📚 References

- [TF-IDF Explained – GeeksforGeeks](https://www.geeksforgeeks.org/understanding-tf-idf-term-frequency-inverse-document-frequency/)
- [Content-Based Recommendation – GFG](https://www.geeksforgeeks.org/ml-content-based-recommender-system/)
- [Java MySQL Integration – YouTube](https://www.youtube.com/watch?v=T5Hey0e2Y_g)
- [NewsAPI Documentation](https://newsapi.org)

---

## Issues

Feel free to add any issues you find 

---
## 👨‍🎓 Author

**Deshan Senanayake**  

