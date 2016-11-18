package p000;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

public abstract class fbq<STUB extends omq<STUB>> implements bhf, bhj, bhm {
    private static final gma f12647b = gma.m18073a("Babel_Grpc");
    public final int f12648a;
    private final bhr f12649c;
    private final long f12650d;
    private volatile int f12651e;

    public abstract int mo2040a(Context context, fdo fdo);

    public abstract STUB mo2041a(fbn fbn, AtomicReference<okw> atomicReference, AtomicReference<okw> atomicReference2);

    public abstract void mo2042a(Context context, STUB stub);

    public final int mo539a(Context context, bhb bhb) {
        String valueOf;
        int a;
        if (this.f12650d == -1 || ((long) this.f12651e) <= this.f12650d) {
            this.f12651e++;
            fbn fbn = (fbn) jyn.m25426a(context, fbn.class);
            AtomicReference atomicReference = new AtomicReference();
            AtomicReference atomicReference2 = new AtomicReference();
            omq a2 = mo2041a(fbn, atomicReference, atomicReference2);
            if (a2 == null) {
                valueOf = String.valueOf(m14904e());
                glk.m17982e("Babel_Grpc", new StringBuilder(String.valueOf(valueOf).length() + 66).append("Send request ").append(valueOf).append(" unable to get the grpc stub. The grpc channel is NA.").toString(), new Object[0]);
                return bhn.f3349b;
            }
            String b = f12647b.m18078b(m14904e());
            String valueOf2;
            try {
                valueOf2 = String.valueOf(m14904e());
                glk.m17970a("Babel_Grpc", new StringBuilder(String.valueOf(valueOf2).length() + 45).append("Sending request ").append(valueOf2).append(" at retry attempt ").append(this.f12651e).toString(), new Object[0]);
                mo2042a(context, a2);
            } catch (fdo e) {
                a = mo2040a(context, e);
                return a;
            } catch (Throwable e2) {
                valueOf2 = String.valueOf(m14904e());
                valueOf = String.valueOf(atomicReference.get());
                String valueOf3 = String.valueOf(atomicReference2.get());
                glk.m17982e("Babel_Grpc", new StringBuilder(((String.valueOf(valueOf2).length() + 56) + String.valueOf(valueOf).length()) + String.valueOf(valueOf3).length()).append("Send request ").append(valueOf2).append(" grpc headers capture: ").append(valueOf).append("\n trailers capture: ").append(valueOf3).toString(), new Object[0]);
                olv a3 = olv.m33497a(e2);
                String valueOf4 = String.valueOf(m14904e());
                glk.m17980d("Babel_Grpc", new StringBuilder(String.valueOf(valueOf4).length() + 45).append("Send request ").append(valueOf4).append("grpc send error code ").append(a3.m33499a().m33508a()).toString(), e2);
                if (fbq.m14903a(a3, olv.f28755f) || fbq.m14903a(a3, olv.f28766q) || fbq.m14903a(a3, olv.f28752c)) {
                    a = bhn.f3349b;
                    return a;
                } else if (fbq.m14903a(a3, olv.f28754e)) {
                    a = mo2040a(context, new fdo(111));
                    f12647b.m18079c(b);
                    return a;
                } else if (fbq.m14903a(a3, olv.f28756g)) {
                    a = mo2040a(context, new fdo(113));
                    f12647b.m18079c(b);
                    return a;
                } else if (fbq.m14903a(a3, olv.f28759j)) {
                    a = mo2040a(context, new fdo(104));
                    f12647b.m18079c(b);
                    return a;
                } else {
                    a = mo2040a(context, new fdo(108));
                    f12647b.m18079c(b);
                    return a;
                }
            } finally {
                f12647b.m18079c(b);
            }
            return bhn.f3348a;
        }
        valueOf3 = String.valueOf(m14904e());
        mo2040a(context, new fdo(109, new StringBuilder(String.valueOf(valueOf3).length() + 66).append("Send request ").append(valueOf3).append(" exceeds maximum allowed retries ").append(this.f12650d).toString()));
        return bhn.f3351d;
    }

    private static boolean m14903a(olv olv, olv olv2) {
        return olv.m33499a().m33508a() == olv2.m33499a().m33508a();
    }

    private String m14904e() {
        String valueOf = String.valueOf(getClass().getCanonicalName());
        String valueOf2 = String.valueOf(mo542b());
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("_").append(valueOf2).toString();
    }

    public final bhr mo540a() {
        return this.f12649c;
    }

    public final bhu mo544d() {
        return new bhv().m5277a(true).m5276a();
    }

    public void mo541a(Context context) {
        String valueOf = String.valueOf(m14904e());
        glk.m17982e("Babel_Grpc", new StringBuilder(String.valueOf(valueOf).length() + 21).append("Send request ").append(valueOf).append(" expired").toString(), new Object[0]);
    }
}
