package defpackage;

import java.net.URI;
import java.util.List;
import java.util.Map;

@Deprecated
public final class omd implements ojq {
    public okw a;
    public Map<String, List<String>> b;
    private final lki c;

    public omd(lki lki) {
        this.c = (lki) bm.a(lki, "credentials");
    }

    public <ReqT, RespT> ojo<ReqT, RespT> a(olh<ReqT, RespT> olh_ReqT__RespT, ojm ojm, ojn ojn) {
        return new ojt(this, ojn.a(olh_ReqT__RespT, ojm), ojn, olh_ReqT__RespT);
    }

    public URI a(ojn ojn, olh<?, ?> olh___) {
        Object obj = null;
        String a = ojn.a();
        if (a == null) {
            throw olv.j.a("Channel has no authority").f();
        }
        String str = "/";
        String b = olh___.b();
        int lastIndexOf = b.lastIndexOf(47);
        if (lastIndexOf != -1) {
            obj = b.substring(0, lastIndexOf);
        }
        String valueOf = String.valueOf(obj);
        try {
            URI uri = new URI("https", a, valueOf.length() != 0 ? str.concat(valueOf) : new String(str), null, null);
            if (uri.getPort() == 443) {
                return omd.b(uri);
            }
            return uri;
        } catch (Throwable e) {
            throw olv.j.a("Unable to construct service URI for auth").b(e).f();
        }
    }

    private static URI b(URI uri) {
        try {
            return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), -1, uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (Throwable e) {
            throw olv.j.a("Unable to construct service URI after removing port").b(e).f();
        }
    }

    public Map<String, List<String>> a(URI uri) {
        try {
            return this.c.b();
        } catch (Throwable e) {
            throw olv.j.b(e).f();
        }
    }
}
