# springboot + vue前后端分离演示项目

## 运行方式

首先建库（库名mybatis）使用sql目录下的sql文件导入数据

将backend\src\main\resources\application.properties中的用户名和密码修改为自己的

### 分别运行

#### 前端（frontend目录）

安装npm

```
npm install
```

编译并热部署

```
npm run serve
```

#### 后端（backend目录）

按maven项目的运行方式即可，main入口：`com.example.demo.DemoApplication`

### 独立运行

#### 前端

安装npm（已安装则跳过）

```
npm install
```

将frontend\src\components\Table.vue文件34行注释掉，36行取消注释

编译并为生产环境构建文件

```
npm run build
```

将前端dist目录生成的文件复制到后端src\main\resources\static目录中

#### 后端

按maven项目的运行方式即可，main入口：`com.example.demo.DemoApplication`