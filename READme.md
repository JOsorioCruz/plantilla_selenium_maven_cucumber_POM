# Proyecto de Automatización con Selenium, Cucumber, Allure y Page Object Model

Este proyecto es una plantilla básica para automatización de pruebas utilizando Selenium WebDriver, Cucumber, Allure y siguiendo el patrón de diseño Page Object Model (POM). Se utiliza Maven como herramienta de construcción y gestión de dependencias.

## Estructura del Proyecto

````
selenium_maven_allure_cucumber_POM
├── .idea
├── .mvn
├── src
│ └── test
│ ├── java
│ │ ├── pages
│ │ │ ├── BasePage.java
│ │ │ └── LoginPage.java
│ │ ├── runners
│ │ │ └── TestRunner.java
│ │ └── steps
│ │ └── LoginSteps.java
│ └── resources
│ └── features
│ └── login.feature
├── target
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md

````
## Tecnologías Utilizadas

- **Selenium WebDriver**: [Descargar](https://www.selenium.dev/downloads/)
- **Cucumber**: [Documentación](https://cucumber.io/docs/guides/10-minute-tutorial/)
- **Allure**: [Documentación](https://docs.qameta.io/allure/)
- **Maven**: [Descargar](https://maven.apache.org/download.cgi)
- **WebDriverManager**: [GitHub](https://github.com/bonigarcia/webdrivermanager)

## Ejecutar pruebas

Paso 1: Ejecutar las Pruebas
```bash
mvn clean test
```

Paso 2: Generar Reporte de Allure
```bash
mvn allure:report
```

Paso 3: Ver el reporte de Allure
```bash
mvn allure:serve
```

#  📫 Contacto
Para más información o consultas, puedes contactarme a través de mi correo electrónico: [osoriocruzjairo@gmail.com](mailto:osoriocruzjairo@gmail.com) o LinkedIn: [Jairo Osorio Cruz](https://www.linkedin.com/in/jairo-osorio-c-8461061b3/).

[![Email](https://img.shields.io/badge/-Email-D14836?style=flat&logo=gmail&logoColor=white)](mailto:osoriocruzjairo@gmail.com)
[![LinkedIn](https://img.shields.io/badge/-LinkedIn-0077B5?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/jairo-osorio-c-8461061b3/)

