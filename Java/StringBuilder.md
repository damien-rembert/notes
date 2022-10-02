# StringBuilder


 A new StringBuilder object is created with a new StringBuilder() call, and content is added to the object using the overloaded append method, i.e., there are variations of it for different types of variables. Finally, the StringBuilder object provides a string using the toString method.


```java
StringBuilder numbers = new StringBuilder();
for (int i = 1; i < 5; i++) {
    numbers.append(i);
}
System.out.println(numbers.toString());
```

