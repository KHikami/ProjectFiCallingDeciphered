package defpackage;

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
            case 2:
                this.b = "V";
                return;
            case 3:
                this.b = "D";
                return;
            case 4:
                this.b = "I";
                return;
            case 5:
                this.b = "W";
                return;
            case 6:
                this.b = "E";
                return;
            case 7:
                this.b = "A";
                return;
            default:
                this.b = "?";
                return;
        }
    }
}
