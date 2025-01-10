# Animal ReHoming

Animal ReHoming is a Spring Boot application designed to manage animal shelters, caretakers, adoptions, and rewards. This project provides RESTful APIs for managing various entities such as animals, shelters, caretakers, adoptions, and users.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)

## Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/animal-rehoming.git
    cd animal-rehoming
    ```

2. Build the project using Maven:
    ```sh
    ./mvnw clean install
    ```

3. Run the application:
    ```sh
    ./mvnw spring-boot:run
    ```

## Usage

Once the application is running, you can access the API at [http://localhost:5000](http://_vscodecontentref_/0).

## API Endpoints

### Caretaker Endpoints

- **Get Caretaker by ID**
    ```http
    GET /careteker/{id}
    ```

- **Add Caretaker**
    ```http
    POST /careteker
    ```

- **Update Caretaker**
    ```http
    PUT /careteker
    ```

### Shelter Endpoints

- **Get Shelter by ID**
    ```http
    GET /shelter/{id}
    ```

- **Add Shelter**
    ```http
    POST /shelter
    ```

- **Update Shelter**
    ```http
    PUT /shelter
    ```

- **Delete Shelter**
    ```http
    DELETE /shelter
    ```

### Animal Endpoints

- **Get Animals**
    ```http
    GET /animal/{id}
    ```

- **Add Animal**
    ```http
    POST /animal
    ```

- **Update Animal**
    ```http
    PUT /animal/{id}
    ```

- **Delete Animal**
    ```http
    DELETE /animal
    ```

### Adoption Endpoints

- **Add Adoption**
    ```http
    PUT /adoption
    ```

### User Endpoints

- **Get User by ID**
    ```http
    GET /user/{id}
    ```

- **Create User**
    ```http
    POST /user
    ```

- **Update User**
    ```http
    PUT /user/{id}
    ```

- **Delete User**
    ```http
    DELETE /user/{id}
    ```

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

## License

This project is licensed under the MIT License.
