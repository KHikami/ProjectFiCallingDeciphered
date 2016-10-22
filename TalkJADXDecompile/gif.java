import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

final class gif {
    private final HashMap<Class<? extends ayo>, List<gii<?>>> a;

    gif() {
        this.a = new HashMap();
    }

    synchronized <T extends ayo> void a(gic gic, gia<T> gia_T, Class<T> cls, gib gib) {
        List list;
        List list2 = (List) this.a.get(cls);
        if (list2 == null) {
            ArrayList arrayList = new ArrayList();
            this.a.put(cls, arrayList);
            list = arrayList;
        } else {
            list = list2;
        }
        list.add(new gii(this, gic, cls, gia_T, gib));
    }

    synchronized void a(gic gic) {
        for (List listIterator : this.a.values()) {
            ListIterator listIterator2 = listIterator.listIterator();
            while (listIterator2.hasNext()) {
                if (((gii) listIterator2.next()).a.a(gic)) {
                    listIterator2.remove();
                }
            }
        }
    }

    synchronized <T extends ayo> void a(T t, gib gib) {
        List<gii> list = (List) this.a.get(t.getClass());
        int i = 0;
        if (list != null) {
            for (gii gii : list) {
                int i2;
                if (gib.a(gii.d)) {
                    a((ayo) t, gii.c);
                    i2 = i + 1;
                } else {
                    i2 = i;
                }
                i = i2;
            }
        }
        if (i == 0) {
            String str;
            String valueOf = String.valueOf(t.toString());
            String valueOf2 = String.valueOf(t.getClass().toString());
            String valueOf3 = String.valueOf(gib.toString());
            if (list == null) {
                str = "null";
            } else {
                str = list.size();
            }
            new StringBuilder((((String.valueOf(valueOf).length() + 60) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(str).length()).append("No callback matching for ").append(valueOf).append("; type = ").append(valueOf2).append("; filter = ").append(valueOf3).append("; # of items = ").append(str);
        }
    }

    synchronized <T extends ayo> void a(T t, gia<T> gia_T) {
        gwb.a(new gig(this, gia_T, t));
    }

    synchronized <T extends ayo> void a(T t, Exception exception, gib gib) {
        List<gii> list = (List) this.a.get(t.getClass());
        int i = 0;
        if (list != null) {
            for (gii gii : list) {
                int i2;
                if (gib.a(gii.d)) {
                    a((ayo) t, exception, gii.c);
                    i2 = i + 1;
                } else {
                    i2 = i;
                }
                i = i2;
            }
        }
        if (i == 0) {
            String str;
            String valueOf = String.valueOf(t.toString());
            String valueOf2 = String.valueOf(t.getClass().toString());
            String valueOf3 = String.valueOf(gib);
            if (list == null) {
                str = "null";
            } else {
                str = list.size();
            }
            new StringBuilder((((String.valueOf(valueOf).length() + 60) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(str).length()).append("No callback matching for ").append(valueOf).append("; type = ").append(valueOf2).append("; filter = ").append(valueOf3).append("; # of items = ").append(str);
        }
    }

    private synchronized <T extends ayo> void a(T t, Exception exception, gia<T> gia_T) {
        gwb.a(new gih(this, gia_T, t, exception));
    }
}
