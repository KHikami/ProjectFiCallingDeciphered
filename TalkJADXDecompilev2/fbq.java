package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

public abstract class fbq<STUB extends omq<STUB>> implements bhf, bhj, bhm {
    private static final gma b = gma.a("Babel_Grpc");
    public final int a;
    private final bhr c;
    private final long d;
    private volatile int e;

    public abstract int a(Context context, fdo fdo);

    public abstract STUB a(fbn fbn, AtomicReference<okw> atomicReference, AtomicReference<okw> atomicReference2);

    public abstract void a(Context context, STUB stub);

    public final int a(Context context, bhb bhb) {
        String valueOf;
        String valueOf2;
        int a;
        if (this.d == -1 || ((long) this.e) <= this.d) {
            this.e++;
            fbn fbn = (fbn) jyn.a(context, fbn.class);
            AtomicReference atomicReference = new AtomicReference();
            AtomicReference atomicReference2 = new AtomicReference();
            omq a2 = a(fbn, atomicReference, atomicReference2);
            if (a2 == null) {
                valueOf = String.valueOf(e());
                glk.e("Babel_Grpc", new StringBuilder(String.valueOf(valueOf).length() + 66).append("Send request ").append(valueOf).append(" unable to get the grpc stub. The grpc channel is NA.").toString(), new Object[0]);
                return bhn.b;
            }
            String b = b.b(e());
            try {
                valueOf2 = String.valueOf(e());
                glk.a("Babel_Grpc", new StringBuilder(String.valueOf(valueOf2).length() + 45).append("Sending request ").append(valueOf2).append(" at retry attempt ").append(this.e).toString(), new Object[0]);
                a(context, a2);
            } catch (fdo e) {
                a = a(context, e);
                return a;
            } catch (Throwable e2) {
                valueOf2 = String.valueOf(e());
                valueOf = String.valueOf(atomicReference.get());
                String valueOf3 = String.valueOf(atomicReference2.get());
                glk.e("Babel_Grpc", new StringBuilder(((String.valueOf(valueOf2).length() + 56) + String.valueOf(valueOf).length()) + String.valueOf(valueOf3).length()).append("Send request ").append(valueOf2).append(" grpc headers capture: ").append(valueOf).append("\n trailers capture: ").append(valueOf3).toString(), new Object[0]);
                olv a3 = olv.a(e2);
                String valueOf4 = String.valueOf(e());
                glk.d("Babel_Grpc", new StringBuilder(String.valueOf(valueOf4).length() + 45).append("Send request ").append(valueOf4).append("grpc send error code ").append(a3.a().a()).toString(), e2);
                if (fbq.a(a3, olv.f) || fbq.a(a3, olv.q) || fbq.a(a3, olv.c)) {
                    a = bhn.b;
                    return a;
                } else if (fbq.a(a3, olv.e)) {
                    a = a(context, new fdo(111));
                    b.c(b);
                    return a;
                } else if (fbq.a(a3, olv.g)) {
                    a = a(context, new fdo(113));
                    b.c(b);
                    return a;
                } else if (fbq.a(a3, olv.j)) {
                    a = a(context, new fdo(104));
                    b.c(b);
                    return a;
                } else {
                    a = a(context, new fdo(108));
                    b.c(b);
                    return a;
                }
            } finally {
                b.c(b);
            }
            return bhn.a;
        }
        valueOf3 = String.valueOf(e());
        a(context, new fdo(109, new StringBuilder(String.valueOf(valueOf3).length() + 66).append("Send request ").append(valueOf3).append(" exceeds maximum allowed retries ").append(this.d).toString()));
        return bhn.d;
    }

    private static boolean a(olv olv, olv olv2) {
        return olv.a().a() == olv2.a().a();
    }

    private String e() {
        String valueOf = String.valueOf(getClass().getCanonicalName());
        String valueOf2 = String.valueOf(b());
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("_").append(valueOf2).toString();
    }

    public final bhr a() {
        return this.c;
    }

    public final bhu d() {
        return new bhv().a(true).a();
    }

    public void a(Context context) {
        String valueOf = String.valueOf(e());
        glk.e("Babel_Grpc", new StringBuilder(String.valueOf(valueOf).length() + 21).append("Send request ").append(valueOf).append(" expired").toString(), new Object[0]);
    }
}
