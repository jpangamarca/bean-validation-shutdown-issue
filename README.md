# bean-validation-shutdown-issue

The following stacktrace is presented to the user ay application shutdown:

Exception in thread "Thread-0" java.lang.AbstractMethodError: org.apache.deltaspike.beanvalidation.impl.CDIAwareConstraintValidatorFactory.releaseInstance(Ljavax/validation/ConstraintValidator;)V
        at org.hibernate.validator.internal.engine.constraintvalidation.ConstraintValidatorManager.clear(ConstraintValidatorManager.java:201)
        at org.hibernate.validator.internal.engine.ValidatorFactoryImpl.close(ValidatorFactoryImpl.java:315)
        at org.hibernate.validator.internal.cdi.ValidatorFactoryBean.destroy(ValidatorFactoryBean.java:125)
        at org.hibernate.validator.internal.cdi.ValidatorFactoryBean.destroy(ValidatorFactoryBean.java:45)
        at org.jboss.weld.util.bean.IsolatedForwardingBean.destroy(IsolatedForwardingBean.java:50)
        at org.jboss.weld.context.AbstractContext.destroyContextualInstance(AbstractContext.java:147)
        at org.jboss.weld.context.AbstractContext.destroy(AbstractContext.java:161)
        at org.jboss.weld.context.AbstractSharedContext.destroy(AbstractSharedContext.java:61)
        at org.jboss.weld.context.AbstractSharedContext.invalidate(AbstractSharedContext.java:56)
        at org.jboss.weld.bootstrap.WeldRuntime.shutdown(WeldRuntime.java:54)
        at org.jboss.weld.bootstrap.WeldBootstrap.shutdown(WeldBootstrap.java:113)
        at org.jboss.weld.environment.se.ShutdownManager.shutdown(ShutdownManager.java:50)
        at org.jboss.weld.environment.se.Weld.shutdown(Weld.java:259)
        at org.jboss.weld.environment.se.StartMain$ShutdownHook.run(StartMain.java:84)
