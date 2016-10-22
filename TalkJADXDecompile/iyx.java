import java.lang.ref.Reference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class iyx {
    private final iyz a;
    private final ByteBuffer b;
    private final izb c;
    private final izb d;
    private final izd<iyu> e;
    private final izd<iyw> f;
    private final Map<String, List<iyw>> g;
    private final izb h;
    private final izd<iyy> i;
    private final izf<iyy> j;

    iyx(iyz iyz, Iterable<Integer> iterable, Iterable<String> iterable2, Iterable<String> iterable3) {
        this.c = new izb();
        this.d = new izb();
        this.e = new izd();
        this.f = new izd();
        this.g = new ky();
        this.h = new izb();
        this.i = new izd();
        this.j = new izf();
        this.a = iyz;
        this.b = iyz.a();
        this.j.a(Reference.class.getName(), iyy.CLASSIFY_REF);
        if (iterable2 != null) {
            for (String a : iterable2) {
                this.j.a(a, iyy.EXCLUDE_INSTANCE);
            }
        }
        if (iterable3 != null) {
            for (String a2 : iterable3) {
                this.j.a(a2, iyy.FIND_INSTANCE);
            }
        }
        if (iterable != null) {
            for (Integer intValue : iterable) {
                this.h.a(intValue.intValue(), 0);
            }
        }
    }

    iza a() {
        while (this.b.hasRemaining()) {
            byte b = this.b.get();
            this.b.getInt();
            if (this.b.getInt(this.b.position()) >= 0) {
                int position;
                int i;
                switch (b) {
                    case wi.j /*1*/:
                        position = this.b.position();
                        i = this.b.getInt();
                        this.c.a(this.a.c(), position);
                        this.a.g(i - this.a.b());
                        break;
                    case wi.l /*2*/:
                        this.b.getInt();
                        this.b.getInt();
                        position = this.b.position();
                        i = this.a.c();
                        this.b.getInt();
                        int b2 = this.c.b(this.a.c());
                        iyu iyu = new iyu(position, b2);
                        this.e.a(i, iyu);
                        position = this.a.b(b2);
                        iyy iyy = (iyy) this.j.a(this.b, this.a.c(b2), position);
                        if (iyy != iyy.CLASSIFY_REF) {
                            if (iyy == null) {
                                break;
                            }
                            this.i.a(i, iyy);
                            break;
                        }
                        iyu.d |= 2;
                        break;
                    case wi.dM /*12*/:
                    case wi.o /*28*/:
                        b();
                        break;
                    default:
                        this.a.g(this.b.getInt());
                        break;
                }
            }
            throw new RuntimeException("Length too large to parse.");
        }
        ize b3 = this.e.b();
        while (b3.a()) {
            ((iyu) b3.b()).b();
        }
        List arrayList = new ArrayList();
        izc b4 = this.d.b();
        while (b4.a()) {
            int b5 = b4.b();
            iyw iyw = (iyw) this.e.a(b5);
            if (iyw == null) {
                iyw = (iyw) this.f.a(b5);
                if (iyw == null) {
                }
            }
            iyw.d |= 1;
            arrayList.add(iyw);
        }
        this.c.a();
        this.i.a();
        return new iza(this.e, this.f, arrayList, this.g);
    }

    private void b() {
        int position = this.b.position() + this.b.getInt();
        while (this.b.position() < position) {
            int i = this.b.get() & 255;
            int f;
            if (this.a.e(i)) {
                f = this.a.f(i);
                if (this.h.c(i)) {
                    this.a.g(f);
                } else {
                    this.d.a(this.a.c(), i);
                    this.a.g(f - this.a.b());
                }
            } else {
                int position2;
                int c;
                int i2;
                switch (i) {
                    case 32:
                        ((iyu) this.e.a(this.a.c())).a(this.a, this.e, this.c);
                        break;
                    case 33:
                        position2 = this.b.position();
                        c = this.a.c();
                        this.b.getInt();
                        f = this.a.c();
                        i2 = this.b.getInt();
                        iyu iyu = (iyu) this.e.a(f);
                        iyy iyy = (iyy) this.i.a(f);
                        if (!(iyu == null || iyy == iyy.EXCLUDE_INSTANCE)) {
                            iyv iyv = new iyv(position2, iyu);
                            this.f.a(c, iyv);
                            if (iyy == iyy.FIND_INSTANCE) {
                                String c2 = iyu.c(this.a);
                                List list = (List) this.g.get(c2);
                                if (list == null) {
                                    list = new ArrayList();
                                    this.g.put(c2, list);
                                }
                                list.add(iyv);
                            }
                        }
                        this.a.g(i2);
                        break;
                    case 34:
                        f = this.b.position();
                        position2 = this.a.c();
                        this.b.getInt();
                        c = this.b.getInt();
                        i2 = this.a.c();
                        iyy iyy2 = (iyy) this.i.a(i2);
                        if (this.e.b(i2) && iyy2 != iyy.EXCLUDE_INSTANCE) {
                            this.f.a(position2, new iyt(f));
                        }
                        this.a.g(this.a.b() * c);
                        break;
                    case 35:
                    case 195:
                        this.a.c();
                        this.b.getInt();
                        this.a.g(this.b.getInt() * this.a.d(this.b.get()));
                        break;
                    case 254:
                        this.b.getInt();
                        this.a.c();
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown tag " + i);
                }
            }
        }
        ba.b(this.b.position() == position);
    }
}
