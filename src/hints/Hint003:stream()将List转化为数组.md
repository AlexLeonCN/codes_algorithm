使用stream()将List转换为数组更为快捷
```java
int[] intArr = list.stream().mapToInt(Integer::intValue).toArray();
```