package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import nvw;
import nvy;
import nwg;
import nwv;
import nww;
import nxe;
import nxg;
import nxl;
import nxo;
import nyh;
import nyi;
import nyn;
import nyo;

/* renamed from: nwf */
public final class nwf<FieldDescriptorType extends nwh<FieldDescriptorType>> {
    private static final nwf d;
    private final nxo<FieldDescriptorType, Object> a;
    private boolean b;
    private boolean c;

    public /* synthetic */ Object clone() {
        return c();
    }

    nwf() {
        this.c = false;
        this.a = nxo.a(16);
    }

    private nwf(byte b) {
        this.c = false;
        this.a = nxo.a(0);
        a();
    }

    static {
        d = new nwf((byte) 0);
    }

    public void a() {
        if (!this.b) {
            this.a.a();
            this.b = true;
        }
    }

    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwf)) {
            return false;
        }
        return this.a.equals(((nwf) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public Iterator<Entry<FieldDescriptorType, Object>> d() {
        if (this.c) {
            return new nxg(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public Object a(FieldDescriptorType fieldDescriptorType) {
        Object obj = this.a.get(fieldDescriptorType);
        if (obj instanceof nxe) {
            return ((nxe) obj).a();
        }
        return obj;
    }

    public void a(FieldDescriptorType fieldDescriptorType, Object obj) {
        Object obj2;
        if (!fieldDescriptorType.d()) {
            nwf.a(fieldDescriptorType.b(), obj);
            obj2 = obj;
        } else if (obj instanceof List) {
            obj2 = new ArrayList();
            obj2.addAll((List) obj);
            ArrayList arrayList = (ArrayList) obj2;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                i++;
                nwf.a(fieldDescriptorType.b(), obj3);
            }
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj2 instanceof nxe) {
            this.c = true;
        }
        this.a.a(fieldDescriptorType, obj2);
    }

    public void b(FieldDescriptorType fieldDescriptorType, Object obj) {
        if (fieldDescriptorType.d()) {
            List arrayList;
            nwf.a(fieldDescriptorType.b(), obj);
            Object a = a((nwh) fieldDescriptorType);
            if (a == null) {
                arrayList = new ArrayList();
                this.a.a(fieldDescriptorType, arrayList);
            } else {
                arrayList = (List) a;
            }
            arrayList.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    private static void a(nyi nyi, Object obj) {
        boolean z = false;
        if (obj == null) {
            throw new NullPointerException();
        }
        switch (nwg.a[nyi.a().ordinal()]) {
            case wi.j /*1*/:
                z = obj instanceof Integer;
                break;
            case wi.l /*2*/:
                z = obj instanceof Long;
                break;
            case wi.z /*3*/:
                z = obj instanceof Float;
                break;
            case wi.h /*4*/:
                z = obj instanceof Double;
                break;
            case wi.p /*5*/:
                z = obj instanceof Boolean;
                break;
            case wi.s /*6*/:
                z = obj instanceof String;
                break;
            case wi.q /*7*/:
                if ((obj instanceof nvn) || (obj instanceof byte[])) {
                    z = true;
                    break;
                }
            case wi.m /*8*/:
                if ((obj instanceof Integer) || (obj instanceof nww)) {
                    z = true;
                    break;
                }
            case wi.n /*9*/:
                if ((obj instanceof nxi) || (obj instanceof nxe)) {
                    z = true;
                    break;
                }
        }
        if (!z) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public boolean e() {
        for (int i = 0; i < this.a.c(); i++) {
            if (!nwf.a(this.a.b(i))) {
                return false;
            }
        }
        for (Entry a : this.a.e()) {
            if (!nwf.a(a)) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(Entry<FieldDescriptorType, Object> entry) {
        nwh nwh = (nwh) entry.getKey();
        if (nwh.c() == nyn.i) {
            if (nwh.d()) {
                for (nxi e : (List) entry.getValue()) {
                    if (!e.e()) {
                        return false;
                    }
                }
            }
            Object value = entry.getValue();
            if (value instanceof nxi) {
                if (!((nxi) value).e()) {
                    return false;
                }
            } else if (value instanceof nxe) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    static int a(nyi nyi, boolean z) {
        if (z) {
            return 2;
        }
        return nyi.b();
    }

    public void a(nwf<FieldDescriptorType> nwf_FieldDescriptorType) {
        for (int i = 0; i < nwf_FieldDescriptorType.a.c(); i++) {
            b(nwf_FieldDescriptorType.a.b(i));
        }
        for (Entry b : nwf_FieldDescriptorType.a.e()) {
            b(b);
        }
    }

    private static Object a(Object obj) {
        if (obj instanceof nxl) {
            return ((nxl) obj).b();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        Object obj2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, obj2, 0, bArr.length);
        return obj2;
    }

    private void b(Entry<FieldDescriptorType, Object> entry) {
        nwh nwh = (nwh) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof nxe) {
            value = ((nxe) value).a();
        }
        Object a;
        if (nwh.d()) {
            a = a(nwh);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(nwf.a(a2));
            }
            this.a.a(nwh, a);
        } else if (nwh.c() == nyn.i) {
            a = a(nwh);
            if (a == null) {
                this.a.a(nwh, nwf.a(value));
                return;
            }
            if (a instanceof nxl) {
                value = nwh.f();
            } else {
                value = nwh.a(((nxi) a).f(), (nxi) value).i();
            }
            this.a.a(nwh, value);
        } else {
            this.a.a(nwh, nwf.a(value));
        }
    }

    public static Object a(nvw nvw, nyi nyi, boolean z) {
        nyo nyo = nyo.a;
        switch (nyh.a[nyi.ordinal()]) {
            case wi.j /*1*/:
                return Double.valueOf(nvw.b());
            case wi.l /*2*/:
                return Float.valueOf(nvw.c());
            case wi.z /*3*/:
                return Long.valueOf(nvw.e());
            case wi.h /*4*/:
                return Long.valueOf(nvw.d());
            case wi.p /*5*/:
                return Integer.valueOf(nvw.f());
            case wi.s /*6*/:
                return Long.valueOf(nvw.g());
            case wi.q /*7*/:
                return Integer.valueOf(nvw.h());
            case wi.m /*8*/:
                return Boolean.valueOf(nvw.i());
            case wi.n /*9*/:
                return nvw.l();
            case wi.dr /*10*/:
                return Integer.valueOf(nvw.m());
            case wi.dB /*11*/:
                return Integer.valueOf(nvw.o());
            case wi.dM /*12*/:
                return Long.valueOf(nvw.p());
            case wi.dD /*13*/:
                return Integer.valueOf(nvw.q());
            case wi.g /*14*/:
                return Long.valueOf(nvw.r());
            case wi.dJ /*15*/:
                return nyo.a(nvw);
            case wi.dI /*16*/:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case wi.dK /*17*/:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case wi.dH /*18*/:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static void a(nvy nvy, nyi nyi, int i, Object obj) {
        if (nyi != nyi.j) {
            nvy.a(i, nwf.a(nyi, false));
            nwf.a(nvy, nyi, obj);
        } else if (nwv.a((nxi) obj)) {
            nvy.a(i, 3);
            ((nxi) obj).a(nvy);
        } else {
            nvy.e(i, (nxi) obj);
        }
    }

    private static void a(nvy nvy, nyi nyi, Object obj) {
        int i = 0;
        switch (nwg.b[nyi.ordinal()]) {
            case wi.j /*1*/:
                nvy.b(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
            case wi.l /*2*/:
                nvy.c(Float.floatToRawIntBits(((Float) obj).floatValue()));
            case wi.z /*3*/:
                nvy.a(((Long) obj).longValue());
            case wi.h /*4*/:
                nvy.a(((Long) obj).longValue());
            case wi.p /*5*/:
                nvy.a(((Integer) obj).intValue());
            case wi.s /*6*/:
                nvy.b(((Long) obj).longValue());
            case wi.q /*7*/:
                nvy.c(((Integer) obj).intValue());
            case wi.m /*8*/:
                if (((Boolean) obj).booleanValue()) {
                    i = 1;
                }
                nvy.a((byte) i);
            case wi.n /*9*/:
                ((nxi) obj).a(nvy);
            case wi.dr /*10*/:
                nvy.a((nxi) obj);
            case wi.dB /*11*/:
                if (obj instanceof nvn) {
                    nvy.a((nvn) obj);
                } else {
                    nvy.a((String) obj);
                }
            case wi.dM /*12*/:
                if (obj instanceof nvn) {
                    nvy.a((nvn) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                nvy.b(bArr, 0, bArr.length);
            case wi.dD /*13*/:
                nvy.b(((Integer) obj).intValue());
            case wi.g /*14*/:
                nvy.c(((Integer) obj).intValue());
            case wi.dJ /*15*/:
                nvy.b(((Long) obj).longValue());
            case wi.dI /*16*/:
                nvy.b(nvy.i(((Integer) obj).intValue()));
            case wi.dK /*17*/:
                nvy.a(nvy.f(((Long) obj).longValue()));
            case wi.dH /*18*/:
                if (obj instanceof nww) {
                    nvy.a(((nww) obj).a());
                } else {
                    nvy.a(((Integer) obj).intValue());
                }
            default:
        }
    }

    public static void a(nwh<?> nwh_, Object obj, nvy nvy) {
        nyi b = nwh_.b();
        int a = nwh_.a();
        if (nwh_.d()) {
            List<Object> list = (List) obj;
            if (nwh_.e()) {
                nvy.a(a, 2);
                a = 0;
                for (Object b2 : list) {
                    a += nwf.b(b, b2);
                }
                nvy.b(a);
                for (Object a2 : list) {
                    nwf.a(nvy, b, a2);
                }
                return;
            }
            for (Object b22 : list) {
                nwf.a(nvy, b, a, b22);
            }
        } else if (obj instanceof nxe) {
            nwf.a(nvy, b, a, ((nxe) obj).a());
        } else {
            nwf.a(nvy, b, a, obj);
        }
    }

    public int f() {
        int i = 0;
        int i2 = 0;
        while (i < this.a.c()) {
            i2 += nwf.c(this.a.b(i));
            i++;
        }
        for (Entry c : this.a.e()) {
            i2 += nwf.c(c);
        }
        return i2;
    }

    private static int c(Entry<FieldDescriptorType, Object> entry) {
        int i = 0;
        nwh nwh = (nwh) entry.getKey();
        Object value = entry.getValue();
        if (nwh.c() != nyn.i || nwh.d() || nwh.e()) {
            nyi b = nwh.b();
            int a = nwh.a();
            if (!nwh.d()) {
                return nwf.a(b, a, value);
            }
            if (nwh.e()) {
                int i2 = 0;
                for (Object b2 : (List) value) {
                    i2 += nwf.b(b, b2);
                }
                return (nvy.d(a) + i2) + nvy.j(i2);
            }
            for (Object value2 : (List) value2) {
                i += nwf.a(b, a, value2);
            }
            return i;
        } else if (value2 instanceof nxe) {
            return nvy.a(((nwh) entry.getKey()).a(), (nxe) value2);
        } else {
            return nvy.d(((nwh) entry.getKey()).a(), (nxi) value2);
        }
    }

    private static int a(nyi nyi, int i, Object obj) {
        int i2;
        int d = nvy.d(i);
        if (nyi != nyi.j || nwv.a((nxi) obj)) {
            i2 = d;
        } else {
            i2 = d << 1;
        }
        return i2 + nwf.b(nyi, obj);
    }

    private static int b(nyi nyi, Object obj) {
        switch (nwg.b[nyi.ordinal()]) {
            case wi.j /*1*/:
                ((Double) obj).doubleValue();
                return nvy.f();
            case wi.l /*2*/:
                ((Float) obj).floatValue();
                return nvy.e();
            case wi.z /*3*/:
                return nvy.c(((Long) obj).longValue());
            case wi.h /*4*/:
                return nvy.d(((Long) obj).longValue());
            case wi.p /*5*/:
                return nvy.e(((Integer) obj).intValue());
            case wi.s /*6*/:
                ((Long) obj).longValue();
                return nvy.c();
            case wi.q /*7*/:
                ((Integer) obj).intValue();
                return nvy.a();
            case wi.m /*8*/:
                ((Boolean) obj).booleanValue();
                return nvy.g();
            case wi.n /*9*/:
                return nvy.c((nxi) obj);
            case wi.dr /*10*/:
                if (obj instanceof nxe) {
                    return nvy.a((nxe) obj);
                }
                return nvy.b((nxi) obj);
            case wi.dB /*11*/:
                if (obj instanceof nvn) {
                    return nvy.b((nvn) obj);
                }
                return nvy.b((String) obj);
            case wi.dM /*12*/:
                if (obj instanceof nvn) {
                    return nvy.b((nvn) obj);
                }
                return nvy.b((byte[]) obj);
            case wi.dD /*13*/:
                return nvy.f(((Integer) obj).intValue());
            case wi.g /*14*/:
                ((Integer) obj).intValue();
                return nvy.b();
            case wi.dJ /*15*/:
                ((Long) obj).longValue();
                return nvy.d();
            case wi.dI /*16*/:
                return nvy.g(((Integer) obj).intValue());
            case wi.dK /*17*/:
                return nvy.e(((Long) obj).longValue());
            case wi.dH /*18*/:
                if (obj instanceof nww) {
                    return nvy.h(((nww) obj).a());
                }
                return nvy.h(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public nwf<FieldDescriptorType> c() {
        nwf<FieldDescriptorType> nwf = new nwf();
        for (int i = 0; i < this.a.c(); i++) {
            Entry b = this.a.b(i);
            nwf.a((nwh) b.getKey(), b.getValue());
        }
        for (Entry entry : this.a.e()) {
            nwf.a((nwh) entry.getKey(), entry.getValue());
        }
        nwf.c = this.c;
        return nwf;
    }
}
