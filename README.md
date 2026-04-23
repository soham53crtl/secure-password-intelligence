# 🔐 Secure Password Intelligence System

A full-stack cybersecurity-focused application to analyze password strength, hash passwords securely, and detect potential vulnerabilities.

---

## 🚀 Features

* 🔍 Password strength analysis (length, entropy, patterns)
* 🔐 Secure hashing using SHA-256
* 🌐 REST API built with Spring Boot
* 🖥️ JavaFX GUI for interactive usage
* 🛡️ Basic protection against common passwords

---

## 🧠 Architecture

```
Frontend (JavaFX)
        ↓
Backend (Spring Boot API)
        ↓
Security Layer (Hashing + Validation)
```

---

## 📂 Project Structure

```
secure-password-intelligence/
│
├── frontend-javafx/        # GUI Application
├── backend-springboot/     # REST API
├── analyzer/               # Core logic
├── utils/                  # Security utilities
```

---

## ⚙️ How to Run

### ▶️ Run Analyzer (CLI)

```bash
javac PasswordAnalyzer.java
java PasswordAnalyzer
```

### 🌐 Run Backend (Spring Boot)

```bash
mvn spring-boot:run
```

API Endpoint:

```
POST /api/password/analyze
```

Sample Request:

```json
{
  "password": "Test@123"
}
```

---

## 📊 Sample Output

```
Strength: Strong
Score: 85/100
Hash: e3b0c44298fc1c149afbf4c8996fb924...
```

---

## 🔒 Security Practices Used

* Password hashing (SHA-256)
* Input validation
* Common password blacklist
* Exception handling

---

## 📈 Future Enhancements

* Integration with breach detection APIs
* JWT authentication system
* Database storage (MySQL)
* Cloud deployment

---

## 📜 License

This project is licensed under the MIT License.

