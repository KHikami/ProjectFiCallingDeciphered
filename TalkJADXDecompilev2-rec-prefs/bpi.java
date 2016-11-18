package p000;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class bpi extends fip {
    final /* synthetic */ bph f4157a;

    bpi(bph bph) {
        this.f4157a = bph;
    }

    public void mo640a(int i, bko bko, fok fok, fdo fdo) {
        if (fok instanceof eup) {
            String str = ((eup) fok).f12309k;
            if (str != null) {
                int g = bko.m5638g();
                Set set = (Set) this.f4157a.f4156a.get(Integer.valueOf(g));
                if (set == null) {
                    Map map = this.f4157a.f4156a;
                    Integer valueOf = Integer.valueOf(g);
                    set = new HashSet();
                    map.put(valueOf, set);
                }
                set.add(str);
            }
        }
    }
}
