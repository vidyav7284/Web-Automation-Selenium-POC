

# 🧪 Web Automation Selenium POC

A Proof of Concept (POC) for end-to-end **web automation testing** using **Selenium WebDriver** and **TestNG**. This project validates an *Add to Cart* functionality (e.g., on Amazon) and follows the **Page Object Model (POM)** design pattern to ensure modularity, scalability, and reusability.
🔗 **GitHub Repository:** [web-automation-poc](https://github.com/vidyav7284/web-automation-poc)

---

## 📸 Project Execution Report

![Demo Screenshot](https://github.com/user-attachments/assets/58a45044-2c70-4f48-a988-357bb421d26c)


## 🎥 Automation Flow (GIF)

![DemoVideo](https://github.com/user-attachments/assets/a6e5e6d7-fd3f-42ca-b060-b926a1857bc5)



---

## 🚀 Features


✅ Automates end-to-end *Amazon Add to Cart* journey  
✅ Implements Page Object Model (POM)  
✅ Uses TestNG for test execution and reporting  
✅ Modular utility classes for screenshots, waits, and config  
✅ Easily maintainable and extendable test structure  
✅ Designed for cross-browser compatibility  
✅ Structured for CI/CD pipeline integration  
✅ Clean naming conventions for readability 

---

## 🔧 Technologies Used

| Tool/Library     | Purpose                       |
| -----------------| ----------------------------- |
| **Java**         | Programming Language          |
| **Selenium Webdriver** | Web Automation Framework      |
| **TestNG**       | Test Framework                |
| **Maven**        | Dependency & Build Management |
| **Eclipse IDE**  | Development Environment       |


---

🗂️ Project Structure


![ProjectSrructure](https://github.com/user-attachments/assets/96cc2b8e-ec7e-41c5-8936-f3fa25d9ea93)

---

## ✅ Test Scenario

```text
Test Case: Validate Add to Cart functionality on Amazon

1. Launch browser and open Amazon homepage
2. Select "Kindle Store" from the category dropdown
3. Click on the search icon
4. Apply "Kindle Unlimited Eligible" filter
5. Sort results by "Best Sellers"
6. Add the first listed product to the cart
7. Verify the product is successfully added
```

## 🧪 How to Run Locally

### 1. Clone the repository

```bash
git clone https://github.com/vidyav7284/web-automation-poc.git
```

### 2. Import into Eclipse

* Open Eclipse.
* File → Import → Existing Maven Project → Choose the project directory

### 3. Install dependencies

Maven will automatically resolve dependencies from `pom.xml`.

### 4. Execute Tests

* Eclipse → Right-click AmazonAddTest.java → Run As → TestNG Test
* You can also run via command line:

```bash
mvn test
```

---

## ✅ Best Practices Followed

✅ Page Object Model (POM)
✅ Modular architecture (Base → Page → Test)
✅ Config-driven test setup
✅ Utility classes for reusability
✅ Assertions and validations added
✅ Clean method and class naming

---

## 📎 Resources

* [Selenium Documentation](https://www.selenium.dev/documentation/)
* [TestNG Docs](https://testng.org/doc/)
* [Maven Guide](https://maven.apache.org/guides/index.html)
* [Apache Maven](https://maven.apache.org/)

---

## 📄 License

This project is licensed under the [Apache 2.0 License](LICENSE).

---

## 👤 Author

**Vidya Vanjare**  
📧 v.vanjare@gmail.com
📎 [LinkedIn](https://www.linkedin.com/in/vidya-vanjare)  
