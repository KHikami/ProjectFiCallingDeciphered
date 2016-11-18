package p000;

import java.lang.ref.Reference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class iyx {
    private final iyz f19427a;
    private final ByteBuffer f19428b;
    private final izb f19429c = new izb();
    private final izb f19430d = new izb();
    private final izd<iyu> f19431e = new izd();
    private final izd<iyw> f19432f = new izd();
    private final Map<String, List<iyw>> f19433g = new ky();
    private final izb f19434h = new izb();
    private final izd<iyy> f19435i = new izd();
    private final izf<iyy> f19436j = new izf();

    iyx(iyz iyz, Iterable<Integer> iterable, Iterable<String> iterable2, Iterable<String> iterable3) {
        this.f19427a = iyz;
        this.f19428b = iyz.m23538a();
        this.f19436j.m23573a(Reference.class.getName(), iyy.CLASSIFY_REF);
        if (iterable2 != null) {
            for (String a : iterable2) {
                this.f19436j.m23573a(a, iyy.EXCLUDE_INSTANCE);
            }
        }
        if (iterable3 != null) {
            for (String a2 : iterable3) {
                this.f19436j.m23573a(a2, iyy.FIND_INSTANCE);
            }
        }
        if (iterable != null) {
            for (Integer intValue : iterable) {
                this.f19434h.m23557a(intValue.intValue(), 0);
            }
        }
    }

    iza m23535a() {
        while (this.f19428b.hasRemaining()) {
            byte b = this.f19428b.get();
            this.f19428b.getInt();
            if (this.f19428b.getInt(this.f19428b.position()) >= 0) {
                int position;
                int i;
                switch (b) {
                    case (byte) 1:
                        position = this.f19428b.position();
                        i = this.f19428b.getInt();
                        this.f19429c.m23557a(this.f19427a.m23541c(), position);
                        this.f19427a.m23546g(i - this.f19427a.m23539b());
                        break;
                    case (byte) 2:
                        this.f19428b.getInt();
                        this.f19428b.getInt();
                        position = this.f19428b.position();
                        i = this.f19427a.m23541c();
                        this.f19428b.getInt();
                        int b2 = this.f19429c.m23559b(this.f19427a.m23541c());
                        iyu iyu = new iyu(position, b2);
                        this.f19431e.m23567a(i, iyu);
                        position = this.f19427a.m23540b(b2);
                        iyy iyy = (iyy) this.f19436j.m23574a(this.f19428b, this.f19427a.m23542c(b2), position);
                        if (iyy != iyy.CLASSIFY_REF) {
                            if (iyy == null) {
                                break;
                            }
                            this.f19435i.m23567a(i, iyy);
                            break;
                        }
                        iyu.d |= 2;
                        break;
                    case (byte) 12:
                    case (byte) 28:
                        m23534b();
                        break;
                    default:
                        this.f19427a.m23546g(this.f19428b.getInt());
                        break;
                }
            }
            throw new RuntimeException("Length too large to parse.");
        }
        ize b3 = this.f19431e.m23569b();
        while (b3.m23571a()) {
            ((iyu) b3.m23572b()).m23527b();
        }
        List arrayList = new ArrayList();
        izc b4 = this.f19430d.m23560b();
        while (b4.m23562a()) {
            int b5 = b4.m23563b();
            iyw iyw = (iyw) this.f19431e.m23566a(b5);
            if (iyw == null) {
                iyw = (iyw) this.f19432f.m23566a(b5);
                if (iyw == null) {
                }
            }
            iyw.f19417d |= 1;
            arrayList.add(iyw);
        }
        this.f19429c.m23558a();
        this.f19435i.m23568a();
        return new iza(this.f19431e, this.f19432f, arrayList, this.f19433g);
    }

    private void m23534b() {
        int position = this.f19428b.position() + this.f19428b.getInt();
        while (this.f19428b.position() < position) {
            int i = this.f19428b.get() & 255;
            int f;
            if (this.f19427a.m23544e(i)) {
                f = this.f19427a.m23545f(i);
                if (this.f19434h.m23561c(i)) {
                    this.f19427a.m23546g(f);
                } else {
                    this.f19430d.m23557a(this.f19427a.m23541c(), i);
                    this.f19427a.m23546g(f - this.f19427a.m23539b());
                }
            } else {
                int position2;
                int c;
                int i2;
                switch (i) {
                    case 32:
                        ((iyu) this.f19431e.m23566a(this.f19427a.m23541c())).m23524a(this.f19427a, this.f19431e, this.f19429c);
                        break;
                    case 33:
                        position2 = this.f19428b.position();
                        c = this.f19427a.m23541c();
                        this.f19428b.getInt();
                        f = this.f19427a.m23541c();
                        i2 = this.f19428b.getInt();
                        iyu iyu = (iyu) this.f19431e.m23566a(f);
                        iyy iyy = (iyy) this.f19435i.m23566a(f);
                        if (!(iyu == null || iyy == iyy.EXCLUDE_INSTANCE)) {
                            iyv iyv = new iyv(position2, iyu);
                            this.f19432f.m23567a(c, iyv);
                            if (iyy == iyy.FIND_INSTANCE) {
                                String c2 = iyu.m23528c(this.f19427a);
                                List list = (List) this.f19433g.get(c2);
                                if (list == null) {
                                    list = new ArrayList();
                                    this.f19433g.put(c2, list);
                                }
                                list.add(iyv);
                            }
                        }
                        this.f19427a.m23546g(i2);
                        break;
                    case 34:
                        f = this.f19428b.position();
                        position2 = this.f19427a.m23541c();
                        this.f19428b.getInt();
                        c = this.f19428b.getInt();
                        i2 = this.f19427a.m23541c();
                        iyy iyy2 = (iyy) this.f19435i.m23566a(i2);
                        if (this.f19431e.m23570b(i2) && iyy2 != iyy.EXCLUDE_INSTANCE) {
                            this.f19432f.m23567a(position2, new iyt(f));
                        }
                        this.f19427a.m23546g(this.f19427a.m23539b() * c);
                        break;
                    case 35:
                    case 195:
                        this.f19427a.m23541c();
                        this.f19428b.getInt();
                        this.f19427a.m23546g(this.f19428b.getInt() * this.f19427a.m23543d(this.f19428b.get()));
                        break;
                    case 254:
                        this.f19428b.getInt();
                        this.f19427a.m23541c();
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown tag " + i);
                }
            }
        }
        ba.m4609b(this.f19428b.position() == position);
    }
}
