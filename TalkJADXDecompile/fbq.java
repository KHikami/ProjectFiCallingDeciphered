import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

public abstract class fbq<STUB extends omq<STUB>> implements bhf, bhj, bhm {
    private static final gma b;
    public final int a;
    private final bhr c;
    private final long d;
    private volatile int e;

    public abstract int a(Context context, fdo fdo);

    public abstract STUB a(fbn fbn, AtomicReference<okw> atomicReference, AtomicReference<okw> atomicReference2);

    public abstract void a(Context context, STUB stub);

    static {
        b = gma.a("Babel_Grpc");
    }

    public final int a(Context context, bhb bhb) {
        String valueOf;
        int a;
        String valueOf2;
        if (this.d == -1 || ((long) this.e) <= this.d) {
            this.e++;
            fbn fbn = (fbn) jyn.a(context, fbn.class);
            AtomicReference atomicReference = new AtomicReference();
            AtomicReference atomicReference2 = new AtomicReference();
            omq a2 = a(fbn, atomicReference, atomicReference2);
            String valueOf3;
            if (a2 == null) {
                valueOf3 = String.valueOf(e());
                glk.e("Babel_Grpc", new StringBuilder(String.valueOf(valueOf3).length() + 66).append("Send request ").append(valueOf3).append(" unable to get the grpc stub. The grpc channel is NA.").toString(), new Object[0]);
                return bhn.b;
            }
            String b = b.b(e());
            try {
                valueOf = String.valueOf(e());
                glk.a("Babel_Grpc", new StringBuilder(String.valueOf(valueOf).length() + 45).append("Sending request ").append(valueOf).append(" at retry attempt ").append(this.e).toString(), new Object[0]);
                a(context, a2);
                return bhn.a;
            } catch (fdo e) {
                a = a(context, e);
                return a;
            } catch (Throwable e2) {
                valueOf = String.valueOf(e());
                valueOf3 = String.valueOf(atomicReference.get());
                valueOf2 = String.valueOf(atomicReference2.get());
                glk.e("Babel_Grpc", new StringBuilder(((String.valueOf(valueOf).length() + 56) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf2).length()).append("Send request ").append(valueOf).append(" grpc headers capture: ").append(valueOf3).append("\n trailers capture: ").append(valueOf2).toString(), new Object[0]);
                olv a3 = olv.a(e2);
                String valueOf4 = String.valueOf(e());
                glk.d("Babel_Grpc", new StringBuilder(String.valueOf(valueOf4).length() + 45).append("Send request ").append(valueOf4).append("grpc send error code ").append(a3.a().a()).toString(), e2);
                if (a(a3, olv.f) || a(a3, olv.q) || a(a3, olv.c)) {
                    a = bhn.b;
                    return a;
                } else if (a(a3, olv.e)) {
                    a = a(context, new fdo(111));
                    b.c(b);
                    return a;
                } else if (a(a3, olv.g)) {
                    a = a(context, new fdo(113));
                    b.c(b);
                    return a;
                } else if (a(a3, olv.j)) {
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
        } else {
            valueOf2 = String.valueOf(e());
            a(context, new fdo(109, new StringBuilder(String.valueOf(valueOf2).length() + 66).append("Send request ").append(valueOf2).append(" exceeds maximum allowed retries ").append(this.d).toString()));
            return bhn.d;
        }
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
