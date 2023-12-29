# spring-boot-logging-filter3

Console Log

```shell

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.1)

2023-12-29T08:33:48.861+07:00  INFO 18829 --- [  restartedMain] .h.l.SpringBootLoggingFilter3Application : Starting SpringBootLoggingFilter3Application using Java 21 with PID 18829 (/Users/hendisantika/IdeaProjects/spring-boot-logging-filter3/target/classes started by hendisantika in /Users/hendisantika/IdeaProjects/spring-boot-logging-filter3)
2023-12-29T08:33:48.862+07:00  INFO 18829 --- [  restartedMain] .h.l.SpringBootLoggingFilter3Application : No active profile set, falling back to 1 default profile: "default"
2023-12-29T08:33:48.886+07:00  INFO 18829 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2023-12-29T08:33:48.886+07:00  INFO 18829 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2023-12-29T08:33:49.171+07:00  INFO 18829 --- [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2023-12-29T08:33:49.195+07:00  INFO 18829 --- [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 19 ms. Found 1 JPA repository interface.
2023-12-29T08:33:49.431+07:00  INFO 18829 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8081 (http)
2023-12-29T08:33:49.438+07:00  INFO 18829 --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-12-29T08:33:49.438+07:00  INFO 18829 --- [  restartedMain] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.17]
2023-12-29T08:33:49.457+07:00  INFO 18829 --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-12-29T08:33:49.457+07:00  INFO 18829 --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 571 ms
2023-12-29T08:33:49.472+07:00  INFO 18829 --- [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2023-12-29T08:33:49.554+07:00  INFO 18829 --- [  restartedMain] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection conn0: url=jdbc:h2:mem:testdb user=NARUTO
2023-12-29T08:33:49.555+07:00  INFO 18829 --- [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2023-12-29T08:33:49.560+07:00  INFO 18829 --- [  restartedMain] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:testdb'
2023-12-29T08:33:49.620+07:00  INFO 18829 --- [  restartedMain] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2023-12-29T08:33:49.650+07:00  INFO 18829 --- [  restartedMain] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.4.1.Final
2023-12-29T08:33:49.666+07:00  INFO 18829 --- [  restartedMain] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2023-12-29T08:33:49.769+07:00  INFO 18829 --- [  restartedMain] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2023-12-29T08:33:49.790+07:00  WARN 18829 --- [  restartedMain] org.hibernate.orm.deprecation            : HHH90000025: H2Dialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2023-12-29T08:33:50.146+07:00  INFO 18829 --- [  restartedMain] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
Hibernate: create table student (id integer not null, address varchar(255), age integer, full_name varchar(255), primary key (id))
Hibernate: create sequence student_seq start with 1 increment by 50
2023-12-29T08:33:50.160+07:00  INFO 18829 --- [  restartedMain] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2023-12-29T08:33:50.274+07:00  INFO 18829 --- [  restartedMain] o.s.d.j.r.query.QueryEnhancerFactory     : Hibernate is in classpath; If applicable, HQL parser will be used.
2023-12-29T08:33:50.499+07:00  WARN 18829 --- [  restartedMain] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2023-12-29T08:33:50.642+07:00  INFO 18829 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2023-12-29T08:33:50.660+07:00  INFO 18829 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8081 (http) with context path ''
2023-12-29T08:33:50.665+07:00  INFO 18829 --- [  restartedMain] .h.l.SpringBootLoggingFilter3Application : Started SpringBootLoggingFilter3Application in 1.98 seconds (process running for 2.326)
2023-12-29T08:34:05.438+07:00  INFO 18829 --- [nio-8081-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2023-12-29T08:34:05.438+07:00  INFO 18829 --- [nio-8081-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2023-12-29T08:34:05.439+07:00  INFO 18829 --- [nio-8081-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 1 ms
2023-12-29T08:34:05.487+07:00  INFO 18829 --- [nio-8081-exec-1] c.h.l.service.LoggingService             : log Request: REQUEST method = [POST] path = [/students]  body = [Student(id=null, fullName=Itadori Yuuji, age=17, address=Tokyo)]
2023-12-29T08:34:05.494+07:00  INFO 18829 --- [nio-8081-exec-1] c.h.l.controller.MainController          : Student: Student(id=null, fullName=Itadori Yuuji, age=17, address=Tokyo)
Hibernate: select next value for student_seq
Hibernate: insert into student (address,age,full_name,id) values (?,?,?,?)
2023-12-29T08:34:05.527+07:00  INFO 18829 --- [nio-8081-exec-1] c.h.l.service.LoggingService             : logResponse: RESPONSE  method = [POST] responseBody = [Student(id=1, fullName=Itadori Yuuji, age=17, address=Tokyo)]
2023-12-29T08:34:10.567+07:00  INFO 18829 --- [nio-8081-exec-2] c.h.l.service.LoggingService             : log Request: REQUEST method = [GET] path = [/students] 
Hibernate: select s1_0.id,s1_0.address,s1_0.age,s1_0.full_name from student s1_0
2023-12-29T08:34:10.650+07:00  INFO 18829 --- [nio-8081-exec-2] c.h.l.service.LoggingService             : logResponse: RESPONSE  method = [GET] responseBody = [[Student(id=1, fullName=Itadori Yuuji, age=17, address=Tokyo)]]
2023-12-29T08:34:19.225+07:00  INFO 18829 --- [nio-8081-exec-4] c.h.l.service.LoggingService             : log Request: REQUEST method = [PUT] path = [/students]  parameters = [{address=OSAKA, id=1}] 
Hibernate: update student set address=? where id=?
Hibernate: select s1_0.id,s1_0.address,s1_0.age,s1_0.full_name from student s1_0 where s1_0.id=?
2023-12-29T08:34:19.265+07:00  INFO 18829 --- [nio-8081-exec-4] c.h.l.service.LoggingService             : logResponse: RESPONSE  method = [PUT] responseBody = [Student(id=1, fullName=Itadori Yuuji, age=17, address=OSAKA)]
2023-12-29T08:34:35.740+07:00  INFO 18829 --- [nio-8081-exec-6] c.h.l.service.LoggingService             : log Request: REQUEST method = [GET] path = [/students] 
Hibernate: select s1_0.id,s1_0.address,s1_0.age,s1_0.full_name from student s1_0
2023-12-29T08:34:35.743+07:00  INFO 18829 --- [nio-8081-exec-6] c.h.l.service.LoggingService             : logResponse: RESPONSE  method = [GET] responseBody = [[Student(id=1, fullName=Itadori Yuuji, age=17, address=OSAKA)]]
```
