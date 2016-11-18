package defpackage;

import io.grpc.NameResolverProvider;
import java.net.URI;
import java.util.List;

public final class olo extends oll {
    private final List<NameResolverProvider> b;

    public olo(List<NameResolverProvider> list) {
        this.b = list;
    }

    public olk a(URI uri, ojh ojh) {
        b();
        for (NameResolverProvider a : this.b) {
            olk a2 = a.a(uri, ojh);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public String a() {
        b();
        return ((NameResolverProvider) this.b.get(0)).a();
    }

    private void b() {
        bm.b(!this.b.isEmpty(), "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
    }
}
