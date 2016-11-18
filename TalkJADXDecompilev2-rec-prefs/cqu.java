package p000;

public final class cqu implements Comparable<cqu> {
    private final int f8865a;
    private final String f8866b;
    private final int f8867c;
    private final String f8868d;
    private final String f8869e;
    private final String f8870f;
    private final int f8871g;
    private final long f8872h;
    private final long f8873i;
    private final long f8874j;
    private final String f8875k;
    private final String f8876l;
    private final int f8877m;
    private float f8878n;
    private int f8879o;

    public /* synthetic */ int compareTo(Object obj) {
        return m10720a((cqu) obj);
    }

    cqu(int i, String str, int i2, String str2, String str3, String str4, int i3, long j, long j2, long j3, String str5, String str6, int i4, float f, int i5) {
        this.f8865a = i;
        this.f8866b = str;
        this.f8867c = i2;
        this.f8868d = str2;
        this.f8869e = str3;
        this.f8870f = str4;
        this.f8871g = i3;
        this.f8872h = j;
        this.f8873i = j2;
        this.f8874j = j3;
        this.f8875k = str5;
        this.f8876l = str6;
        this.f8877m = i4;
        this.f8878n = f;
        this.f8879o = i5;
    }

    public int m10721a() {
        return this.f8871g;
    }

    public long m10724b() {
        return this.f8872h;
    }

    public void m10722a(float f) {
        this.f8878n = f;
    }

    public void m10723a(int i) {
        this.f8879o = i;
    }

    public Object[] m10725c() {
        return new Object[]{Integer.valueOf(this.f8865a), this.f8866b, Integer.valueOf(this.f8867c), this.f8868d, this.f8869e, this.f8870f, Integer.valueOf(this.f8871g), Long.valueOf(this.f8872h), Long.valueOf(this.f8873i), Long.valueOf(this.f8874j), this.f8875k, this.f8876l, Integer.valueOf(this.f8877m), Float.valueOf(this.f8878n), Integer.valueOf(this.f8879o)};
    }

    private int m10720a(cqu cqu) {
        return mix.f27804a.mo3801a(cqu.f8878n, this.f8878n).mo3802a(cqu.f8873i, this.f8873i).mo3800a();
    }
}
