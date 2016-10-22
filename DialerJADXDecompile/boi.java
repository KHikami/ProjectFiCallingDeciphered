import java.util.concurrent.Callable;

final class boi implements Callable {
    private /* synthetic */ boh a;

    boi(boh boh) {
        this.a = boh;
    }

    public final /* synthetic */ Object call() {
        bno bno = this.a;
        Object a = bno.a(bno.f.b().a);
        return a == null ? bno.d() : a;
    }
}
