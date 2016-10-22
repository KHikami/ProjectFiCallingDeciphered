package defpackage;

/* compiled from: PG */
/* renamed from: deh */
public abstract class deh extends dem {
    public dej n;

    public final /* synthetic */ dem b() {
        return d();
    }

    public /* synthetic */ Object clone() {
        return d();
    }

    public int a() {
        int i = 0;
        if (this.n == null) {
            return 0;
        }
        int i2 = 0;
        while (i < this.n.d) {
            i2 += this.n.c[i].a();
            i++;
        }
        return i2;
    }

    public void a(def def) {
        if (this.n != null) {
            for (int i = 0; i < this.n.d; i++) {
                this.n.c[i].a(def);
            }
        }
    }

    public final boolean a(dee dee, int i) {
        int j = dee.j();
        if (!dee.a(i)) {
            return false;
        }
        byte[] bArr;
        dek dek;
        int i2 = i >>> 3;
        int j2 = dee.j() - j;
        if (j2 == 0) {
            bArr = dep.c;
        } else {
            bArr = new byte[j2];
            System.arraycopy(dee.a, j + dee.b, bArr, 0, j2);
        }
        deo deo = new deo(i, bArr);
        if (this.n == null) {
            this.n = new dej();
            dek = null;
        } else {
            dej dej = this.n;
            j2 = dej.b(i2);
            if (j2 < 0 || dej.c[j2] == dej.a) {
                dek = null;
            } else {
                dek = dej.c[j2];
            }
        }
        if (dek == null) {
            dek = new dek();
            dej dej2 = this.n;
            j2 = dej2.b(i2);
            if (j2 >= 0) {
                dej2.c[j2] = dek;
            } else {
                j2 ^= -1;
                if (j2 >= dej2.d || dej2.c[j2] != dej.a) {
                    if (dej2.d >= dej2.b.length) {
                        int a = dej2.a(dej2.d + 1);
                        Object obj = new int[a];
                        Object obj2 = new dek[a];
                        System.arraycopy(dej2.b, 0, obj, 0, dej2.b.length);
                        System.arraycopy(dej2.c, 0, obj2, 0, dej2.c.length);
                        dej2.b = obj;
                        dej2.c = obj2;
                    }
                    if (dej2.d - j2 != 0) {
                        System.arraycopy(dej2.b, j2, dej2.b, j2 + 1, dej2.d - j2);
                        System.arraycopy(dej2.c, j2, dej2.c, j2 + 1, dej2.d - j2);
                    }
                    dej2.b[j2] = i2;
                    dej2.c[j2] = dek;
                    dej2.d++;
                } else {
                    dej2.b[j2] = i2;
                    dej2.c[j2] = dek;
                }
            }
        }
        dek.a.add(deo);
        return true;
    }

    private deh d() {
        deh deh = (deh) super.b();
        del.a(this, deh);
        return deh;
    }
}
