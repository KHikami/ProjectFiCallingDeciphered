final class hdg implements Runnable {
    final /* synthetic */ gui a;
    final /* synthetic */ heb b;
    final /* synthetic */ hdc c;

    hdg(hdc hdc, gui gui, heb heb) {
        this.c = hdc;
        this.a = gui;
        this.b = heb;
    }

    public void run() {
        this.a.a(this.b);
    }
}
