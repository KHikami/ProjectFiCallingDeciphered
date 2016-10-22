import java.util.Map.Entry;

/* compiled from: PG */
public class daa {
    dac[] a;
    int b;
    boolean c;

    public daa() {
        this(4);
    }

    daa(int i) {
        this.a = new dac[i];
        this.b = 0;
        this.c = false;
    }

    public daa a(Object obj, Object obj2) {
        int i = this.b + 1;
        if (i > this.a.length) {
            this.a = (dac[]) daz.a(this.a, czr.a(this.a.length, i));
            this.c = false;
        }
        dac dac = new dac(obj, obj2);
        dac[] dacArr = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        dacArr[i2] = dac;
        return this;
    }

    public czy a() {
        switch (this.b) {
            case rl.c /*0*/:
                return dbb.b;
            case rq.b /*1*/:
                return czm.a(this.a[0].getKey(), this.a[0].getValue());
            default:
                Entry[] entryArr;
                this.c = this.b == this.a.length;
                int i = this.b;
                dac[] dacArr = this.a;
                cob.c(i, dacArr.length);
                if (i == dacArr.length) {
                    entryArr = dacArr;
                } else {
                    Object[] objArr = new dac[i];
                }
                int a = buf.a(i, 1.2d);
                dac[] dacArr2 = new dac[a];
                int i2 = a - 1;
                for (int i3 = 0; i3 < i; i3++) {
                    Entry entry = dacArr[i3];
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    buf.f(key, value);
                    int C = buf.C(key.hashCode()) & i2;
                    dac dac = dacArr2[C];
                    if (dac == null) {
                        a = ((entry instanceof dac) && ((dac) entry).c()) ? 1 : 0;
                        entry = a != 0 ? (dac) entry : new dac(key, value);
                    } else {
                        entry = new dae(key, value, dac);
                    }
                    dacArr2[C] = entry;
                    entryArr[i3] = entry;
                    dbh.a(key, entry, dac);
                }
                return new dbh(entryArr, dacArr2, i2);
        }
    }
}
