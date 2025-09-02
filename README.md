# Authentication System 🔐

An **enterprise-level authentication system** built with **Java Spring Boot** and **Spring Security**, featuring JWT-based authentication, email verification via OTP, and secure password reset functionality. This project demonstrates secure authentication workflows and modern backend practices.

---

## 🚀 Features
- User registration and login/logout
- **JWT authentication** with role-based access control
- **Email verification via OTP** using Bravo SMTP & JavaMailService
- **Password reset** with secure email link
- Persistent storage with **MySQL** (via JPA & Hibernate)
- Simplified code using **Lombok**
- API testing with **Postman**

---

## 🛠️ Tech Stack
- **Backend:** Java, Spring Boot, Spring Security, JPA, Hibernate
- **Authentication:** JWT (JSON Web Token)
- **Email Service:** Bravo SMTP, JavaMailService
- **Database:** MySQL
- **Other Tools:** Lombok, Postman

---

## 📂 Project Structure
```
Authentication-System/
│-- src/main/java/com/example/auth/
│   │-- config/        # Security & JWT configuration
│   │-- controller/    # REST API controllers
│   │-- dto/           # Data Transfer Objects
│   │-- entity/        # JPA entities
│   │-- repository/    # Database repositories
│   │-- service/       # Business logic & email service
│   │-- util/          # Utility classes (JWT utils, etc.)
│
│-- src/main/resources/
│   │-- application.properties  # DB & SMTP configuration
│
│-- pom.xml
```

---

## ⚙️ Installation & Setup
1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/authentication-system.git
   cd authentication-system
   ```

2. **Configure Database & SMTP**
   - Open `src/main/resources/application.properties`
   - Add your MySQL credentials & SMTP details (Bravo SMTP)

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/auth_db
   spring.datasource.username=root
   spring.datasource.password=yourpassword

   spring.mail.host=smtp.bravo.com
   spring.mail.port=587
   spring.mail.username=your-email@example.com
   spring.mail.password=your-email-password
   ```

3. **Build & Run the Project**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. **Test APIs with Postman**
   - Import the Postman collection (if provided) or test endpoints manually.

---

## 🔑 API Endpoints
| Method | Endpoint                | Description              |
|--------|-------------------------|--------------------------|
| POST   | `/api/auth/register`    | Register new user        |
| POST   | `/api/auth/login`       | Login & get JWT token    |
| POST   | `/api/auth/logout`      | Logout user              |
| POST   | `/api/auth/verify-otp`  | Verify email OTP         |
| POST   | `/api/auth/reset-pass`  | Reset password via email |

---

## 🧪 Testing
- Use **Postman** to test REST APIs
- Verify JWT tokens using Authorization headers
- Check email inbox for OTP & password reset links

---

## 📌 Future Enhancements
- Add refresh tokens for extended sessions
- Implement 2FA (Two-Factor Authentication)
- Dockerize application for deployment

---

## 🤝 Contributing
Pull requests are welcome! For major changes, please open an issue first to discuss what you’d like to change.

---

## 📜 License
This project is licensed under the MIT License.

---

### 💡 Author
👤 Your Name  
📧 your.email@example.com  
🔗 [LinkedIn](https://www.linkedin.com/in/yourprofile) | [GitHub](https://github.com/your-username)
