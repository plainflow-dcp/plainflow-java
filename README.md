Plainflow-java
==============

Plainflow-java is a Java client for [Plainflow](https://www.plainflow.com)

## Documentation

Documentation is available at [https://www.plainflow.com/docs/developers/sdk/java](https://www.plainflow.com/docs/developers/sdk/java).

*Add to `pom.xml`:*

```xml
<dependency>
  <groupId>com.plainflow.analytics.java</groupId>
  <artifactId>plainflow</artifactId>
  <version>LATEST</version>
</dependency>
```

*or if you're using Gradle:*

```bash
compile 'com.plainflow.analytics.java:plainflow:+'
```

## Snapshots

All changes committed to master are automatically released as snapshots.

To add a snapshot dependency to your builds, make sure you add the snapshot repository so your build system can look up the dependency.

Maven users can add the following to their `pom.xml`:
```
<repository>
    <id>ossrh</id>
    <name>Sonatype Snapshot Repository</name>
    <url>https://oss.sonatype.org/content/repositories/snapshots/</url>
    <releases>
        <enabled>false</enabled>
    </releases>
    <snapshots>
        <enabled>true</enabled>
    </snapshots>
</repository>
```

Gradle users should declare this in their repositories block:
```
repositories {
  mavenCentral()
  maven { url 'https://oss.sonatype.org/content/repositories/snapshots/' }
}
```

## License

The MIT License (MIT)

Copyright (c) 2014 Segment, Inc.

Copyright (c) 2017 Plainflow, Inc.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
