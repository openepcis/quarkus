package io.quarkus.arc.impl;

import java.lang.reflect.Type;
import java.util.Set;

import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.BeanManager;

public class BeanManagerBean extends BuiltInBean<BeanManager> {

    private static final Set<Type> BM_TYPES = Set.of(Object.class, BeanManager.class);

    @Override
    public Set<Type> getTypes() {
        return BM_TYPES;
    }

    @Override
    public BeanManager get(CreationalContext<BeanManager> creationalContext) {
        return new BeanManagerProvider<>().get(creationalContext);
    }

    @Override
    public Class<?> getBeanClass() {
        return BeanManagerImpl.class;
    }

}
