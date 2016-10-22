import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
final class djw {
    static final dju[] a;
    static final Map b;

    static {
        int i = 0;
        a = new dju[]{new dju(dju.e, ""), new dju(dju.b, "GET"), new dju(dju.b, "POST"), new dju(dju.c, "/"), new dju(dju.c, "/index.html"), new dju(dju.d, "http"), new dju(dju.d, "https"), new dju(dju.a, "200"), new dju(dju.a, "204"), new dju(dju.a, "206"), new dju(dju.a, "304"), new dju(dju.a, "400"), new dju(dju.a, "404"), new dju(dju.a, "500"), new dju("accept-charset", ""), new dju("accept-encoding", "gzip, deflate"), new dju("accept-language", ""), new dju("accept-ranges", ""), new dju("accept", ""), new dju("access-control-allow-origin", ""), new dju("age", ""), new dju("allow", ""), new dju("authorization", ""), new dju("cache-control", ""), new dju("content-disposition", ""), new dju("content-encoding", ""), new dju("content-language", ""), new dju("content-length", ""), new dju("content-location", ""), new dju("content-range", ""), new dju("content-type", ""), new dju("cookie", ""), new dju("date", ""), new dju("etag", ""), new dju("expect", ""), new dju("expires", ""), new dju("from", ""), new dju("host", ""), new dju("if-match", ""), new dju("if-modified-since", ""), new dju("if-none-match", ""), new dju("if-range", ""), new dju("if-unmodified-since", ""), new dju("last-modified", ""), new dju("link", ""), new dju("location", ""), new dju("max-forwards", ""), new dju("proxy-authenticate", ""), new dju("proxy-authorization", ""), new dju("range", ""), new dju("referer", ""), new dju("refresh", ""), new dju("retry-after", ""), new dju("server", ""), new dju("set-cookie", ""), new dju("strict-transport-security", ""), new dju("transfer-encoding", ""), new dju("user-agent", ""), new dju("vary", ""), new dju("via", ""), new dju("www-authenticate", "")};
        Map linkedHashMap = new LinkedHashMap(a.length);
        while (i < a.length) {
            if (!linkedHashMap.containsKey(a[i].f)) {
                linkedHashMap.put(a[i].f, Integer.valueOf(i));
            }
            i++;
        }
        b = Collections.unmodifiableMap(linkedHashMap);
    }

    static dlx a(dlx dlx) {
        int i = 0;
        int length = dlx.b.length;
        while (i < length) {
            byte b = dlx.b[i];
            if (b < 65 || b > 90) {
                i++;
            } else {
                String str = "PROTOCOL_ERROR response malformed: mixed case name: ";
                String valueOf = String.valueOf(dlx.a());
                throw new IOException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
        return dlx;
    }
}
