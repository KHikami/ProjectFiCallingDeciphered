package p000;

import java.util.concurrent.TimeUnit;

final class bda extends iiq<Void, Void, Void> {
    final /* synthetic */ Runnable f3073a;
    final /* synthetic */ bcz f3074b;

    bda(bcz bcz, Runnable runnable) {
        this.f3074b = bcz;
        this.f3073a = runnable;
    }

    protected /* bridge */ /* synthetic */ Object mo470a(Object[] objArr) {
        return m4951a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m4952b();
    }

    private Void m4951a() {
        try {
            this.f3074b.f3068a.await(this.f3074b.f3069b, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
        }
        return null;
    }

    private void m4952b() {
        this.f3073a.run();
    }
}
