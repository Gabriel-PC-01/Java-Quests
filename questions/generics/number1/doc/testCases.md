# Test Cases





## Customer



### Email



#### Case 1

​	Test valid inputs on set email() method. emails as "person@something.com"  should pass.

Return :

```java
 EntityStatus.SUCCESS
```



#### Case 2

​	Test invalid inputs. Any email with capital letters, spaces, without "@" should not pass.

Return :

```java
 EntityStatus.INVALID_INPUT
```



#### Case 3

​	 Test Empty and Blank inputs. Emails as "",  "    ", "enter" should not pass. 

Return :

```java
 EntityStatus.EMPTY_INPUT
```



## Name



#### Case 1

​	Test valid inputs on set name() method. names as "Adan Van Bringston"  should pass.

Return :

```java
 EntityStatus.SUCCESS
```



#### Case 2

​	Test invalid inputs. Names whit numbers, special characters should not pass.

Return :

```java
 EntityStatus.INVALID_INPUT
```



#### Case 3

​	 Test Empty and Blank inputs. Names as "",  "    ", "enter" should not pass. 

Return :

```java
 EntityStatus.EMPTY_INPUT
```



## Order



### Product Name



#### Case 1

​	 Test Empty and Blank inputs. Names as "",  "    ", "enter" should not pass. 

Return :

```java
 EntityStatus.EMPTY_INPUT
```



## CustomerName



#### Case 1

​	Test valid inputs on set name() method. names as "Adan Van Bringston"  should pass.

Return :

```java
 EntityStatus.SUCCESS
```



#### Case 2

​	Test invalid inputs. Names whit numbers, special characters should not pass.

Return :

```java
 EntityStatus.INVALID_INPUT
```



#### Case 3

​	 Test Empty and Blank inputs. Names as "",  "    ", "enter" should not pass. 

Return :

```java
 EntityStatus.EMPTY_INPUT
```





## Product



### Name



#### Case 1

​	Test Empty and Blank inputs. Names as "",  "    ", "enter" should not pass. 

Return :

```java
 EntityStatus.EMPTY_INPUT
```



## Quantity



#### Case 1

​	Test invalid  inputs. Numbers as 1, 2, 736  should pass.

Return :

```java
 EntityStatus.SUCCESS
```



#### Case 2

​	Test invalid inputs. Numbers as -34, 00.

Return :

```java
 EntityStatus.INVALID_INPUT
```