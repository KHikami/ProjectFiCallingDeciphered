package p000;

final class ovq implements ovn {
    final /* synthetic */ boolean f34391a;
    final /* synthetic */ ovo f34392b;

    ovq(ovo ovo, boolean z) {
        this.f34392b = ovo;
        this.f34391a = z;
    }

    public void mo4235a() {
        this.f34392b.f34384g.flip();
        if (this.f34392b.f34385h == -1 || this.f34392b.f34385h - this.f34392b.f34386i >= ((long) this.f34392b.f34384g.remaining())) {
            while (this.f34392b.f34384g.hasRemaining()) {
                ovo ovo = this.f34392b;
                ovo.f34386i += (long) this.f34392b.f34382e.write(this.f34392b.f34384g);
            }
            if (this.f34392b.f34386i < this.f34392b.f34385h || (this.f34392b.f34385h == -1 && !this.f34391a)) {
                this.f34392b.f34384g.clear();
                this.f34392b.f34378a.set(ovv.AWAITING_READ_RESULT);
                this.f34392b.f34379b.execute(this.f34392b.f34387j.m39740a(new ovr(this)));
                return;
            } else if (this.f34392b.f34385h == -1) {
                this.f34392b.m39774c();
                return;
            } else if (this.f34392b.f34385h == this.f34392b.f34386i) {
                this.f34392b.m39774c();
                return;
            } else {
                this.f34392b.f34387j.m39745a(new IllegalArgumentException(String.format("Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(this.f34392b.f34386i), Long.valueOf(this.f34392b.f34385h)})));
                return;
            }
        }
        this.f34392b.f34387j.m39745a(new IllegalArgumentException(String.format("Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(this.f34392b.f34386i + ((long) this.f34392b.f34384g.remaining())), Long.valueOf(this.f34392b.f34385h)})));
    }
}
