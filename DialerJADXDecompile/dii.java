import io.grpc.internal.ar;
import io.grpc.internal.ch;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public final class dii {
    private static dju a;
    private static dju b;
    private static dju c;
    private static dju d;

    static {
        a = new dju(dju.d, "https");
        b = new dju(dju.b, "POST");
        c = new dju(ar.d.a, "application/grpc");
        d = new dju("te", "trailers");
    }

    public static List a(dgr dgr, String str, String str2) {
        cob.b((Object) dgr, (Object) "headers");
        cob.b((Object) str, (Object) "defaultPath");
        cob.b((Object) str2, (Object) "authority");
        List arrayList = new ArrayList(dgr.c + 7);
        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(new dju(dju.e, str2));
        arrayList.add(new dju(dju.c, str));
        arrayList.add(new dju(ar.e.a, ar.a("okhttp", (String) dgr.a(ar.e))));
        arrayList.add(c);
        arrayList.add(d);
        byte[][] a = ch.a(dgr);
        for (int i = 0; i < a.length; i += 2) {
            Object obj;
            dlx a2 = dlx.a(a[i]);
            String a3 = a2.a();
            if (a3.startsWith(":") || ar.d.a.equalsIgnoreCase(a3) || ar.e.a.equalsIgnoreCase(a3)) {
                obj = null;
            } else {
                obj = 1;
            }
            if (obj != null) {
                arrayList.add(new dju(a2, dlx.a(a[i + 1])));
            }
        }
        return arrayList;
    }
}
