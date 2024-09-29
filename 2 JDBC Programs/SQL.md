<!-- @format -->

Here's how you can structure the given SQL commands in a Markdown file:

````markdown
# MySQL Command Line Client

## Show Existing Databases

```sql
SHOW DATABASES;
```
````

## Create and Use a Database

```sql
CREATE DATABASE IF NOT EXISTS mydb;
USE mydb;
```

## Create `students` Table

```sql
CREATE TABLE students(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    age INT NOT NULL,
    marks DOUBLE NOT NULL
);
```

## Describe `students` Table Structure

```sql
DESCRIBE students;
```

## Insert Data into `students` Table

```sql
INSERT INTO students(name, age, marks) VALUES("Amit", 21, 96.3);
```

## Select All Data from `students` Table

```sql
SELECT * FROM students;
```

---

## Create `accounts` Table

```sql
CREATE TABLE accounts(
    id INT,
    account_number INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    balance DOUBLE DEFAULT 1000.0
);
```

## Insert Data into `accounts` Table

```sql
INSERT INTO accounts(account_number, name) VALUES(101, "Ankit");
INSERT INTO accounts(account_number, name) VALUES(102, "Rohan");
```

## Select All Data from `accounts` Table

```sql
SELECT * FROM accounts;
```

---
