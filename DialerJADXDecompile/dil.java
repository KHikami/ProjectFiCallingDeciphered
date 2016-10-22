import io.grpc.internal.cd;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
final class dil implements cd {
    dil() {
    }

    public final /* synthetic */ void a(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    public final /* synthetic */ Object a() {
        return Executors.newCachedThreadPool(new dcv().a(true).a("grpc-okhttp-%d").a());
    }
}
