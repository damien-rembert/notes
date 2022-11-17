# SOSL

SOSL is most useful when you don’t know the exact fields and objects that your data resides in, and you need to search across multiple objects. This is especially true when those objects aren’t related because SOQL works only with related objects.

# Example

```SQL
FIND {"grand*"} IN ALL FIELDS RETURNING Account(Name), Contact(LastName, FirstName, Email)
```

# FIND Clause with Search Term
* matches zero or more characters at the middle or end of the search term
? matches only one character at the middle or end of the search term

# IN Clause
Where to look
instead of specifying ALL FIELDS, you want to search only name fields. Then you would use NAME FIELDS. To search only phone fields, use PHONE FIELDS.

# RETURNING Clause
If you specify an object name without a field name in parenthesis, the search return only the ID for that object if a match is found.
