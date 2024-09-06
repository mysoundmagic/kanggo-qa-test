# Web Automation Testing

This project is an automated testing framework for web applications using Selenium WebDriver, Java Spring, Maven, TestNG, and Eclipse on a Linux Ubuntu environment.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- **Java Development Kit (JDK)**: Install JDK 8 or later.
- **Maven**: Ensure Maven is installed and configured.
- **Eclipse IDE**: Download and install Eclipse IDE for Java Developers.
- **Google Chrome**: Latest version installed.
- **ChromeDriver**: Ensure ChromeDriver is available and compatible with your Chrome version.

## Installation

Follow these steps to set up the project:

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/mysoundmagic/kanggo-qa-test
    ```
2. **Navigate to the Project Directory**:
    ```bash
    cd kanggo-qa-test
    ```
3. **Import the Project in Eclipse**:
    - Open Eclipse.
    - Select `File` > `Import`.
    - Choose `Maven` > `Existing Maven Projects`.
    - Browse to the project directory and click `Finish`.

4. **Install Maven Dependencies**:
 ### 1. Using terminal
    ```bash
    mvn clean install
    ```
  ### 2. Using Eclipse
    ```
    press f11, select maven install
    ```

5. **TestNG**:
### Eclipse
```
install testNG from eclipse marketplace
```

## Running Tests

You can run the tests in two ways:

### 1. Using Eclipse

- Right-click on the `testng.xml` file.
- Select `Run As` > `TestNG Suite`.

### 2. Using Terminal

- Run the following command in your terminal:
    ```bash
    mvn clean install test -Dsurefire.suiteXmlFiles=/home/[user]/Documents/workspace/kanggo-qa-test/testng.xml > /home/[user]/Documents/workspace/kanggo-qa-test/"kanggo_test_$(date +"%d-%m-%Y %H:%M:%S").txt" &
    ```

## Test Reports

The TestNG reports can be found in the `test-ouput/Suite` directory. The reports include details of the tests that were run, including pass/fail status and any errors encountered.

## Project Structure

- `src/main/java`: Contains the main Java code.
- `src/test/java`: Contains the test scripts.
- `pom.xml`: Maven configuration file, which includes all dependencies.
- `testng.xml`: TestNG suite configuration file.

## Dependencies

The key dependencies used in this project include:

- **Selenium WebDriver**: For web browser automation.
- **TestNG**: Testing framework.
- **Java Spring**: Dependency injection and other utilities.
- **Maven**: Build automation tool.

## Contributing

If you want to contribute to this project, please fork the repository and make changes as you'd like. Pull requests are welcome.

## License

This project is open-source and available under the [MIT License](LICENSE).

