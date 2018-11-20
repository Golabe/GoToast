# GoToast Kotlin 版本

<div align="center"><image src="https://github.com/Golabe/GoToast/blob/master/gif/GIF.gif?raw=true" width="400"/></div>

### Gradle 
```xml
implementation 'com.github.golabe.GoToast:library:1.0.0'
```
### 图标颜色跟随文字颜色，所以尽量使用纯色图标
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
