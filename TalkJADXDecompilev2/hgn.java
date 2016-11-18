package defpackage;

final class hgn implements Runnable {
    final /* synthetic */ gup a;
    final /* synthetic */ hgm b;

    hgn(hgm hgm, gup gup) {
        this.b = hgm;
        this.a = gup;
    }

    public void run() {
        hgm hgm;
        gui gui;
        try {
            heg.g.set(Boolean.valueOf(true));
            this.b.e.sendMessage(this.b.e.obtainMessage(0, this.b.a.h()));
            heg.g.set(Boolean.valueOf(false));
            hgm = this.b;
            hgm.b(this.a);
            gui = (gui) this.b.d.get();
            if (gui != null) {
                gui.b(this.b);
            }
        } catch (RuntimeException e) {
            this.b.e.sendMessage(this.b.e.obtainMessage(1, e));
            heg.g.set(Boolean.valueOf(false));
            hgm = this.b;
            hgm.b(this.a);
            gui = (gui) this.b.d.get();
            if (gui != null) {
                gui.b(this.b);
            }
        } catch (Throwable th) {
            Throwable th2 = th;
            heg.g.set(Boolean.valueOf(false));
            hgm = this.b;
            hgm.b(this.a);
            gui = (gui) this.b.d.get();
            if (gui != null) {
                gui.b(this.b);
            }
        }
    }
}
