package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public final class nwf<FieldDescriptorType extends nwh<FieldDescriptorType>> {
    private static final nwf f28708d = new nwf((byte) 0);
    private final nxo<FieldDescriptorType, Object> f28709a = nxo.a(16);
    private boolean f28710b;
    private boolean f28711c = false;

    public /* synthetic */ Object clone() {
        return m33415c();
    }

    nwf() {
    }

    private nwf(byte b) {
        m33410a();
    }

    public void m33410a() {
        if (!this.f28710b) {
            this.f28709a.a();
            this.f28710b = true;
        }
    }

    public boolean m33414b() {
        return this.f28710b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwf)) {
            return false;
        }
        return this.f28709a.equals(((nwf) obj).f28709a);
    }

    public int hashCode() {
        return this.f28709a.hashCode();
    }

    public Iterator<Entry<FieldDescriptorType, Object>> m33416d() {
        if (this.f28711c) {
            return new nxg(this.f28709a.entrySet().iterator());
        }
        return this.f28709a.entrySet().iterator();
    }

    public Object m33409a(FieldDescriptorType fieldDescriptorType) {
        Object obj = this.f28709a.get(fieldDescriptorType);
        if (obj instanceof nxe) {
            return ((nxe) obj).a();
        }
        return obj;
    }

    public void m33412a(FieldDescriptorType fieldDescriptorType, Object obj) {
        Object obj2;
        if (!fieldDescriptorType.m33424d()) {
            nwf.m33404a(fieldDescriptorType.m33422b(), obj);
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
                nwf.m33404a(fieldDescriptorType.m33422b(), obj3);
            }
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj2 instanceof nxe) {
            this.f28711c = true;
        }
        this.f28709a.a(fieldDescriptorType, obj2);
    }

    public void m33413b(FieldDescriptorType fieldDescriptorType, Object obj) {
        if (fieldDescriptorType.m33424d()) {
            List arrayList;
            nwf.m33404a(fieldDescriptorType.m33422b(), obj);
            Object a = m33409a((nwh) fieldDescriptorType);
            if (a == null) {
                arrayList = new ArrayList();
                this.f28709a.a(fieldDescriptorType, arrayList);
            } else {
                arrayList = (List) a;
            }
            arrayList.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    private static void m33404a(nyi nyi, Object obj) {
        boolean z = false;
        if (obj == null) {
            throw new NullPointerException();
        }
        switch (nwg.a[nyi.a().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                break;
            case 2:
                z = obj instanceof Long;
                break;
            case 3:
                z = obj instanceof Float;
                break;
            case 4:
                z = obj instanceof Double;
                break;
            case 5:
                z = obj instanceof Boolean;
                break;
            case 6:
                z = obj instanceof String;
                break;
            case 7:
                if ((obj instanceof nvn) || (obj instanceof byte[])) {
                    z = true;
                    break;
                }
            case 8:
                if ((obj instanceof Integer) || (obj instanceof nww)) {
                    z = true;
                    break;
                }
            case 9:
                if ((obj instanceof nxi) || (obj instanceof nxe)) {
                    z = true;
                    break;
                }
        }
        if (!z) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public boolean m33417e() {
        for (int i = 0; i < this.f28709a.c(); i++) {
            if (!nwf.m33405a(this.f28709a.b(i))) {
                return false;
            }
        }
        for (Entry a : this.f28709a.e()) {
            if (!nwf.m33405a(a)) {
                return false;
            }
        }
        return true;
    }

    private static boolean m33405a(Entry<FieldDescriptorType, Object> entry) {
        nwh nwh = (nwh) entry.getKey();
        if (nwh.m33423c() == nyn.i) {
            if (nwh.m33424d()) {
                for (nxi e : (List) entry.getValue()) {
                    if (!e.mo3949e()) {
                        return false;
                    }
                }
            }
            Object value = entry.getValue();
            if (value instanceof nxi) {
                if (!((nxi) value).mo3949e()) {
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

    static int m33398a(nyi nyi, boolean z) {
        if (z) {
            return 2;
        }
        return nyi.b();
    }

    public void m33411a(nwf<FieldDescriptorType> nwf_FieldDescriptorType) {
        for (int i = 0; i < nwf_FieldDescriptorType.f28709a.c(); i++) {
            m33407b(nwf_FieldDescriptorType.f28709a.b(i));
        }
        for (Entry b : nwf_FieldDescriptorType.f28709a.e()) {
            m33407b(b);
        }
    }

    private static Object m33399a(Object obj) {
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

    private void m33407b(Entry<FieldDescriptorType, Object> entry) {
        nwh nwh = (nwh) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof nxe) {
            value = ((nxe) value).a();
        }
        Object a;
        if (nwh.m33424d()) {
            a = m33409a(nwh);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(nwf.m33399a(a2));
            }
            this.f28709a.a(nwh, a);
        } else if (nwh.m33423c() == nyn.i) {
            a = m33409a(nwh);
            if (a == null) {
                this.f28709a.a(nwh, nwf.m33399a(value));
                return;
            }
            if (a instanceof nxl) {
                value = nwh.m33426f();
            } else {
                value = nwh.m33421a(((nxi) a).mo3950f(), (nxi) value).i();
            }
            this.f28709a.a(nwh, value);
        } else {
            this.f28709a.a(nwh, nwf.m33399a(value));
        }
    }

    public static Object m33400a(nvw nvw, nyi nyi, boolean z) {
        nyo nyo = nyo.a;
        switch (nyh.a[nyi.ordinal()]) {
            case 1:
                return Double.valueOf(nvw.b());
            case 2:
                return Float.valueOf(nvw.c());
            case 3:
                return Long.valueOf(nvw.e());
            case 4:
                return Long.valueOf(nvw.d());
            case 5:
                return Integer.valueOf(nvw.f());
            case 6:
                return Long.valueOf(nvw.g());
            case 7:
                return Integer.valueOf(nvw.h());
            case 8:
                return Boolean.valueOf(nvw.i());
            case 9:
                return nvw.l();
            case 10:
                return Integer.valueOf(nvw.m());
            case 11:
                return Integer.valueOf(nvw.o());
            case 12:
                return Long.valueOf(nvw.p());
            case 13:
                return Integer.valueOf(nvw.q());
            case 14:
                return Long.valueOf(nvw.r());
            case 15:
                return nyo.a(nvw);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case wi.dK /*17*/:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case wi.dH /*18*/:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static void m33401a(nvy nvy, nyi nyi, int i, Object obj) {
        if (nyi != nyi.j) {
            nvy.a(i, nwf.m33398a(nyi, false));
            nwf.m33402a(nvy, nyi, obj);
        } else if (nwv.a((nxi) obj)) {
            nvy.a(i, 3);
            ((nxi) obj).m33376a(nvy);
        } else {
            nvy.e(i, (nxi) obj);
        }
    }

    private static void m33402a(nvy nvy, nyi nyi, Object obj) {
        int i = 0;
        switch (nwg.b[nyi.ordinal()]) {
            case 1:
                nvy.b(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 2:
                nvy.c(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 3:
                nvy.a(((Long) obj).longValue());
                return;
            case 4:
                nvy.a(((Long) obj).longValue());
                return;
            case 5:
                nvy.a(((Integer) obj).intValue());
                return;
            case 6:
                nvy.b(((Long) obj).longValue());
                return;
            case 7:
                nvy.c(((Integer) obj).intValue());
                return;
            case 8:
                if (((Boolean) obj).booleanValue()) {
                    i = 1;
                }
                nvy.a((byte) i);
                return;
            case 9:
                ((nxi) obj).m33376a(nvy);
                return;
            case 10:
                nvy.a((nxi) obj);
                return;
            case 11:
                if (obj instanceof nvn) {
                    nvy.a((nvn) obj);
                    return;
                } else {
                    nvy.a((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof nvn) {
                    nvy.a((nvn) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                nvy.b(bArr, 0, bArr.length);
                return;
            case 13:
                nvy.b(((Integer) obj).intValue());
                return;
            case 14:
                nvy.c(((Integer) obj).intValue());
                return;
            case 15:
                nvy.b(((Long) obj).longValue());
                return;
            case 16:
                nvy.b(nvy.i(((Integer) obj).intValue()));
                return;
            case wi.dK /*17*/:
                nvy.a(nvy.f(((Long) obj).longValue()));
                return;
            case wi.dH /*18*/:
                if (obj instanceof nww) {
                    nvy.a(((nww) obj).a());
                    return;
                } else {
                    nvy.a(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public static void m33403a(nwh<?> nwh_, Object obj, nvy nvy) {
        nyi b = nwh_.m33422b();
        int a = nwh_.m33419a();
        if (nwh_.m33424d()) {
            List<Object> list = (List) obj;
            if (nwh_.m33425e()) {
                nvy.a(a, 2);
                a = 0;
                for (Object b2 : list) {
                    a += nwf.m33406b(b, b2);
                }
                nvy.b(a);
                for (Object a2 : list) {
                    nwf.m33402a(nvy, b, a2);
                }
                return;
            }
            for (Object b22 : list) {
                nwf.m33401a(nvy, b, a, b22);
            }
        } else if (obj instanceof nxe) {
            nwf.m33401a(nvy, b, a, ((nxe) obj).a());
        } else {
            nwf.m33401a(nvy, b, a, obj);
        }
    }

    public int m33418f() {
        int i = 0;
        int i2 = 0;
        while (i < this.f28709a.c()) {
            i2 += nwf.m33408c(this.f28709a.b(i));
            i++;
        }
        for (Entry c : this.f28709a.e()) {
            i2 += nwf.m33408c(c);
        }
        return i2;
    }

    private static int m33408c(Entry<FieldDescriptorType, Object> entry) {
        int i = 0;
        nwh nwh = (nwh) entry.getKey();
        Object value = entry.getValue();
        if (nwh.m33423c() != nyn.i || nwh.m33424d() || nwh.m33425e()) {
            nyi b = nwh.m33422b();
            int a = nwh.m33419a();
            if (!nwh.m33424d()) {
                return nwf.m33397a(b, a, value);
            }
            if (nwh.m33425e()) {
                int i2 = 0;
                for (Object b2 : (List) value) {
                    i2 += nwf.m33406b(b, b2);
                }
                return (nvy.d(a) + i2) + nvy.j(i2);
            }
            for (Object value2 : (List) value2) {
                i += nwf.m33397a(b, a, value2);
            }
            return i;
        } else if (value2 instanceof nxe) {
            return nvy.a(((nwh) entry.getKey()).m33419a(), (nxe) value2);
        } else {
            return nvy.d(((nwh) entry.getKey()).m33419a(), (nxi) value2);
        }
    }

    private static int m33397a(nyi nyi, int i, Object obj) {
        int i2;
        int d = nvy.d(i);
        if (nyi != nyi.j || nwv.a((nxi) obj)) {
            i2 = d;
        } else {
            i2 = d << 1;
        }
        return i2 + nwf.m33406b(nyi, obj);
    }

    private static int m33406b(nyi nyi, Object obj) {
        switch (nwg.b[nyi.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                return nvy.f();
            case 2:
                ((Float) obj).floatValue();
                return nvy.e();
            case 3:
                return nvy.c(((Long) obj).longValue());
            case 4:
                return nvy.d(((Long) obj).longValue());
            case 5:
                return nvy.e(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                return nvy.c();
            case 7:
                ((Integer) obj).intValue();
                return nvy.a();
            case 8:
                ((Boolean) obj).booleanValue();
                return nvy.g();
            case 9:
                return nvy.c((nxi) obj);
            case 10:
                if (obj instanceof nxe) {
                    return nvy.a((nxe) obj);
                }
                return nvy.b((nxi) obj);
            case 11:
                if (obj instanceof nvn) {
                    return nvy.b((nvn) obj);
                }
                return nvy.b((String) obj);
            case 12:
                if (obj instanceof nvn) {
                    return nvy.b((nvn) obj);
                }
                return nvy.b((byte[]) obj);
            case 13:
                return nvy.f(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return nvy.b();
            case 15:
                ((Long) obj).longValue();
                return nvy.d();
            case 16:
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

    public nwf<FieldDescriptorType> m33415c() {
        nwf<FieldDescriptorType> nwf = new nwf();
        for (int i = 0; i < this.f28709a.c(); i++) {
            Entry b = this.f28709a.b(i);
            nwf.m33412a((nwh) b.getKey(), b.getValue());
        }
        for (Entry entry : this.f28709a.e()) {
            nwf.m33412a((nwh) entry.getKey(), entry.getValue());
        }
        nwf.f28711c = this.f28711c;
        return nwf;
    }
}
