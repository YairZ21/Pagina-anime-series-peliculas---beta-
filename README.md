¡Por supuesto! Aquí tienes el **README.md en inglés**, manteniendo un tono llamativo y profesional para tu proyecto **ScreenMatch**:

---

````markdown
# 🎬 ScreenMatch

Welcome to **ScreenMatch**!  
A web application built with ❤️ to **explore, manage, and discover your favorite TV shows** like never before.

---

## 🚀 Key Features

✨ Dive into a complete experience for series lovers:

- 📚 **Full series listing**
- 🏆 **Top 5 highest-rated series**
- 🆕 **Latest releases**
- 🔎 **Genre-based search**  
  *(Action, Romance, Comedy, Drama, Crime, Animation, Adventure)*
- 📺 **Detailed seasons and episodes**
- 🌟 **Featured episodes ranking**

---

## 🛠️ Technologies Used

ScreenMatch is powered by a modern and robust Java ecosystem:

- ☕ **Java 17+**
- 🌱 **Spring Boot**
- 🧰 **Maven**
- 🐘 **PostgreSQL**
- 🔗 **JPA / Hibernate**

---

## ⚡ Quick Setup

Follow these simple steps to run the project locally:

1. 📥 Clone the repository:  
   ```bash
   git clone https://github.com/YairZ21/screenmatch.git
   cd screenmatch
````

2. ⚙️ Configure your database in:
   `src/main/resources/application.properties`

3. ▶️ Run the app:

   ```bash
   mvn spring-boot:run -Dspring-boot.run.jvmArguments="--enable-native-access=ALL-UNNAMED"
   ```

---

## 📖 How to Use

Access the API via browser or Postman at:
📍 `http://localhost:8080`

Available endpoints:

* `/series` – All series
* `/genres` – Search by genre
* `/episodes` – Episode details

---

## 🧩 Project Structure

```
📁 model/       → Entities and enums
📁 service/     → Business logic
📁 repository/  → Data access (JPA)
📁 dto/         → Data transfer objects
```

---

## 👨‍💻 Author

Created by **YairZ21**
📫 Let’s connect! Open to feedback, contributions, and ideas.

```

