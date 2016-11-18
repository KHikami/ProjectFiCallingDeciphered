package defpackage;

import io.grpc.ManagedChannelProvider;
import java.util.Comparator;

public final class oku implements Comparator<ManagedChannelProvider> {
    public /* synthetic */ int compare(Object obj, Object obj2) {
        return ((ManagedChannelProvider) obj).b() - ((ManagedChannelProvider) obj2).b();
    }
}
