package p000;

import java.util.LinkedHashSet;
import java.util.Set;

final class inf implements Runnable {
    final /* synthetic */ ine f18126a;

    inf(ine ine) {
        this.f18126a = ine;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        synchronized (this.f18126a.f18114f) {
            if (!this.f18126a.f18115g || this.f18126a.f18124p) {
            } else {
                this.f18126a.f18115g = false;
                Object linkedHashSet = new LinkedHashSet(this.f18126a.f18117i);
                Set linkedHashSet2 = new LinkedHashSet(this.f18126a.f18118j);
                Object linkedHashSet3 = new LinkedHashSet(this.f18126a.f18119k);
                this.f18126a.f18117i.clear();
                this.f18126a.f18118j.clear();
                this.f18126a.f18119k.clear();
                boolean z = this.f18126a.f18123o;
                this.f18126a.f18123o = false;
            }
        }
    }
}
