----------------------------------------------------------------------------------
HASH TABLE IMPLEMENTATION
----------------------------------------------------------------------------------
This is a simple implementation of hash table. The hash table is 
an array of linked lists. 

A simple hashing function (modulo 10), is used
in the current implementation to hash the key to an array position. 
The data is stored in the position returned by hashing function. 

To avoid collisions, we construct a linked list and store the data in the 
linked list. This ensures that even if two keys return same value after 
hashing, they can be stored in a hash table without being overwritten.

----------------------------------------------------------------------------------
HOW TO RUN THIS PROGRAM?
----------------------------------------------------------------------------------
1. Open the project in an IDE, for example : Eclipse
2. Go to class DemoHashTableRunner.java
3. Make the changes you wish to, for inserting, searching the data
4. Run this class
----------------------------------------------------------------------------------
ALGORITHM
----------------------------------------------------------------------------------
1. Inserting a value
   - Accept a key value pair of data that needs to be inserted into the hash table
   - Use hash function on the key to find an integer value (array position)
   - Create an instance of node of linked list
   - insert into the hash table at the position obtained in step 2 above
   
2. Searching for a value
   - Accept the key, value of which you want to search into hash table
   - Use hash function on the key to find an integer value (array position)
   - Obtain the linked list of the position obtained in the previous step
   - Search in the linked list for the key to return the value
   - If no such key is found in the linked list, display a message accordingly

----------------------------------------------------------------------------------
ANALYSIS
----------------------------------------------------------------------------------
1. 30 values stored in the array of capacity 10
2. Searching all 30 values for a key is not necessary, we can simply traverse
   the linked list of the array position returned by the hashing function
3. O(n) = number of values stored in the hash table: This can happen if all the
   keys of the data inserted, map to the same array position. For this reason
   we should choose the hashing function carefully, so that it distributes all
   the keys uniformly over the array
4. Best case is O(1)
----------------------------------------------------------------------------------