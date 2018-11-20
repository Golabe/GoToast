# GoToast
### Gradle 
```xml
implementation 'com.github.golabe.GoToast:library:1.0.0'
```
### Usage
- 简单用法
```java
GoToast.create(this,"welcome").show()
```
- 成功
```java
 GoToast.success(this,"SUCCESS").show()
 ```
 - 失败
 ```java
  GoToast.failed(this,"FAILED").show()
  ```
  - 自定义
  ```java
    GoToast.create(this,"",bgColor,textColor ,leftResId ,rightResId,duration ).show()
    ```
