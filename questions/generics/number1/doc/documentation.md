## Classes e Interfaces





## Entities



Entity is a abstraction that hides the real entity of controller and DAO. The classes Customer, Product and Order inherit Entity and implements your own get fields.



### Entity

**methods**:

```java
Map getFields()
```





**attributes**:

```java
	protected final String type;
```








### Customer

**methods**:

```java
	EntityStatus setName(String name)

	EntityStatus setEmail(String email)
```





**attributes**:

```java
	private String name
	private String email
```





### Product

**methods**:

```java
	EntityStatus setName(String productName)

	EntityStatus setQuantity(Integer quantity)
```





**attributes**:

```java
	private Integer quantity
	private String name
```



### Order

**methods**:

```java
	EntityStatus setCustomerName(String customerName)

	EntityStatus setProductName(String productName)
```





**attributes**:

```java
	private String productName
	private String customerName
```

