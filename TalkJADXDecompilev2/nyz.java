package defpackage;

import java.lang.reflect.Array;
import java.util.List;

final class nyz<M extends nyx<M>, T> extends nyy<M, T> {
    private final int e = 0;
    private final int f = 0;

    protected Object a(nyt nyt) {
        try {
            switch (this.a) {
                case 1:
                    return Double.valueOf(nyt.b());
                case 2:
                    return Float.valueOf(nyt.c());
                case 3:
                    return Long.valueOf(nyt.e());
                case 4:
                    return Long.valueOf(nyt.d());
                case 5:
                    return Integer.valueOf(nyt.f());
                case 6:
                    return Long.valueOf(nyt.g());
                case 7:
                    return Integer.valueOf(nyt.h());
                case 8:
                    return Boolean.valueOf(nyt.i());
                case 9:
                    return nyt.j();
                case 12:
                    return nyt.k();
                case 13:
                    return Integer.valueOf(nyt.l());
                case 14:
                    return Integer.valueOf(nyt.m());
                case 15:
                    return Integer.valueOf(nyt.n());
                case 16:
                    return Long.valueOf(nyt.o());
                case wi.dK /*17*/:
                    return Integer.valueOf(nyt.p());
                case wi.dH /*18*/:
                    return Long.valueOf(nyt.q());
                default:
                    throw new IllegalArgumentException("Unknown type " + this.a);
            }
        } catch (Throwable e) {
            throw new IllegalArgumentException("Error reading extension field", e);
        }
        throw new IllegalArgumentException("Error reading extension field", e);
    }

    protected void a(nzj nzj, List<Object> list) {
        if (nzj.a == this.e) {
            byte[] bArr = nzj.b;
            list.add(a(nyt.a(bArr, 0, bArr.length)));
            return;
        }
        bArr = nzj.b;
        nyt a = nyt.a(bArr, 0, bArr.length);
        try {
            a.d(a.r());
            while (!a.t()) {
                list.add(a(a));
            }
        } catch (Throwable e) {
            throw new IllegalArgumentException("Error reading extension field", e);
        }
    }

    protected final void b(Object obj, nyu nyu) {
        try {
            nyu.i(this.c);
            switch (this.a) {
                case 1:
                    nyu.a(((Double) obj).doubleValue());
                    return;
                case 2:
                    nyu.a(((Float) obj).floatValue());
                    return;
                case 3:
                    nyu.b(((Long) obj).longValue());
                    return;
                case 4:
                    nyu.a(((Long) obj).longValue());
                    return;
                case 5:
                    nyu.a(((Integer) obj).intValue());
                    return;
                case 6:
                    nyu.c(((Long) obj).longValue());
                    return;
                case 7:
                    nyu.b(((Integer) obj).intValue());
                    return;
                case 8:
                    nyu.a(((Boolean) obj).booleanValue());
                    return;
                case 9:
                    nyu.a((String) obj);
                    return;
                case 12:
                    nyu.a((byte[]) obj);
                    return;
                case 13:
                    nyu.c(((Integer) obj).intValue());
                    return;
                case 14:
                    nyu.d(((Integer) obj).intValue());
                    return;
                case 15:
                    nyu.e(((Integer) obj).intValue());
                    return;
                case 16:
                    nyu.d(((Long) obj).longValue());
                    return;
                case wi.dK /*17*/:
                    nyu.f(((Integer) obj).intValue());
                    return;
                case wi.dH /*18*/:
                    nyu.e(((Long) obj).longValue());
                    return;
                default:
                    throw new IllegalArgumentException("Unknown type " + this.a);
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
        throw new IllegalStateException(e);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void c(java.lang.Object r7, defpackage.nyu r8) {
        /*
        r6 = this;
        r0 = 0;
        r1 = r6.c;
        r2 = r6.e;
        if (r1 != r2) goto L_0x000b;
    L_0x0007:
        super.c(r7, r8);
    L_0x000a:
        return;
    L_0x000b:
        r1 = r6.c;
        r2 = r6.f;
        if (r1 != r2) goto L_0x00f2;
    L_0x0011:
        r1 = java.lang.reflect.Array.getLength(r7);
        r2 = r6.d(r7);
        r3 = r6.c;	 Catch:{ IOException -> 0x0043 }
        r8.i(r3);	 Catch:{ IOException -> 0x0043 }
        r8.i(r2);	 Catch:{ IOException -> 0x0043 }
        r2 = r6.a;	 Catch:{ IOException -> 0x0043 }
        switch(r2) {
            case 1: goto L_0x0092;
            case 2: goto L_0x006e;
            case 3: goto L_0x00c2;
            case 4: goto L_0x00da;
            case 5: goto L_0x009e;
            case 6: goto L_0x007a;
            case 7: goto L_0x0056;
            case 8: goto L_0x004a;
            case 9: goto L_0x0026;
            case 10: goto L_0x0026;
            case 11: goto L_0x0026;
            case 12: goto L_0x0026;
            case 13: goto L_0x00b6;
            case 14: goto L_0x00e6;
            case 15: goto L_0x0062;
            case 16: goto L_0x0086;
            case 17: goto L_0x00aa;
            case 18: goto L_0x00ce;
            default: goto L_0x0026;
        };	 Catch:{ IOException -> 0x0043 }
    L_0x0026:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x0043 }
        r1 = r6.a;	 Catch:{ IOException -> 0x0043 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0043 }
        r3 = 27;
        r2.<init>(r3);	 Catch:{ IOException -> 0x0043 }
        r3 = "Unpackable type ";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0043 }
        r1 = r2.append(r1);	 Catch:{ IOException -> 0x0043 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x0043 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x0043 }
        throw r0;	 Catch:{ IOException -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r1.<init>(r0);
        throw r1;
    L_0x004a:
        if (r0 >= r1) goto L_0x000a;
    L_0x004c:
        r2 = java.lang.reflect.Array.getBoolean(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.a(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x004a;
    L_0x0056:
        if (r0 >= r1) goto L_0x000a;
    L_0x0058:
        r2 = java.lang.reflect.Array.getInt(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.b(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x0056;
    L_0x0062:
        if (r0 >= r1) goto L_0x000a;
    L_0x0064:
        r2 = java.lang.reflect.Array.getInt(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.e(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x0062;
    L_0x006e:
        if (r0 >= r1) goto L_0x000a;
    L_0x0070:
        r2 = java.lang.reflect.Array.getFloat(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.a(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x006e;
    L_0x007a:
        if (r0 >= r1) goto L_0x000a;
    L_0x007c:
        r2 = java.lang.reflect.Array.getLong(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.c(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x007a;
    L_0x0086:
        if (r0 >= r1) goto L_0x000a;
    L_0x0088:
        r2 = java.lang.reflect.Array.getLong(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.d(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x0086;
    L_0x0092:
        if (r0 >= r1) goto L_0x000a;
    L_0x0094:
        r2 = java.lang.reflect.Array.getDouble(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.a(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x0092;
    L_0x009e:
        if (r0 >= r1) goto L_0x000a;
    L_0x00a0:
        r2 = java.lang.reflect.Array.getInt(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.a(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x009e;
    L_0x00aa:
        if (r0 >= r1) goto L_0x000a;
    L_0x00ac:
        r2 = java.lang.reflect.Array.getInt(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.f(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x00aa;
    L_0x00b6:
        if (r0 >= r1) goto L_0x000a;
    L_0x00b8:
        r2 = java.lang.reflect.Array.getInt(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.c(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x00b6;
    L_0x00c2:
        if (r0 >= r1) goto L_0x000a;
    L_0x00c4:
        r2 = java.lang.reflect.Array.getLong(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.b(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x00c2;
    L_0x00ce:
        if (r0 >= r1) goto L_0x000a;
    L_0x00d0:
        r2 = java.lang.reflect.Array.getLong(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.e(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x00ce;
    L_0x00da:
        if (r0 >= r1) goto L_0x000a;
    L_0x00dc:
        r2 = java.lang.reflect.Array.getLong(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.a(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x00da;
    L_0x00e6:
        if (r0 >= r1) goto L_0x000a;
    L_0x00e8:
        r2 = java.lang.reflect.Array.getInt(r7, r0);	 Catch:{ IOException -> 0x0043 }
        r8.d(r2);	 Catch:{ IOException -> 0x0043 }
        r0 = r0 + 1;
        goto L_0x00e6;
    L_0x00f2:
        r0 = new java.lang.IllegalArgumentException;
        r1 = r6.c;
        r2 = r6.e;
        r3 = r6.f;
        r4 = new java.lang.StringBuilder;
        r5 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r4.<init>(r5);
        r5 = "Unexpected repeated extension tag ";
        r4 = r4.append(r5);
        r1 = r4.append(r1);
        r4 = ", unequal to both non-packed variant ";
        r1 = r1.append(r4);
        r1 = r1.append(r2);
        r2 = " and packed variant ";
        r1 = r1.append(r2);
        r1 = r1.append(r3);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: nyz.c(java.lang.Object, nyu):void");
    }

    private int d(Object obj) {
        int i = 0;
        int length = Array.getLength(obj);
        int i2;
        int f;
        switch (this.a) {
            case 1:
            case 6:
            case 16:
                return length << 3;
            case 2:
            case 7:
            case 15:
                return length << 2;
            case 3:
                i2 = 0;
                while (i2 < length) {
                    f = nyu.f(Array.getLong(obj, i2)) + i;
                    i2++;
                    i = f;
                }
                return i;
            case 4:
                i2 = 0;
                while (i2 < length) {
                    f = nyu.f(Array.getLong(obj, i2)) + i;
                    i2++;
                    i = f;
                }
                return i;
            case 5:
                i2 = 0;
                while (i2 < length) {
                    f = nyu.g(Array.getInt(obj, i2)) + i;
                    i2++;
                    i = f;
                }
                return i;
            case 8:
                return length;
            case 13:
                i2 = 0;
                while (i2 < length) {
                    f = nyu.j(Array.getInt(obj, i2)) + i;
                    i2++;
                    i = f;
                }
                return i;
            case 14:
                i2 = 0;
                while (i2 < length) {
                    f = nyu.j(Array.getInt(obj, i2)) + i;
                    i2++;
                    i = f;
                }
                return i;
            case wi.dK /*17*/:
                i2 = 0;
                while (i2 < length) {
                    f = nyu.j(nyu.k(Array.getInt(obj, i2))) + i;
                    i2++;
                    i = f;
                }
                return i;
            case wi.dH /*18*/:
                i2 = 0;
                while (i2 < length) {
                    f = nyu.f(nyu.g(Array.getLong(obj, i2))) + i;
                    i2++;
                    i = f;
                }
                return i;
            default:
                throw new IllegalArgumentException("Unexpected non-packable type " + this.a);
        }
    }

    protected int b(Object obj) {
        if (this.c == this.e) {
            return super.b(obj);
        }
        if (this.c == this.f) {
            int d = d(obj);
            return (d + nyu.j(d)) + nyu.j(this.c);
        }
        int i = this.c;
        int i2 = this.e;
        throw new IllegalArgumentException("Unexpected repeated extension tag " + i + ", unequal to both non-packed variant " + i2 + " and packed variant " + this.f);
    }

    protected final int c(Object obj) {
        int i = this.c >>> 3;
        switch (this.a) {
            case 1:
                ((Double) obj).doubleValue();
                return nyu.h(i) + 8;
            case 2:
                ((Float) obj).floatValue();
                return nyu.h(i) + 4;
            case 3:
                return nyu.f(i, ((Long) obj).longValue());
            case 4:
                return nyu.e(i, ((Long) obj).longValue());
            case 5:
                return nyu.f(i, ((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                return nyu.h(i) + 8;
            case 7:
                ((Integer) obj).intValue();
                return nyu.h(i) + 4;
            case 8:
                ((Boolean) obj).booleanValue();
                return nyu.h(i) + 1;
            case 9:
                return nyu.b(i, (String) obj);
            case 12:
                return nyu.b(i, (byte[]) obj);
            case 13:
                return nyu.g(i, ((Integer) obj).intValue());
            case 14:
                return nyu.h(i) + nyu.j(((Integer) obj).intValue());
            case 15:
                ((Integer) obj).intValue();
                return nyu.h(i) + 4;
            case 16:
                ((Long) obj).longValue();
                return nyu.h(i) + 8;
            case wi.dK /*17*/:
                return nyu.h(i, ((Integer) obj).intValue());
            case wi.dH /*18*/:
                return nyu.g(i, ((Long) obj).longValue());
            default:
                throw new IllegalArgumentException("Unknown type " + this.a);
        }
    }

    public nyz(int i, Class<T> cls, int i2, boolean z, int i3, int i4) {
        super(i, cls, i2, false);
    }
}
