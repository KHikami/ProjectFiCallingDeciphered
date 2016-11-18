package p000;

import android.os.Bundle;

public final class fu implements ft {
    private int f14000a = 1;
    private CharSequence f14001b;
    private CharSequence f14002c;
    private CharSequence f14003d;

    public /* synthetic */ Object clone() {
        return m16237a();
    }

    public fs mo2096a(fs fsVar) {
        Bundle bundle = new Bundle();
        if (this.f14000a != 1) {
            bundle.putInt("flags", this.f14000a);
        }
        if (this.f14001b != null) {
            bundle.putCharSequence("inProgressLabel", this.f14001b);
        }
        if (this.f14002c != null) {
            bundle.putCharSequence("confirmLabel", this.f14002c);
        }
        if (this.f14003d != null) {
            bundle.putCharSequence("cancelLabel", this.f14003d);
        }
        fsVar.m16107a().putBundle("android.wearable.EXTENSIONS", bundle);
        return fsVar;
    }

    private fu m16237a() {
        fu fuVar = new fu();
        fuVar.f14000a = this.f14000a;
        fuVar.f14001b = this.f14001b;
        fuVar.f14002c = this.f14002c;
        fuVar.f14003d = this.f14003d;
        return fuVar;
    }

    private void m16238a(int i, boolean z) {
        if (z) {
            this.f14000a |= i;
        } else {
            this.f14000a &= i ^ -1;
        }
    }

    public fu m16240a(boolean z) {
        m16238a(2, true);
        return this;
    }

    public fu m16241b(boolean z) {
        m16238a(4, true);
        return this;
    }
}
