# DML

Data Manipulation Language

# Statements
Statement
	Description

insert
	Inserts a new record.

update
	Updates an existing record.

upsert
	This is a special operation that creates new records and updates records within a single statement. It uses a specified field to determine the presence of existing objects, or the ID field if no field is specified.

delete
	Deletes an existing record.

undelete
	Restores one or more existing records from the recycle bin.

merge
	This is another special operation that can merge up to three records of the same object type into one of the records. It will then delete the other records and reparent any related records.

# Execute by using the statement
```Java
// Add Account
Account acct = new Account(
    Name='Test Account',
    Phone='(225)555-8989',
    NumberOfEmployees=10,
    BillingCity='Baton Rouge');
insert acct;
```

# Using Database class methods
```java
// Add Account
Account acct = new Account(
    Name='Test Account',
    Phone='(225)555-8989',
    NumberOfEmployees=10,
    BillingCity='Baton Rouge');
Database.SaveResult[] results = Database.insert(acct, false);
```