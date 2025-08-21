# Lucien AI

Your own super-human librarian to manage your personal knowledge systems.

## Description

Lucien AI is a Spring Boot application that leverages OpenAI's API to provide intelligent knowledge management capabilities. Built with Spring AI, it serves as a personal librarian to help organize and interact with your information systems.

## Requirements

- Java 24 or higher
- Maven 4.0.0-rc-1 or higher
- OpenAI API key

## Setup

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd lucien
   ```

2. **Configure your OpenAI API key**
   - Copy the example configuration file:
     ```bash
     cp application-local.yml.example application-local.yml
     ```
   - Edit `application-local.yml` and add your OpenAI API key:
     ```yaml
     spring:
       ai:
         openai:
           api-key: sk-your-actual-openai-api-key-here
     ```
   - Get your API key from: https://platform.openai.com/api-keys

3. **Build and run the application**
   ```bash
   ./mvnw spring-boot:run
   ```

## Development

### Prerequisites

This project requires:
- Java 24 (enforced by Maven configuration)
- Maven 4.0.0-rc-1+ (enforced by maven-enforcer-plugin)

The project uses Spring Boot 3.5.4 and Spring AI 1.0.1.

### Running Tests

```bash
./mvnw test
```

### Building

```bash
./mvnw clean package
```

## Configuration

The application uses Spring Boot's configuration system. Key configuration files:

- `src/main/resources/application.yml` - Main application configuration
- `application-local.yml` - Local development configuration (not tracked in git)

### Environment Variables

You can also set your OpenAI API key as an environment variable:
```bash
export OPENAI_API_KEY=sk-your-actual-openai-api-key-here
```

## Project Structure

```
src/
├── main/
│   ├── java/co/thirtyroses/ai/lucien/
│   │   └── LucienAiApplication.java     # Main Spring Boot application
│   └── resources/
│       └── application.properties       # Application configuration
└── test/
    └── java/co/thirtyroses/ai/lucien/
        └── LucienAiApplicationTests.java # Application tests
```

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](http://www.apache.org/licenses/LICENSE-2.0.txt) for details.