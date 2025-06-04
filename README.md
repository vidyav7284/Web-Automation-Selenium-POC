# 🧪 Selenium-Testng-Automation

This repository presents a **Proof of Concept (POC)** for automating a typical e-commerce flow — specifically, the **"Add to Cart" functionality** — using **Selenium WebDriver** and **TestNG**. The framework is designed with the **Page Object Model (POM)** architecture to promote scalability, maintainability, and ease of use.

🔗 **GitHub Repository:** [selenium-testng-automation](https://github.com/vidyav7284/Web-Automation-Selenium-POC)

---

## 📸 Test Execution Report

![ProjectReport](https://github.com/user-attachments/assets/d42939ed-c8e8-4bbc-a9b9-874883c46f0b)

## 🎥 Automation Demo (GIF)

![DemoVideo](https://github.com/user-attachments/assets/f8e0d8c5-71c5-4da8-b471-709b60b3ac35)

---

## 🚀 Key Features

- ✅ End-to-end test flow for Amazon's *Add to Cart* functionality  
- ✅ Uses **Page Object Model (POM)** for code separation  
- ✅ Executes tests using **TestNG** framework  
- ✅ Modular utility classes (e.g., waits, screenshots, config reader)  
- ✅ Designed for cross-browser compatibility  
- ✅ Ready for integration into **CI/CD pipelines**  
- ✅ Clean and maintainable codebase with descriptive naming conventions

---

## 🔧 Tech Stack

| Tool / Library       | Purpose                        |
|----------------------|--------------------------------|
| **Java**             | Programming language           |
| **Selenium WebDriver** | Browser automation            |
| **TestNG**           | Test execution and reporting   |
| **Maven**            | Build and dependency management|
| **Eclipse IDE**      | Development environment        |

---

## 🗂️ Project Structure

![ProjectStructure](https://github.com/user-attachments/assets/7494802b-a24d-40be-af91-0a3f098eee27)

---

## ✅ Test Case Scenario

```text
Title: Add to Cart Workflow (Amazon)

Steps:
1. Open Amazon homepage
2. Select "Kindle Store" from the category dropdown
3. Initiate a search
4. Apply the "Kindle Unlimited Eligible" filter
5. Sort results by "Best Sellers"
6. Add the first item to the cart
7. Verify item has been added successfully
```

---

## 💻 How to Run This Project

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/vidyav7284/web-automation-poc.git
```

### 2️⃣ Import the Project into Eclipse
- Go to **File > Import > Existing Maven Project**
- Select the project root directory

### 3️⃣ Resolve Dependencies
- Maven will handle dependency installation via `pom.xml`

### 4️⃣ Execute the Tests
- From Eclipse: Right-click `AmazonAddTest.java` → Run As → **TestNG Test**
- Or from terminal:
```bash
mvn test
```

---

## 🧩 Best Practices Implemented

- ✅ Clean separation using Page Object Model  
- ✅ Configuration-driven setup  
- ✅ Utility classes for common functions  
- ✅ Proper assertions and validations  
- ✅ Modular and layered test design  
- ✅ Readable and reusable method structure

---

## 📎 Helpful Resources

- [Selenium Documentation](https://www.selenium.dev/documentation/)
- [TestNG Docs](https://testng.org/doc/)
- [Maven Guide](https://maven.apache.org/guides/index.html)
- [Apache Maven](https://maven.apache.org/)

---

## 📄 License

Licensed under the [Apache 2.0 License](LICENSE)

---

## 👩‍💻 Author

**Vidya Vanjare**  
📧 v.vanjare@gmail.com  
🔗 [LinkedIn](https://www.linkedin.com/in/vidya-vanjare)
