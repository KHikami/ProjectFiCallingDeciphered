package defpackage;

/* compiled from: PG */
/* renamed from: afy */
public final class afy {
    public boolean a;
    public boolean b;
    public boolean c;
    private String d;
    private int e;
    private int f;

    private afy(String str, int i) {
        this.d = str;
        this.e = i;
    }

    public afy(String str, int i, int i2) {
        this(str, i);
        this.f = i2;
    }

    public final String toString() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        String str = this.d;
        int i = this.e;
        int i2 = this.f;
        boolean z = this.a;
        boolean z2 = this.b;
        return new StringBuilder((String.valueOf(valueOf).length() + 119) + String.valueOf(str).length()).append(valueOf).append(": column=").append(str).append(" titleRes=").append(i).append(" inputType=").append(i2).append(" minLines=0").append(" optional=").append(z).append(" shortForm=").append(z2).append(" longForm=").append(this.c).toString();
    }
}
