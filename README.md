# springboot-multi-mode

#zjj-mybatis-generater
简单实现mybatis反向工程的步骤以及出现的相关问题  
1、需要导入相关jar包，可在pom文件中查看；  2、编写xml配置文件；  3、运行Generator类。  
运行之后会生成实体类，mapper接口，mapper.xml文件  
存在的问题：需要对一些细节问题进行学习，比如xml配置文件具体配置规则之类的。  
碰到的问题：关于new File构造方法填写文件路径  
1、本地运行的时候可以填写本地目录  
2、但不能填src/之类的目录，实际运行可以用类.class.getResource(“文件名”)获取相对路径
