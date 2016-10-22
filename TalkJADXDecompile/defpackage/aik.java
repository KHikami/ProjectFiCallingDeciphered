package defpackage;

/* renamed from: aik */
final class aik {
    int a;
    int b;
    final /* synthetic */ aih c;

    aik(aih aih) {
        this.c = aih;
    }

    int a() {
        if (this.b == this.c.c.a) {
            return this.c.b - this.a;
        }
        throw new RuntimeException("BUG: Invalid call to getLength()");
    }
}
