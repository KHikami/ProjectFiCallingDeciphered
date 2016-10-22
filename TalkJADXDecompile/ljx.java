import java.util.Set;
import java.util.concurrent.Executor;

public final class ljx implements onc {
    private final onc<lgy> a;
    private final onc<jhx> b;
    private final onc<Executor> c;
    private final onc<Set<ljs>> d;

    public /* synthetic */ Object a() {
        return b();
    }

    public ljx(onc<lgy> onc_lgy, onc<jhx> onc_jhx, onc<Executor> onc_java_util_concurrent_Executor, onc<Set<ljs>> onc_java_util_Set_ljs) {
        this.a = onc_lgy;
        this.b = onc_jhx;
        this.c = onc_java_util_concurrent_Executor;
        this.d = onc_java_util_Set_ljs;
    }

    private lju b() {
        return new lju((lgy) this.a.a(), (jhx) this.b.a(), (Executor) this.c.a(), this.d);
    }
}
