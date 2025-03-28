<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>First Project Quarkus</title>
</head>
<body>
    <h1>first_project_quarkus</h1>
    <p>
        Welcome to my first project in Quarkus! This repository is an exploration of the Quarkus framework, where I am doing basic configurations to test and see if I like the framework. Quarkus is known as the Supersonic Subatomic Java Framework, designed for building high-performance, reactive applications.
    </p>

    <h2>Running the application in dev mode</h2>
    <p>
        You can run the application in development mode, which enables live coding, using the following command:
    </p>
    <pre><code>
./mvnw quarkus:dev
    </code></pre>
    <blockquote>
        <strong>NOTE:</strong> Quarkus now ships with a Dev UI, which is available in dev mode only at <a href="http://localhost:8080/q/dev/">http://localhost:8080/q/dev/</a>.
    </blockquote>

    <h2>Packaging and running the application</h2>
    <p>To package the application, use the following command:</p>
    <pre><code>
./mvnw package
    </code></pre>
    <p>
        This will produce the <code>quarkus-run.jar</code> file in the <code>target/quarkus-app/</code> directory. Note that it’s not an <em>über-jar</em> as the dependencies are copied into the <code>target/quarkus-app/lib/</code> directory.
    </p>
    <p>You can run the packaged application using:</p>
    <pre><code>
java -jar target/quarkus-app/quarkus-run.jar
    </code></pre>
    <p>If you want to build an <em>über-jar</em>, use this command:</p>
    <pre><code>
./mvnw package -Dquarkus.package.jar.type=uber-jar
    </code></pre>
    <p>The <em>über-jar</em> can be run using:</p>
    <pre><code>
java -jar target/*-runner.jar
    </code></pre>

    <h2>Creating a native executable</h2>
    <p>To create a native executable, use the following command:</p>
    <pre><code>
./mvnw package -Dnative
    </code></pre>
    <p>If you don't have GraalVM installed, you can build the native executable in a container using:</p>
    <pre><code>
./mvnw package -Dnative -Dquarkus.native.container-build=true
    </code></pre>
    <p>The native executable can then be run using:</p>
    <pre><code>
./target/first_project-1.0-SNAPSHOT-runner
    </code></pre>
    <p>For more information on building native executables, please visit the <a href="https://quarkus.io/guides/maven-tooling">Quarkus Maven tooling guide</a>.</p>

    <h2>Related Guides</h2>
    <p>Here are some related guides that I found useful while working on this project:</p>
    <ul>
        <li><a href="https://quarkus.io/guides/rest">REST</a>: A Jakarta REST implementation utilizing build time processing and Vert.x.</li>
        <li><a href="https://quarkus.io/guides/mongodb-panache">MongoDB with Panache</a>: Simplify your persistence code for MongoDB via the active record or the repository pattern.</li>
        <li><a href="https://quarkus.io/guides/rest#json-serialisation">REST Jackson</a>: Jackson serialization support for Quarkus REST.</li>
        <li><a href="https://quarkus.io/guides/hibernate-orm-panache">Hibernate ORM with Panache</a>: Simplify your persistence code for Hibernate ORM via the active record or the repository pattern.</li>
        <li><a href="https://quarkus.io/guides/datasource">JDBC Driver - MySQL</a>: Connect to the MySQL database via JDBC.</li>
    </ul>

    <h2>Provided Code</h2>
    <h3>Hibernate ORM</h3>
    <p>Create your first JPA entity</p>
    <p><a href="https://quarkus.io/guides/hibernate-orm">Related guide section...</a></p>
    <p><a href="https://quarkus.io/guides/hibernate-orm-panache">Related Hibernate with Panache section...</a></p>

    <h3>REST</h3>
    <p>Easily start your REST Web Services</p>
    <p><a href="https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources">Related guide section...</a></p>

    <h2>My First Experience with Quarkus Framework</h2>
    <p>
        When I started exploring the Quarkus framework, I was immediately impressed by its focus on performance and developer experience. Quarkus, known as the Supersonic Subatomic Java Framework, emphasizes rapid startup times and reduced memory consumption, making it an excellent choice for developing cloud-native and serverless applications.
    </p>
    <p>
        The initial setup was straightforward, thanks to the well-documented guides and examples provided by the Quarkus community. Running the application in development mode was particularly enjoyable with the <code>quarkus:dev</code> command, which supports live coding and provides a user-friendly Dev UI. This feature significantly boosted my productivity, allowing me to see changes in real-time without restarting the application.
    </p>
    <p>
        Packaging the application was simple, with clear instructions for creating both standard and <em>über-jar</em> packages. The ability to build native executables using GraalVM or containerized builds further showcased Quarkus's versatility and its commitment to optimizing performance.
    </p>
    <p>
        Overall, my first experience with Quarkus was highly positive. The framework's modern approach to Java development, coupled with its robust features and excellent documentation, made it a joy to work with. Quarkus has certainly set a high standard for what a Java framework can achieve in the realm of cloud-native applications.
    </p>
</body>
</html>
