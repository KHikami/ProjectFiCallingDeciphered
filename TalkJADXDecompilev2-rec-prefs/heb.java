package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

public abstract class heb<R extends gup, A extends gud> extends heg<R> implements hec<R> {
    private AtomicReference<hgs> f16401a;
    final gue<A> f16402e;
    final gtz<?> f16403f;

    public heb(gtz<?> gtz_, gui gui) {
        super((gui) gwb.m2195f((Object) gui, (Object) "GoogleApiClient must not be null"));
        this.f16401a = new AtomicReference();
        this.f16402e = gtz_.m18606c();
        this.f16403f = gtz_;
    }

    @Deprecated
    public heb(gue<A> gue_A, gui gui) {
        super((gui) gwb.m2195f((Object) gui, (Object) "GoogleApiClient must not be null"));
        this.f16401a = new AtomicReference();
        this.f16402e = (gue) gwb.m1419L((Object) gue_A);
        this.f16403f = null;
    }

    private void m18987a(RemoteException remoteException) {
        m18993c(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    public abstract void mo2425a(A a);

    public void m18989a(hgs hgs) {
        this.f16401a.set(hgs);
    }

    public /* synthetic */ void mo2421a(Object obj) {
        super.m18974a((gup) obj);
    }

    public final void m18991b(A a) {
        try {
            mo2425a((gud) a);
        } catch (RemoteException e) {
            m18987a(e);
            throw e;
        } catch (RemoteException e2) {
            m18987a(e2);
        }
    }

    public void mo2422c() {
        mo2419a(null);
    }

    public final void m18993c(Status status) {
        gwb.m2048b(!status.m9663d(), (Object) "Failed result must not be success");
        m18974a(mo2424b(status));
    }

    protected void mo2423d() {
        hgs hgs = (hgs) this.f16401a.getAndSet(null);
        if (hgs != null) {
            hgs.mo2537a(this);
        }
    }

    public heb(gui gui) {
        this(gti.f16099a, gui);
    }

    public heb(gtz<Object> gtz_java_lang_Object, gui gui, byte b) {
        this((gtz) gtz_java_lang_Object, gui);
    }

    public heb(gui gui, byte b) {
        this(hiz.f17033a, gui);
    }

    public heb(gui gui, char c) {
        this(hsj.f17164a, gui);
    }

    public heb(gui gui, short s) {
        this(hyi.f17462k, gui);
    }
}
