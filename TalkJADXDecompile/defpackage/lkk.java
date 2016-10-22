package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: lkk */
public class lkk extends lki {
    private final Object a;
    kfk b;
    private Map<String, List<String>> c;
    private lkj d;
    private List<a> e;

    public lkk() {
        this(null);
    }

    private lkk(lkj lkj) {
        this.a = new Object();
        this.b = kfk.a;
        this.d = null;
    }

    public Map<String, List<String>> b() {
        Map<String, List<String>> map;
        synchronized (this.a) {
            Long d = d();
            if (this.d == null || (d != null && d.longValue() <= 60000)) {
                c();
            }
            if (this.c == null) {
                Map hashMap = new HashMap();
                List arrayList = new ArrayList();
                String valueOf = String.valueOf("Bearer ");
                String valueOf2 = String.valueOf(this.d.a());
                arrayList.add(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                hashMap.put("Authorization", arrayList);
                this.c = hashMap;
            }
            map = this.c;
        }
        return map;
    }

    public void c() {
        synchronized (this.a) {
            this.c = null;
            this.d = null;
            this.d = a();
            if (this.e != null) {
                Iterator it = this.e.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    public lkj a() {
        throw new IllegalStateException("OAuth2Credentials instance does not support refreshing the access token. An instance with a new access token should be used, or a derived type that supports refreshing should be used.");
    }

    private final Long d() {
        Long l = null;
        synchronized (this.a) {
            if (this.d == null) {
            } else {
                Date b = this.d.b();
                if (b == null) {
                } else {
                    l = Long.valueOf(b.getTime() - this.b.a());
                }
            }
        }
        return l;
    }
}
