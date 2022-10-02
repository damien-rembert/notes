# Packages

# Definition
A package is basically a folder.
The classes in the package indicate they belong to the package before the class is declared
eg:
```java
package library;
public class Program {...}
```

# Nested packages
Packages can be nested and would then be refered like this: mainpackage.nestedpackage

# Imports
A class can access classes inside a package by using the import statement. 
The class Book in the package library.domain is made available for use with the statement import library.domain.Book;

## Placement
Import statements are placed in the source code file after the package definition.
Eg: 
```java
package library;
import library.domain.Book;
public class Program {...}
```

# the name "domain"
"domain" is often used to refer to the storage space of the classes that represent the concepts of the problem domain. Eg, the class Book could be inside the package library.domain, since it represents a concept in the library application.








