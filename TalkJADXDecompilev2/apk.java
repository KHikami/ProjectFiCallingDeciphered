package defpackage;

class apk {
    final aru a;
    volatile art b;

    public art a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = this.a.a();
                }
                if (this.b == null) {
                    this.b = new arw();
                }
            }
        }
        return this.b;
    }

    public apk(aru aru) {
        this.a = aru;
    }
}