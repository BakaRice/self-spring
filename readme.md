1. 想要书写简易的Spring源码，首先要搞明白 BeanFactory,BeanDefinition,ApplicationContext之间的关系。

    - BeanFactory： 工厂，生产bean，提供获取bean的方法，getbean方法
      - 生产bean的话，需要解析我们的注解@service，一个bean可能是单例的，也可能是多例的
    - BeanDefinition： 
      - bean定义：
        - String scope （singleton单例，prototype多例）
        - Class Clazz （Object.class) 代表当前bean，属于哪个class
      - 他就是生产bean的原料
    - ApplicationContext：容器（上下文）
      - 他要主导 BeanDefinition的生成，把BeanDefinition传递给BeanFactory生产bean
        - 传递=>(注册，BeanDefinition注册，BeanDefinitionRegister，方法：registerBeanDefinition)
      - 给BeanFactory生成bean
2. 开始自己仿造源码