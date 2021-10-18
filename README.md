# archetype

## 1、拉去本项目代码到本地
## 2、使用idea 打开本项目
mvn clean install
在maven仓库的一级目录下出现一个新文件：archetype-catalog.xml
## 3、idea 安装Maven Archetype Catalog 插件
打开File | Settings | Build, Execution, Deployment | Build Tools | Maven Archetype Catalogs
+ 新增刚才新增的文件
## 4、使用idea新建maven项目
勾选create from archetype
按照正常输入projectName、groupId、ArtifactId等
