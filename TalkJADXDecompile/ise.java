final class ise implements Runnable {
    final /* synthetic */ iry a;

    ise(iry iry) {
        this.a = iry;
    }

    public void run() {
        if (this.a.t.isEmpty()) {
            itx.a(6, "vclib", "A camera error occurred while no callback was registered");
            return;
        }
        for (isa a : this.a.t) {
            a.a();
        }
    }
}
