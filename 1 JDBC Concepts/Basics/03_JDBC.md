## There are 2 types of Storage Areas.
1. Temporary Storage Areas
2. Permanent Storage Areas

#### 1. Temporary Storage Areas:
These are the Memory Areas where Data will be stored temporarily.
Eg: All JVM Memory Areas (like Heap Area, Method Area, Stack Area etc).
Once JVM shutdown all these Memory Areas will be cleared automatically.

#### 2. Permanent Storage Areas:
Also known as Persistent Storage Areas.
Here we can store Data permanently.
Eg: File Systems, Databases, Data warehouses, Big Data Technologies etc
---

File Systems:
File Systems can be provided by Local operating System.
File Systems are best suitable to store very less Amount of Information.
---


#### Limitations:
1) We cannot store huge Amount of Information.
2) There is no Query Language support and hence operations will become very complex.
3) There is no Security for Data.
4) There is no Mechanism to prevent duplicate Data. Hence there may be a chance of Data
Inconsistency Problems.
---

To overcome the above Problems of File Systems, we should go for Databases.
Databases:
1) We can store Huge Amount of Information in the Databases.
2) Query Language Support is available for every Database and hence we can perform Database
Operations very easily.
3) To access Data present in the Database, compulsory username and pwd must be required.
Hence Data is secured.
4) Inside Database Data will be stored in the form of Tables. While developing Database Table
Schemas, Database Admin follow various Normalization Techniques and can implement
various Constraints like Unique Key Constrains, Primary Key Constraints etc which prevent
Data Duplication. Hence there is no chance of Data Inconsistency Problems

---

#### Limitations of Databases:

1) Database cannot hold very Huge Amount of Information like Terabytes of Data.
2) Database can provide support only for Structured Data (Tabular Data OR Relational Data) and
cannot provide support for Semi Structured Data (like XML Files) and Unstructured Data (like
Video Files, Audio Files, Images etc)
To overcome this Problems we should go for more Advanced Storage Areas like Big Data
Technologies, Data warehouses etc..
---










