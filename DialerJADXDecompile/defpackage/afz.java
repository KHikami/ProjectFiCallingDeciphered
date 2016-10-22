package defpackage;

/* compiled from: PG */
/* renamed from: afz */
public class afz {
    public int a;
    public boolean b;
    public int c;
    public String d;
    private int e;

    public afz(int i, int i2) {
        this.a = i;
        this.e = i2;
        this.c = -1;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof afz) && ((afz) obj).a == this.a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        int i = this.a;
        int i2 = this.e;
        boolean z = this.b;
        int i3 = this.c;
        String str = this.d;
        return new StringBuilder((String.valueOf(valueOf).length() + 96) + String.valueOf(str).length()).append(valueOf).append(" rawValue=").append(i).append(" labelRes=").append(i2).append(" secondary=").append(z).append(" specificMax=").append(i3).append(" customColumn=").append(str).toString();
    }
}
