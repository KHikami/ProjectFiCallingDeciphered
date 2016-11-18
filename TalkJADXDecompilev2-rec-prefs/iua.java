package p000;

final class iua {
    int f19025a;
    String f19026b;
    long f19027c;
    String f19028d;
    String f19029e;

    iua() {
    }

    void m23295a(int i, int i2, long j, String str, String str2) {
        this.f19025a = i;
        this.f19027c = j;
        this.f19028d = str;
        this.f19029e = str2;
        switch (i2) {
            case 2:
                this.f19026b = "V";
                return;
            case 3:
                this.f19026b = "D";
                return;
            case 4:
                this.f19026b = "I";
                return;
            case 5:
                this.f19026b = "W";
                return;
            case 6:
                this.f19026b = "E";
                return;
            case 7:
                this.f19026b = "A";
                return;
            default:
                this.f19026b = "?";
                return;
        }
    }
}
