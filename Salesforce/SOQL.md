# SOQL

# Quick facts
Object based
Use SELECT
no INSERT, UPDATE, DELETE
no SELECT *

# Try to avoid:
```SQL
-- Querying for null rows
SELECT Id, Name FROM Account WHERE Custom_Field__c = null

-- Negative filter operators—Using operators such as !=, NOT LIKE, or EXCLUDES
SELECT CaseNumber FROM Case WHERE Status != 'New'

-- Leading wildcards—Queries
SELECT Id, LastName, FirstName FROM Contact WHERE LastName LIKE '%smi%'

-- Text fields with comparison operators—Using comparison operators, such as >, <, >=, or <=, with text-based fields
SELECT AccountId, Amount FROM Opportunity WHERE Order_Number__c > 10
```


# Basic query

```SQL
SELECT AccountId, Email, Id, LastName FROM Contact'
```
Each object comprises a number of fields, which correspond to columns in a database. Data is stored in records of the object, which correspond to rows in a database
`SELECT` indicate which columns are required 
`FROM` indicate the object to query

`SELECT` and `FROM` are mandatory but `WHERE` is strongly recommended

# Filtering

```SQL
SELECT AccountId, Email, Id, LastName FROM Contact WHERE Email LIKE '%.net%'
```
`WHERE` selects the column that is going to be used with the filter, here the content of the column email is tested against the `LIKE`, % indicates a wildcard search here, try to avoid these

# Sorting

```SQL
SELECT AccountId,Email,Id,LastName FROM Contact
  WHERE Email LIKE '%.net%' ORDER BY LastName ASC NULLS FIRST
```

# Joins, Primary Keys, Foreign Keys, PKs, FKs
## Child-to-Parent Query

```SQL
SELECT FirstName, LastName, Account.Name FROM Contact
```


##  Parent-to-Children Queries

These are done using nested queries, using the plural name of the child object (Contacts, here).
For custom object (eg My_Object__c), the relationship name is plural AND followed by __r (eg My_Objects__r)
```SQL
SELECT Name, (Select FirstName, LastName FROM Contacts) FROM Account
```
# SOQL Aggregate Functions

Function	Description
AVG()	Returns the average value of a numeric field.
COUNT() and COUNT(fieldName) and COUNT_DISTINCT()	Returns the number of rows matching the query criteria.
MIN()	Returns the minimum value of a field.
MAX()	Returns the maximum value of a field.
SUM()	Returns the total sum of a numeric field.

## Examples
```SQL
SELECT COUNT() FROM Account
```

# GROUP BY
clause, SOQL offers other grouping clauses, such as GROUP BY ROLLUP, GROUP BY CUBE, and GROUPING. These clauses are useful for inspecting the results when a query returns values from several related tables. GROUP BY CUBE is a neat little clause that lets you add subtotals for all combinations of a grouped fields in the query results. To learn more about these clauses, look at the GROUP BY document in Resources.


```Java
List<AggregateResult> results  = [SELECT Industry, count(Id) total
    FROM Account GROUP BY Industry];
for (AggregateResult ar : results) {
    System.debug('Industry: ' + ar.get('Industry'));
    System.debug('Total Accounts: ' + ar.get('total'));
}
```

# HAVING (optional)
similar to the HAVING Clause in SQL Server
Lets you filter the results that an aggregate function returns.



