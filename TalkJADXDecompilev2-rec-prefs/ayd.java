package p000;

import java.util.ArrayList;
import java.util.List;

public final class ayd {
    private final List<aye<?, ?>> f2533a = new ArrayList();

    public synchronized <Z, R> void m4331a(Class<Z> cls, Class<R> cls2, ayc<Z, R> ayc_Z__R) {
        this.f2533a.add(new aye(cls, cls2, ayc_Z__R));
    }

    public synchronized <Z, R> ayc<Z, R> m4330a(Class<Z> cls, Class<R> cls2) {
        ayc<Z, R> ayc_Z__R;
        if (cls2.isAssignableFrom(cls)) {
            ayc_Z__R = ayf.f2537a;
        } else {
            for (aye aye : this.f2533a) {
                if (aye.m4333a(cls, cls2)) {
                    ayc_Z__R = aye.f2534a;
                }
            }
            String valueOf = String.valueOf(cls);
            String valueOf2 = String.valueOf(cls2);
            throw new IllegalArgumentException(new StringBuilder((String.valueOf(valueOf).length() + 47) + String.valueOf(valueOf2).length()).append("No transcoder registered to transcode from ").append(valueOf).append(" to ").append(valueOf2).toString());
        }
        return ayc_Z__R;
    }

    public synchronized <Z, R> List<Class<R>> m4332b(Class<Z> cls, Class<R> cls2) {
        List<Class<R>> list;
        List<Class<R>> arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            list = arrayList;
        } else {
            for (aye a : this.f2533a) {
                if (a.m4333a(cls, cls2)) {
                    arrayList.add(cls2);
                }
            }
            list = arrayList;
        }
        return list;
    }
}
