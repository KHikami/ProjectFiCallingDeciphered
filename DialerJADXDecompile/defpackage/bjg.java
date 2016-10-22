package defpackage;

/* compiled from: PG */
/* renamed from: bjg */
public final class bjg implements awq {
    public final aws a;
    public String b;
    public int c;
    public long d;
    public String e;

    public bjg(aws aws) {
        if (aws == null) {
            aws = aws.a;
        }
        this.a = aws;
    }

    public static boolean a(int i) {
        return i == 3 || i == 4;
    }

    public static boolean b(int i) {
        return i == 3 || i == 2;
    }

    public final aws a() {
        return this.a;
    }

    public final void a(String str, long j) {
        a(1, str, j);
    }

    public final void b(String str, long j) {
        a(2, str, j);
    }

    public final void a(int i, String str, long j) {
        this.c = i;
        this.b = str;
        this.d = j;
        this.a.p = i;
    }

    public final void a(String str) {
        this.e = str;
    }
}
