package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: heb */
public abstract class heb<R extends gup, A extends gud> extends heg<R> implements hec<R> {
    private AtomicReference<hgs> a;
    final gue<A> e;
    final gtz<?> f;

    public heb(gtz<?> gtz_, gui gui) {
        super((gui) gwb.f((Object) gui, (Object) "GoogleApiClient must not be null"));
        this.a = new AtomicReference();
        this.e = gtz_.c();
        this.f = gtz_;
    }

    @Deprecated
    public heb(gue<A> gue_A, gui gui) {
        super((gui) gwb.f((Object) gui, (Object) "GoogleApiClient must not be null"));
        this.a = new AtomicReference();
        this.e = (gue) gwb.L((Object) gue_A);
        this.f = null;
    }

    private void a(RemoteException remoteException) {
        c(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    public abstract void a(A a);

    public void a(hgs hgs) {
        this.a.set(hgs);
    }

    public /* synthetic */ void a(Object obj) {
        super.a((gup) obj);
    }

    public final void b(A a) {
        try {
            a((gud) a);
        } catch (RemoteException e) {
            a(e);
            throw e;
        } catch (RemoteException e2) {
            a(e2);
        }
    }

    public void c() {
        a(null);
    }

    public final void c(Status status) {
        gwb.b(!status.d(), (Object) "Failed result must not be success");
        a(b(status));
    }

    protected void d() {
        hgs hgs = (hgs) this.a.getAndSet(null);
        if (hgs != null) {
            hgs.a(this);
        }
    }

    public heb(gui gui) {
        this(gti.a, gui);
    }

    public heb(gtz<Object> gtz_java_lang_Object, gui gui, byte b) {
        this((gtz) gtz_java_lang_Object, gui);
    }

    public heb(gui gui, byte b) {
        this(hiz.a, gui);
    }

    public heb(gui gui, char c) {
        this(hsj.a, gui);
    }

    public heb(gui gui, short s) {
        this(hyi.k, gui);
    }
}
