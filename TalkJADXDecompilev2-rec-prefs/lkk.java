package p000;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class lkk extends lki {
    private final Object f12641a;
    kfk f12642b;
    private Map<String, List<String>> f12643c;
    private lkj f12644d;
    private List<C0000a> f12645e;

    public lkk() {
        this(null);
    }

    private lkk(lkj lkj) {
        this.f12641a = new Object();
        this.f12642b = kfk.f21569a;
        this.f12644d = null;
    }

    public Map<String, List<String>> mo1965b() {
        Map<String, List<String>> map;
        synchronized (this.f12641a) {
            Long d = m14898d();
            if (this.f12644d == null || (d != null && d.longValue() <= 60000)) {
                m14901c();
            }
            if (this.f12643c == null) {
                Map hashMap = new HashMap();
                List arrayList = new ArrayList();
                String valueOf = String.valueOf("Bearer ");
                String valueOf2 = String.valueOf(this.f12644d.m29221a());
                arrayList.add(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                hashMap.put("Authorization", arrayList);
                this.f12643c = hashMap;
            }
            map = this.f12643c;
        }
        return map;
    }

    public void m14901c() {
        synchronized (this.f12641a) {
            this.f12643c = null;
            this.f12644d = null;
            this.f12644d = mo1966a();
            if (this.f12645e != null) {
                Iterator it = this.f12645e.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    public lkj mo1966a() {
        throw new IllegalStateException("OAuth2Credentials instance does not support refreshing the access token. An instance with a new access token should be used, or a derived type that supports refreshing should be used.");
    }

    private final Long m14898d() {
        Long l = null;
        synchronized (this.f12641a) {
            if (this.f12644d == null) {
            } else {
                Date b = this.f12644d.m29222b();
                if (b == null) {
                } else {
                    l = Long.valueOf(b.getTime() - this.f12642b.mo3671a());
                }
            }
        }
        return l;
    }
}
