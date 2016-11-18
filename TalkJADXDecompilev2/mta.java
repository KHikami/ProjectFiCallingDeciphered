package defpackage;

import java.util.concurrent.ExecutionException;

final class mta implements Runnable {
    final /* synthetic */ mti a;
    final /* synthetic */ msx b;

    mta(mti mti, msx msx) {
        this.a = mti;
        this.b = msx;
    }

    public void run() {
        try {
            this.b.a(msy.b(this.a));
        } catch (ExecutionException e) {
            this.b.a(e.getCause());
        } catch (Throwable e2) {
            this.b.a(e2);
        } catch (Throwable e22) {
            this.b.a(e22);
        }
    }
}
