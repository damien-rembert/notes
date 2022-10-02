# Loops

# continue
The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

# for loops
```java
// used when the number of iteration is definite
for (int i = 0; i < teachers.size(); i++) {
    String teacher = teachers.get(i);
    // contents of the for each loop:
    System.out.println(teacher);
}
```

# while loops
```java
// used when unknown number of iteration
while (true) {
    if (x == 0) {
		
	} else {
		break;
	}
```


# with an array
## For loop
```java
ArrayList<String> teachers = new ArrayList<>();

teachers.add("Simon");
teachers.add("Samuel");
teachers.add("Ann");
teachers.add("Anna");
for (int i = 0; i < teachers.size(); i++) {
    String teacher = teachers.get(i);
    // contents of the for each loop:
    System.out.println(teacher);
}
```

## for-each loops
```java
ArrayList<String> teachers = new ArrayList<>();

teachers.add("Simon");
teachers.add("Samuel");
teachers.add("Ann");
teachers.add("Anna");

for (String teacher: teachers) {
// for each object/String contained in the ArrayList teachers, put the content/String/object in the teacher variable
// this would also work for objects, not just strings
    System.out.println(teacher);
}
```
