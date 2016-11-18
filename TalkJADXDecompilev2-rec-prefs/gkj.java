package p000;

final class gkj implements Runnable {
    final /* synthetic */ gki f15499a;

    gkj(gki gki) {
        this.f15499a = gki;
    }

    public void run() {
        if (this.f15499a.f15495h != null) {
            this.f15499a.f15495h.abandonAudioFocus(null);
            this.f15499a.f15495h = null;
        }
    }
}
