# Lambda-expression-evaluator
===========================

A Java-based compiler built with Javacc, parsing and evaluating lambda expressions.

**Table of Contents**
-----------------

* [Introduction](#introduction)
* [Getting Started](#getting-started)
* [Features](#features)
* [Compilation](#compilation)
* [Usage](#usage)
* [License](#license)

**Introduction**
---------------

This project provides a Java-based compiler that can parse and evaluate lambda expressions. The compiler is built
using Javacc, a Java-based parser generator tool. 

**Getting Started**
------------------

To get started with this project, you will need to:

1. Install Javacc and Java Development Kit (JDK) on your machine.
2. Clone this repository using Git: `git clone https://github.com/Gagan-C/Lambda-expression-evaluator.git`
3. Navigate into the cloned repository: `cd Lambda-expression-evaluator`

**Features**
------------

* Parses and evaluates lambda expressions
* Supports basic arithmetic operations (addition, subtraction, multiplication, division)
* Takes a variable as input
* Evaluates everything except for variable
* Optimizes parsing for performance

**Compilation**
--------------

To compile this project, run the following command:
```bash
javacc Prog03.jjt
```

**Usage**
---------

To use this compiler, first compile using javacc as mentioned above and it generates `Prog03` Java file. 

```bash
javac Prog03.java
```
This will compile java classes. To run the program run


```bash
java Prog03
```

**License**
---------

This project is licensed under the MIT License. See `LICENSE` for details.



**Author**
----------

* [Gagan Chatu](mailto:gagan.chatu@gmail.com)