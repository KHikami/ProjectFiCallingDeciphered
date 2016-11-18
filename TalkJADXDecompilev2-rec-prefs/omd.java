package p000;

import java.net.URI;
import java.util.List;
import java.util.Map;

@Deprecated
public final class omd implements ojq {
    public okw f33194a;
    public Map<String, List<String>> f33195b;
    private final lki f33196c;

    public omd(lki lki) {
        this.f33196c = (lki) bm.a(lki, "credentials");
    }

    public <ReqT, RespT> ojo<ReqT, RespT> m38713a(olh<ReqT, RespT> olh_ReqT__RespT, ojm ojm, ojn ojn) {
        return new ojt(this, ojn.mo4155a(olh_ReqT__RespT, ojm), ojn, olh_ReqT__RespT);
    }

    public URI m38711a(ojn ojn, olh<?, ?> olh___) {
        Object obj = null;
        String a = ojn.mo4154a();
        if (a == null) {
            throw olv.j.a("Channel has no authority").f();
        }
        String str = "/";
        String b = olh___.m38678b();
        int lastIndexOf = b.lastIndexOf(47);
        if (lastIndexOf != -1) {
            obj = b.substring(0, lastIndexOf);
        }
        String valueOf = String.valueOf(obj);
        try {
            URI uri = new URI("https", a, valueOf.length() != 0 ? str.concat(valueOf) : new String(str), null, null);
            if (uri.getPort() == 443) {
                return omd.m38710b(uri);
            }
            return uri;
        } catch (Throwable e) {
            throw olv.j.a("Unable to construct service URI for auth").b(e).f();
        }
    }

    private static URI m38710b(URI uri) {
        try {
            return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), -1, uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (Throwable e) {
            throw olv.j.a("Unable to construct service URI after removing port").b(e).f();
        }
    }

    public Map<String, List<String>> m38712a(URI uri) {
        try {
            return this.f33196c.b();
        } catch (Throwable e) {
            throw olv.j.b(e).f();
        }
    }
}
