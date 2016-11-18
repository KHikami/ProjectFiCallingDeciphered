package defpackage;

import io.grpc.NameResolverProvider;
import java.util.Comparator;

public final class oln implements Comparator<NameResolverProvider> {
    public /* synthetic */ int compare(Object obj, Object obj2) {
        NameResolverProvider nameResolverProvider = (NameResolverProvider) obj2;
        ((NameResolverProvider) obj).b();
        nameResolverProvider.b();
        return 0;
    }
}
