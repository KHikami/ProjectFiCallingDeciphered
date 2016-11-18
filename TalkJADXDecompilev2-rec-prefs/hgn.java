package p000;

final class hgn implements Runnable {
    final /* synthetic */ gup f16922a;
    final /* synthetic */ hgm f16923b;

    hgn(hgm hgm, gup gup) {
        this.f16923b = hgm;
        this.f16922a = gup;
    }

    public void run() {
        gui gui;
        hgm hgm;
        try {
            heg.f16385g.set(Boolean.valueOf(true));
            this.f16923b.f16917e.sendMessage(this.f16923b.f16917e.obtainMessage(0, this.f16923b.f16913a.h()));
            heg.f16385g.set(Boolean.valueOf(false));
            hgm = this.f16923b;
            hgm.m19747b(this.f16922a);
            gui = (gui) this.f16923b.f16916d.get();
            if (gui != null) {
                gui.mo2521b(this.f16923b);
            }
        } catch (RuntimeException e) {
            this.f16923b.f16917e.sendMessage(this.f16923b.f16917e.obtainMessage(1, e));
            heg.f16385g.set(Boolean.valueOf(false));
            hgm = this.f16923b;
            hgm.m19747b(this.f16922a);
            gui = (gui) this.f16923b.f16916d.get();
            if (gui != null) {
                gui.mo2521b(this.f16923b);
            }
        } catch (Throwable th) {
            Throwable th2 = th;
            heg.f16385g.set(Boolean.valueOf(false));
            hgm = this.f16923b;
            hgm.m19747b(this.f16922a);
            gui = (gui) this.f16923b.f16916d.get();
            if (gui != null) {
                gui.mo2521b(this.f16923b);
            }
        }
    }
}
