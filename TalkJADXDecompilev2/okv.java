package defpackage;

import java.net.URL;
import java.util.Enumeration;

public final class okv extends ClassLoader {
    private final String a = "META-INF/services/io.grpc.ManagedChannelProvider";
    private final String b = "HACKED-META-INF/services/io.grpc.ManagedChannelProvider";

    public okv(ClassLoader classLoader) {
        super(classLoader);
    }

    public Class<?> loadClass(String str) {
        return getParent().loadClass(str);
    }

    protected URL findResource(String str) {
        if ("META-INF/services/io.grpc.ManagedChannelProvider".equals(str)) {
            return getParent().getResource("HACKED-META-INF/services/io.grpc.ManagedChannelProvider");
        }
        return super.findResource(str);
    }

    protected Enumeration<URL> findResources(String str) {
        if ("META-INF/services/io.grpc.ManagedChannelProvider".equals(str)) {
            return getParent().getResources("HACKED-META-INF/services/io.grpc.ManagedChannelProvider");
        }
        return super.findResources(str);
    }
}
