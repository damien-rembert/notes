# Iterator class

# definition
ArrayList and other "object containers" that implement the Collection interface implement the Iterable interface, and they can also be iterated over with the help of an iterator - an object specifically designed to go through a particular type of object collection.
In the following example the iterator is requested from the cards list containing cards. The iterator can be thought of as a "finger" that always points to a particular object inside the list. Initially it points to the first item, then to the next, and so on... until all the objects have been gone through with the help of the "finger".

# methods
.hasNext() method is used to ask if there are any objects still to be iterated over.
.next() requests the next object in line if it exists. This method returns the next object in line to be processed and moves the iterator, or "finger", to point to the following object in the collection.
.remove() If you want to remove some of the objects from the list during a traversal, you can do so using an iterator. Calling the remove method of the iterator object neatly removes form the list the item returned by the iterator with the previous next call. Here's a working example of the version of the method:



# example
public void print() {
    Iterator<Card> iterator = cards.iterator();

    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }
}
OR
public void print(){
    Iterator<Card> iterator = cards.iterator();

    while (iterator.hasNext()) {
        Card nextInLine = iterator.next();
        System.out.println(nextInLine);
    }
}


## example remove()
while (iterator.hasNext()) {
            if (iterator.next().getValue() < value) {
                // removing from the list the element returned by the previous next-method call
                iterator.remove();
            }
        }
