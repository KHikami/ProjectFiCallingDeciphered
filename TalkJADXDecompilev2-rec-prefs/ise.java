package p000;

final class ise implements Runnable {
    final /* synthetic */ iry f18849a;

    ise(iry iry) {
        this.f18849a = iry;
    }

    public void run() {
        if (this.f18849a.f18801t.isEmpty()) {
            itx.m23277a(6, "vclib", "A camera error occurred while no callback was registered");
            return;
        }
        for (isa a : this.f18849a.f18801t) {
            a.mo1593a();
        }
    }
}
