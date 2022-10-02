# HashMap


# hashmap operations
.containsKey(key)
.put(key, value)
.putIfAbsent(key, value)
.remove(key)
.get(key)
.getOrDefault(key, default value)
.keyset() // returns a set containing the keys
.values() // returns a collection containing the values

```java
// import the hashmap class so the program can use it
import java.util.HashMap;


HashMap<String, Book> directory = new HashMap<>();
```


# methods needed
for a class to be used as a HashMap's key, we need to define for it:
    the equals method, so that all equal or approximately equal objects cause the comparison to return true and all false for all the rest
    the hashCode method, so that as few objects as possible end up with the same hash value



# keyset and Going Through A Hash Map's Keys
We can go through the values ​​of a hash map by using a for-each loop on the set returned by the keySet() method of the hash map.

```java
public ArrayList<Book> getBookByPart(String titlePart) {
    titlePart = sanitizedString(titlePart);

    ArrayList<Book> books = new ArrayList<>();

    for(String bookTitle : this.directory.keySet()) {
        if(!bookTitle.contains(titlePart)) {
            continue;
        }

        // if the key contains the given string
        // we retrieve the value related to it
        // and add it tot the set of books to be returned

        books.add(this.directory.get(bookTitle));
    }

    return books;
}
```




