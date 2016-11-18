package p000;

import java.util.List;
import java.util.Map;

final class bnw extends gpx {
    private final Map<String, Integer> f4072a = new ky();
    private final Map<String, List<edk>> f4073b = new ky();

    bnw() {
    }

    public int mo620a(String str) {
        return gwb.m1507a((Integer) this.f4072a.get(str));
    }

    public boolean mo623b(String str) {
        return this.f4072a.containsKey(str);
    }

    public void mo621a(String str, int i) {
        this.f4072a.put(str, Integer.valueOf(i));
    }

    public void mo622a(String str, List<edk> list) {
        this.f4073b.put(str, list);
    }

    public List<edk> mo624c(String str) {
        return (List) this.f4073b.get(str);
    }
}
