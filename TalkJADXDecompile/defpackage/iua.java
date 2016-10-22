package defpackage;

/* renamed from: iua */
final class iua {
    int a;
    String b;
    long c;
    String d;
    String e;

    iua() {
    }

    void a(int i, int i2, long j, String str, String str2) {
        this.a = i;
        this.c = j;
        this.d = str;
        this.e = str2;
        switch (i2) {
            case wi.l /*2*/:
                this.b = "V";
            case wi.z /*3*/:
                this.b = "D";
            case wi.h /*4*/:
                this.b = "I";
            case wi.p /*5*/:
                this.b = "W";
            case wi.s /*6*/:
                this.b = "E";
            case wi.q /*7*/:
                this.b = "A";
            default:
                this.b = "?";
        }
    }
}
