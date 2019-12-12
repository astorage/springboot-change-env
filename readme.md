多个环境，一个环境一个配置文件。

springboot默认使用的resources下面的application.properties

###可以通过在application.properties文件中配置

spring.profiles.active=env 项

来选择加载application-${spring.profiles.active}.properties

这样就可以将application.properties和application-${profile}.properties 取并集
如果有相同的配置项，application-${spring.profiles.active}.properties中的配置项有效。


###也可以在启动程序的时候使用-Dspring.profiles.active=prod 参数来指定加载对应的配置文件

当然也是application.properties和application-${profile}.properties 取并集

spring.profiles.active 配置项是一个list用逗号分隔

参考文档

https://docs.spring.io/spring-boot/docs/2.2.2.RELEASE/reference/html/index.html



###2.4. Profile-specific Properties

In addition to application.properties files, profile-specific properties can also be defined by using the following naming convention: application-{profile}.properties. The Environment has a set of default profiles (by default, [default]) that are used if no active profiles are set. In other words, if no profiles are explicitly activated, then properties from application-default.properties are loaded.

Profile-specific properties are loaded from the same locations as standard application.properties, with profile-specific files always overriding the non-specific ones, whether or not the profile-specific files are inside or outside your packaged jar.

If several profiles are specified, a last-wins strategy applies. For example, profiles specified by the spring.profiles.active property are added after those configured through the SpringApplication API and therefore take precedence.

If you have specified any files in spring.config.location, profile-specific variants of those files are not considered. Use directories in spring.config.location if you want to also use profile-specific properties.



You can use a spring.profiles.active Environment property to specify which profiles are active. You can specify the property in any of the ways described earlier in this chapter. For example, you could include it in your application.properties, as shown in the following example:

spring.profiles.active=dev,hsqldb

You could also specify it on the command line by using the following switch: --spring.profiles.active=dev,hsqldb.

这两个参数也很有用

spring.profiles.include

spring.profiles

spring.config.location