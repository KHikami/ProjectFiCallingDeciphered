import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
public final class dgr {
    public static final dgx a;
    public final Map b;
    public int c;

    static {
        dgs dgs = new dgs();
        a = new dgt();
        dgu dgu = new dgu();
    }

    public dgr(byte[]... bArr) {
        boolean z;
        int i = 0;
        this.b = new LinkedHashMap();
        if (bArr.length % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        cob.a(z, "Odd number of key-value pairs: %s", bArr.length);
        while (i < bArr.length) {
            String str = new String(bArr[i], cyg.a);
            a(str, new dhb(str.endsWith("-bin"), bArr[i + 1]));
            i += 2;
        }
    }

    public dgr() {
        this.b = new LinkedHashMap();
    }

    public final void a(String str, dhb dhb) {
        List list = (List) this.b.get(str);
        if (list == null) {
            list = new ArrayList(1);
            this.b.put(str, list);
        }
        this.c++;
        list.add(dhb);
    }

    public final Object a(dha dha) {
        List list = (List) this.b.get(dha.a);
        if (list == null) {
            return null;
        }
        return ((dhb) list.get(list.size() - 1)).a(dha);
    }

    public final void a(dha dha, Object obj) {
        cob.b((Object) dha, (Object) "key");
        cob.b(obj, (Object) "value");
        a(dha.a, new dhb(dha, obj));
    }

    public final Iterable b(dha dha) {
        Iterable iterable = (List) this.b.remove(dha.a);
        if (iterable == null) {
            return null;
        }
        this.c -= iterable.size();
        return buf.a(iterable, new dgv(this, dha));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b.toString());
        return new StringBuilder(String.valueOf(valueOf).length() + 10).append("Metadata(").append(valueOf).append(")").toString();
    }
}
