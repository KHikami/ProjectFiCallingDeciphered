/* compiled from: PG */
final class dke {
    final dke[] a;
    final int b;
    final int c;

    dke() {
        this.a = new dke[256];
        this.b = 0;
        this.c = 0;
    }

    dke(int i, int i2) {
        this.a = null;
        this.b = i;
        int i3 = i2 & 7;
        if (i3 == 0) {
            i3 = 8;
        }
        this.c = i3;
    }
}
