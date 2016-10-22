package defpackage;

/* compiled from: PG */
/* renamed from: aiv */
public final class aiv {
    public int a;
    public String b;

    public aiv() {
        this.a = -1;
    }

    public final String toString() {
        String str = this.b;
        return new StringBuilder(String.valueOf(str).length() + 44).append("MatchedLine{line='").append(str).append("', startIndex=").append(this.a).append("}").toString();
    }
}
