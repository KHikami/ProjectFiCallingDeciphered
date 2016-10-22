import java.util.List;
import java.util.Map;

final class bnw extends gpx {
    private final Map<String, Integer> a;
    private final Map<String, List<edk>> b;

    bnw() {
        this.a = new ky();
        this.b = new ky();
    }

    public int a(String str) {
        return gwb.a((Integer) this.a.get(str));
    }

    public boolean b(String str) {
        return this.a.containsKey(str);
    }

    public void a(String str, int i) {
        this.a.put(str, Integer.valueOf(i));
    }

    public void a(String str, List<edk> list) {
        this.b.put(str, list);
    }

    public List<edk> c(String str) {
        return (List) this.b.get(str);
    }
}
