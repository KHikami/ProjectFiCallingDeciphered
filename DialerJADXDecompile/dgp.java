import io.grpc.ManagedChannelProvider;
import java.util.Comparator;

/* compiled from: PG */
public final class dgp implements Comparator {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((ManagedChannelProvider) obj).b() - ((ManagedChannelProvider) obj2).b();
    }
}
