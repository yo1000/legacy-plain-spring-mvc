## How to run

```bash
./mvnw clean tomcat7:run
```

----

notes

```bash
git clone https://github.com/yo1000/legacy-plain-spring-mvc.git
cd legacy-plain-spring-mvc
```

```bash
./mvnw \
archetype:generate \
-DarchetypeGroupId=co.ntier \
-DarchetypeArtifactId=spring-mvc-archetype \
-DarchetypeVersion=1.0.2 \
-DgroupId=com.yo1000 \
-DartifactId=legacy-plain-spring-mvc \
-Dversion=0.0.1-SNAPSHOT \
-DarchetypeRepository=http://kolorobot.github.io/spring-mvc-quickstart-archetype
```

```bash
mv ./legacy-plain-spring-mvc/src ./
mv ./legacy-plain-spring-mvc/pom.xml ./
rm -rf ./legacy-plain-spring-mvc
```
