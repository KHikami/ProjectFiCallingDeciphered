import io.grpc.internal.ar;
import java.net.URI;

/* compiled from: PG */
public final class dgh extends dhg {
    static final dgh a;

    static {
        a = new dgh();
    }

    public final dhf a(URI uri, dfc dfc) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        Object obj = (String) cob.b(uri.getPath(), (Object) "targetPath");
        cob.a(obj.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", obj, (Object) uri);
        String substring = obj.substring(1);
        uri.getAuthority();
        return new dge(substring, dfc, ar.h, ar.g);
    }

    public final String a() {
        return "dns";
    }

    private dgh() {
    }
}
