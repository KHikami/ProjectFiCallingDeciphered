import java.net.URL;
import java.util.Enumeration;

/* compiled from: PG */
public final class dgq extends ClassLoader {
    public dgq(ClassLoader classLoader) {
        super(classLoader);
    }

    protected final URL findResource(String str) {
        if ("META-INF/services/io.grpc.ManagedChannelProvider".equals(str)) {
            return getParent().getResource("HACKED-META-INF/services/io.grpc.ManagedChannelProvider");
        }
        return super.findResource(str);
    }

    protected final Enumeration findResources(String str) {
        if ("META-INF/services/io.grpc.ManagedChannelProvider".equals(str)) {
            return getParent().getResources("HACKED-META-INF/services/io.grpc.ManagedChannelProvider");
        }
        return super.findResources(str);
    }
}
