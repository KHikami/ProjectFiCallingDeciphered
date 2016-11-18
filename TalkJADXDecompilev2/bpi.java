package defpackage;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class bpi extends fip {
    final /* synthetic */ bph a;

    bpi(bph bph) {
        this.a = bph;
    }

    public void a(int i, bko bko, fok fok, fdo fdo) {
        if (fok instanceof eup) {
            String str = ((eup) fok).k;
            if (str != null) {
                int g = bko.g();
                Set set = (Set) this.a.a.get(Integer.valueOf(g));
                if (set == null) {
                    Map map = this.a.a;
                    Integer valueOf = Integer.valueOf(g);
                    set = new HashSet();
                    map.put(valueOf, set);
                }
                set.add(str);
            }
        }
    }
}
