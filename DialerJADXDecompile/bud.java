import java.util.ArrayList;
import java.util.List;

final class bud extends btr {
    private List b;

    bud(List list) {
        this.b = list;
    }

    public final btr a(btr btr) {
        List arrayList = new ArrayList(this.b);
        arrayList.add(buf.A((Object) btr));
        return new bud(arrayList);
    }

    public final boolean a(char c) {
        for (btr a : this.b) {
            if (a.a(c)) {
                return true;
            }
        }
        return false;
    }
}
