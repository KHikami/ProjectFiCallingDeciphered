package defpackage;

final class ovq implements ovn {
    final /* synthetic */ boolean a;
    final /* synthetic */ ovo b;

    ovq(ovo ovo, boolean z) {
        this.b = ovo;
        this.a = z;
    }

    public void a() {
        this.b.g.flip();
        if (this.b.h == -1 || this.b.h - this.b.i >= ((long) this.b.g.remaining())) {
            while (this.b.g.hasRemaining()) {
                ovo ovo = this.b;
                ovo.i += (long) this.b.e.write(this.b.g);
            }
            if (this.b.i < this.b.h || (this.b.h == -1 && !this.a)) {
                this.b.g.clear();
                this.b.a.set(ovv.AWAITING_READ_RESULT);
                this.b.b.execute(this.b.j.a(new ovr(this)));
                return;
            } else if (this.b.h == -1) {
                this.b.c();
                return;
            } else if (this.b.h == this.b.i) {
                this.b.c();
                return;
            } else {
                this.b.j.a(new IllegalArgumentException(String.format("Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(this.b.i), Long.valueOf(this.b.h)})));
                return;
            }
        }
        this.b.j.a(new IllegalArgumentException(String.format("Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(this.b.i + ((long) this.b.g.remaining())), Long.valueOf(this.b.h)})));
    }
}
