# MybatisSource

## 流程

### 配置文件

1. setting

   配置Configuration的Set,配置VFS，配置Log实例，

2. Properties

   配置占位内容

3. typeAliases

   注册别名

   1. <package name="com.fyh.alias"/>
   2. <alias="name" type="com.fyh.alias.abc"/>
   3. @Alias

4. plugins

   添加插件

5. objectFactory

   创建生成对象工厂，默认为DefaultObjectFactory

6. objectWrapperFactory

   创建ObjectWrapperFactory，默认为DefaultObjectWrapperFactory

7. reflectorFactory

   创建ReflectorFactory，默认为DefaultReflectorFactory

8. databaseIdProvider

   创建DataSourceIdProvider

9. typeHandlers

   注册类型转换器

10. environments

    创建环境，环境包括TransactionFactory和DataSource

11. mappers

## 组件

### SqlSessionFactoryBuilder

创建SqlSessionFactory

###SqlSessionFactory

创建SqlSession

### DataSourceFactory

工厂模式，创建DataSource，设置DataSource的属性

### SqlSession

设置TransactionFactory ，创建执行线程池，设置插件，设置DataSource

### TransactionFactory 

创建Transaction

### Environment 

### Configuration 

### XMLIncludeTransformer

### RawSqlSource

### StaticSqlSource

### ParameterMapping

### TypeHandler

### ResultSetType

### MappedStatement

### ParameterMap

### ExecutorType

### InterceptorChain

### MapperProxyFactory

### MapperProxy

### StatementHandler

```
ResultMapping
Discriminator
ResultMap
MappedStatement

ParameterMapping
```

```
SqlCommand
Executor
BoundSql
RoutingStatementHandler
```

```
ResultSetHandler
ParameterHandler
```

