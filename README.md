\# java-learning



滁州职业技术学院 软件技术 · 2028 届

Java 后端学习路线记录，2026.11 - 2027.08。



\## 第 1 周：学生管理系统（数组版）



不用 ArrayList，手写数组实现增删查改，理解底层原理。



\### 功能



| 方法 | 说明 |

|---|---|

| `add(Student)` | 添加学生 |

| `remove(String id)` | 按学号删除（数组前移补位） |

| `findById(String id)` | 按学号查询，查不到返回 null |

| `update(String id, double newScore)` | 按学号改分数 |

| `printAll()` | 打印全部学生 |

| `size()` | 返回实际人数 |



\### 运行输出



&#x20;   Student{id='001', name='张三', age=19, score=95.0}

&#x20;   Student{id='002', name='李四', age=20, score=55.0}

&#x20;   Student{id='003', name='王五', age=21, score=88.0}

&#x20;   人数: 3

&#x20;   ===查 002===

&#x20;   Student{id='002', name='李四', age=20, score=55.0}

&#x20;   ===改 002 分数为 100===

&#x20;   Student{id='002', name='李四', age=20, score=100.0}

&#x20;   Student{id='003', name='王五', age=21, score=88.0}

&#x20;   删除后人数: 2



\## 目标



2027 年暑期前完成 2 个可运行项目，投递 Java 后端实习。

