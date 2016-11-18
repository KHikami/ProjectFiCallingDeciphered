package defpackage;

import java.net.URL;
import java.util.Enumeration;

public final class olp extends ClassLoader {
    private final String a = "META-INF/services/io.grpc.NameResolverProvider";
    private final String b = "HACKED-META-INF/services/io.grpc.NameResolverProvider";

    public olp(ClassLoader classLoader) {
        super(classLoader);
    }

    public Class<?> loadClass(String str) {
        return getParent().loadClass(str);
    }

    protected URL findResource(String str) {
        if ("META-INF/services/io.grpc.NameResolverProvider".equals(str)) {
            return getParent().getResource("HACKED-META-INF/services/io.grpc.NameResolverProvider");
        }
        return super.findResource(str);
    }

    protected Enumeration<URL> findResources(String str) {
        if ("META-INF/services/io.grpc.NameResolverProvider".equals(str)) {
            return getParent().getResources("HACKED-META-INF/services/io.grpc.NameResolverProvider");
        }
        return super.findResources(str);
    }
}
