# README


Hibernate框架hibernate.cfg.xml配置文件，配置自动生成表结构策略。
<property name="hbm2ddl.auto"></property>
key -- hbm2ddl.auto：自动生成表结构策略
value -- update(使用最多)：当数据库不存在表时，hibernate启动后会自动生成表结构。
　　　　　　　　　　　　 当数据库表存在时，如果一样，则只会写入数据，不会改变表结构。
　　　　　　　　　　　　 当数据库表存在时，如果不一样，则会修改表结构，原有的表结构不会改变。
　　　  create（很少）：无论表结构是否存在，hibernate启动后都会重新生成表结构。（造成之前的数据丢失）
　　　  create-drop（极少）：无论表结构是否存在，hibernate启动都会重新生成表结构。并且hibernate关闭后，表结构会被删除。来无影去无踪。
　　　  validate（很少）：不会创建表结构，不会修改表结构。校验与数据库中的表结构是否一样，如果不一样则报异常。



<property name="hibernate.default_schema">C##TEST01</property>

```shell
四月 06, 2021 10:11:41 下午 org.hibernate.Version logVersion
INFO: HHH000412: Hibernate Core {5.0.6.Final}
四月 06, 2021 10:11:41 下午 org.hibernate.cfg.Environment <clinit>
INFO: HHH000206: hibernate.properties not found
四月 06, 2021 10:11:41 下午 org.hibernate.cfg.Environment buildBytecodeProvider
INFO: HHH000021: Bytecode provider name : javassist
四月 06, 2021 10:11:41 下午 org.hibernate.boot.jaxb.internal.stax.LocalXmlResourceResolver resolveEntity
WARN: HHH90000012: Recognized obsolete hibernate namespace http://hibernate.sourceforge.net/hibernate-configuration. Use namespace http://www.hibernate.org/dtd/hibernate-configuration instead.  Support for obsolete DTD/XSD namespaces may be removed at any time.
四月 06, 2021 10:11:41 下午 org.hibernate.annotations.common.reflection.java.JavaReflectionManager <clinit>
INFO: HCANN000001: Hibernate Commons Annotations {5.0.1.Final}
四月 06, 2021 10:11:41 下午 org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
四月 06, 2021 10:11:42 下午 org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001005: using driver [oracle.jdbc.driver.OracleDriver] at URL [jdbc:oracle:thin:@192.168.0.104:1521:orcl]
四月 06, 2021 10:11:42 下午 org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001001: Connection properties: {user=sys as sysdba, password=****}
四月 06, 2021 10:11:42 下午 org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001003: Autocommit mode: false
四月 06, 2021 10:11:42 下午 org.hibernate.engine.jdbc.connections.internal.PooledConnections <init>
INFO: HHH000115: Hibernate connection pool size: 20 (min=1)
四月 06, 2021 10:11:43 下午 org.hibernate.dialect.Dialect <init>
INFO: HHH000400: Using dialect: org.hibernate.dialect.Oracle12cDialect
四月 06, 2021 10:11:44 下午 org.hibernate.tool.hbm2ddl.SchemaUpdate execute
INFO: HHH000228: Running hbm2ddl schema update
Hibernate: insert into C##TEST01.DBUSER (CREATED_BY, CREATED_DATE, USERNAME, USER_ID) values (?, ?, ?, ?)
```


问题，需要手动结束程序 不会自动终止

