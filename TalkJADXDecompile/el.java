import java.util.List;

public final class el {
    private final List<dr> a;
    private final List<el> b;

    el(List<dr> list, List<el> list2) {
        this.a = list;
        this.b = list2;
    }

    List<dr> a() {
        return this.a;
    }

    List<el> b() {
        return this.b;
    }
}
