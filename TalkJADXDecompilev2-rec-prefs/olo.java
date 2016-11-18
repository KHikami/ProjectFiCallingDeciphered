package p000;

import io.grpc.NameResolverProvider;
import java.net.URI;
import java.util.List;

public final class olo extends oll {
    private final List<NameResolverProvider> f33170b;

    public olo(List<NameResolverProvider> list) {
        this.f33170b = list;
    }

    public olk mo4170a(URI uri, ojh ojh) {
        m38688b();
        for (NameResolverProvider a : this.f33170b) {
            olk a2 = a.a(uri, ojh);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public String mo4169a() {
        m38688b();
        return ((NameResolverProvider) this.f33170b.get(0)).a();
    }

    private void m38688b() {
        bm.b(!this.f33170b.isEmpty(), "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
    }
}
