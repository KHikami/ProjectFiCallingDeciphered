package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: bda */
final class bda extends iiq<Void, Void, Void> {
    final /* synthetic */ Runnable a;
    final /* synthetic */ bcz b;

    bda(bcz bcz, Runnable runnable) {
        this.b = bcz;
        this.a = runnable;
    }

    protected /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        return a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        b();
    }

    private Void a() {
        try {
            this.b.a.await(this.b.b, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
        }
        return null;
    }

    private void b() {
        this.a.run();
    }
}
