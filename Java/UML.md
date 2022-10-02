# UML

unified modeling language

# Structure of a class diagram:

## class name
name of the class in a rectangle at the top.

## line
A line below the name of the class then

## attributes
the list of attributes (names and types of the class variables).
one attribute per line.
"attributeName: attributeType". A + before the attribute name means the attribute is public, and a - means the attribute is private.
eg -nameOfTheVar: String

## line
A line below the attributes list separates it from the method list

## methods
Methods are written with +/- (depending on the visibility of the method), method name, parameters, and their types.
The parameters are written the same way class attributes are — "parameterName: parameterType".
eg a constructor with a parameter written +Person(initialName:String)
or a print method with no parameter and no return is written +print():void
or +getName():String

# Objects (as attributes)
variables which refer to other objects are not written with the rest of the class attributes, but are shown as connections between the classes
We can also add a label to the arrow to describe the connection. In the above example the arrow has an accompanying label telling us that a Book has an author attribute that is an instance of the Person class.

## Connections/Arrows
The arrow shows the direction of the connection. The connection arrow would go from Book to Person, to show that a Book knows its author but a Person does not know about books they are the author of.

## Labels
to describe the connection. In the above diagram the arrow has an accompanying label telling us that a Book has an author.



## Star near the base of the arrow
star gives some extra information of the connection; even though a show doesn't know about the tickets that have been sold to it, you can still sell many tickets to one show.

## Star near point end of the arrow
 star tells us that a book can have between 0 and unlimited number of authors.




