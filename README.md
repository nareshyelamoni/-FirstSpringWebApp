# First Spring Boot Web Application

## 📌 Project Overview

FirstSpringWebApp is a beginner-level web application developed using **Spring Boot, Spring MVC, and JSP**.

This project demonstrates how to develop a simple web application using the Model-View-Controller (MVC) architecture. It accepts browser requests, processes them through a Spring MVC Controller, passes data using `ModelAndView`, and displays the response on a JSP page.

## 🚀 Technologies Used

- Java 25
- Spring Boot 4.2.0
- Spring MVC
- JSP (JavaServer Pages)
- Apache Tomcat 11
- Maven
- HTML
- Eclipse / IntelliJ IDEA

## ✨ Features

- Developed using Spring Boot.
- Implemented Spring MVC architecture.
- Handled HTTP requests using `@RequestMapping`.
- Used `ModelAndView` to transfer data from Controller to View.
- Configured JSP View Resolver.
- Displayed dynamic content using JSP Expression Language (EL).

## 📂 Project Structure

```text
FirstSpringWebApp
│
├── src
│   └── main
│       ├── java
│       │   └── com
│       │       └── naresh
│       │           └── FirstSpringWebApp
│       │               └── controller
│       │                   └── FirstController.java
│       │
│       ├── resources
│       │   └── application.properties
│       │
│       └── webapp
│           └── index.jsp
│
├── pom.xml
└── README.md
```

## ⚙️ Application Configuration

The application is configured using `application.properties`.

```properties
spring.application.name=FirstSpringWebApp

spring.mvc.view.prefix=/
spring.mvc.view.suffix=.jsp

server.port=8484
```

## 💻 Controller Implementation

The `FirstController` handles the `/welcome` request and returns a `ModelAndView` object.

```java
@Controller
public class FirstController {

    @RequestMapping("/welcome")
    public ModelAndView displaySomeResponse() {

        ModelAndView mav = new ModelAndView();

        mav.addObject("message",
                "Hello, Welcome to our first web app");

        mav.setViewName("index");

        return mav;
    }
}
```

## 🌐 JSP View

The `index.jsp` page displays the message received from the Controller using JSP Expression Language.

```jsp
<%@ page language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>First Web Project in Spring</title>
</head>
<body>
    <marquee>${message}</marquee>
</body>
</html>
```

## ▶️ How to Run the Project

1. Clone this repository:

```bash
git clone https://github.com/nareshyelamoni/FirstSpringWebApp.git
```

2. Open the project in IntelliJ IDEA or Eclipse.

3. Make sure Java and Maven are configured.

4. Build the project using Maven.

```bash
mvn clean install
```

5. Run `FirstSpringWebAppApplication.java`.

6. Open the browser and visit:

```text
http://localhost:8484/welcome
```

## 🔄 Spring MVC Request Flow

```text
Browser Request
      |
      v
FirstController
      |
      v
ModelAndView
      |
      v
View Resolver
      |
      v
index.jsp
      |
      v
HTML Response
```

## 🎯 Learning Outcomes

Through this project, I learned:

- Basics of Spring Boot web application development.
- Understanding of Spring MVC architecture.
- Working with `@Controller` and `@RequestMapping`.
- Passing data using `ModelAndView`.
- Integrating JSP with Spring Boot.
- Configuring Spring MVC View Resolver.

## 👨‍💻 Author

**Naresh Yelamoni**

- GitHub: [nareshyelamoni](https://github.com/nareshyelamoni)

---

⭐ If you find this project useful, feel free to explore the repository!