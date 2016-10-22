final class gkj implements Runnable {
    final /* synthetic */ gki a;

    gkj(gki gki) {
        this.a = gki;
    }

    public void run() {
        if (this.a.h != null) {
            this.a.h.abandonAudioFocus(null);
            this.a.h = null;
        }
    }
}
