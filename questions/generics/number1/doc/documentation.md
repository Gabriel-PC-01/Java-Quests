## Classes e Interfaces





#### Entity

assinatura :

​	abstract class Entity

métodos:

​	getFields() : final HashMap;

​	toRegister() : final String

atributos:

​	protected final String type;



#### Responce



assinatura :

​	record Responce

atributos:

​	enum ResponceStatus

​	String menssage

​	Object source



#### ResponceStatus

assinatura :

​	enum ResponceStatus

atributos :

​	ALREADY_EXISTS

​	OK

​	NOT_FOUND



#### Repository



assinatura :

​	class Repository <T extends Entity>

métodos :

​	searchEntity(Entity anEntity) : final Responce

​	addEntity(Entity anEntity) : final Responce

​	replaceEntityData(Entity anEntity) : final Responce

​	private toRegister(Entity anEntity) : String



#### Data manipulate

assinatura

class DataMainpulate



metodos

​	writeRegister(String Register, folderPath)

​	readRegister(String Register, folderPath)
