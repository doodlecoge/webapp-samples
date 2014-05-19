Spring Configurations
=====================

static resource
---------------

static contents are exposed using `resources` config,
the following example consider requests with pattern
`http://domain:port/static/*` are for files under
`WEBROOT/static/` folder.

    <mvc:resources mapping="/static/**" location="/static/"/>

For example, request `http://domain:port/static/html/help.html`
will be responded with content of `WEBROOT/static/html/help.html`.


Beans Configured with Annotation
--------------------------------

The following configure will scan package `org.example` for
classes that annotated by spring annotation, and add them
to spring application context.

    <mvc:annotation-driven/>
    <context:component-scan base-package="org.example"/>