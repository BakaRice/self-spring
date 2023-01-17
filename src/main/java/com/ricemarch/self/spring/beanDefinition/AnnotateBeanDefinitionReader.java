package com.ricemarch.self.spring.beanDefinition;

import com.ricemarch.self.spring.annotation.Scope;

public class AnnotateBeanDefinitionReader {

    // 注册我们的 路径扫描 这个bean到beanFactory里
    public void register(Class<?> componentClass) {
        registerBean(componentClass);
    }

    private void registerBean(Class<?> componentClass) {
        doRegisterBean(componentClass);
    }

    private void doRegisterBean(Class<?> componentClass) {
        // 把 appConfig 读取成一个 bean definition定义
        AnnotateGenericBeanDefinition beanDefinition = new AnnotateGenericBeanDefinition();
        beanDefinition.setClazz(componentClass);

        if (componentClass.isAnnotationPresent(Scope.class)) {
            String scope = componentClass.getAnnotation(Scope.class).value();
            beanDefinition.setScope(scope);
        } else {
            beanDefinition.setScope("singleton");
        }

        beanDefinition.setScope("");

        //beanDefinition 创建完成以后， 得给beanFactory 进行 bean 注册类

    }
}
