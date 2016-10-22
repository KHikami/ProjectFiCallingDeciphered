package defpackage;

import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: ddy */
final class ddy extends dec {
    private int[] c;
    private String[] d;

    public final int a(int i) {
        return this.c[i];
    }

    public final String b(int i) {
        return this.d[i];
    }

    public final void a(ObjectInput objectInput) {
        int i;
        int i2 = 0;
        this.a = objectInput.readInt();
        if (this.c == null || this.c.length < this.a) {
            this.c = new int[this.a];
        }
        if (this.d == null || this.d.length < this.a) {
            this.d = new String[this.a];
        }
        for (i = 0; i < this.a; i++) {
            this.c[i] = objectInput.readInt();
            this.d[i] = objectInput.readUTF();
        }
        i = objectInput.readInt();
        this.b.clear();
        while (i2 < i) {
            this.b.add(Integer.valueOf(objectInput.readInt()));
            i2++;
        }
    }

    public final void a(ObjectOutput objectOutput) {
        objectOutput.writeInt(this.a);
        for (int i = 0; i < this.a; i++) {
            objectOutput.writeInt(this.c[i]);
            objectOutput.writeUTF(this.d[i]);
        }
        objectOutput.writeInt(this.b.size());
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            objectOutput.writeInt(((Integer) it.next()).intValue());
        }
    }
}
