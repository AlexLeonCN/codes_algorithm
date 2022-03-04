
- 计算平均数
```java
int value = Math.abs(-90);
//拆解
public static int abs(int a){
    return (a<0)?-a:a;
        }
```
- 计算 四舍五入

参数为double型，返回long类型

参数为float型，返回int类型

小数的声明默认是double类型
```java
int i = Math.round(11.5F);//结果是12
int j = Math.round(-11.5F);//结果是-11
long a = Math.roound(11.5);
long b = Math.roound(-11.5);
```
