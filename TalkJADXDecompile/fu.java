import android.os.Bundle;

public final class fu implements ft {
    private int a;
    private CharSequence b;
    private CharSequence c;
    private CharSequence d;

    public /* synthetic */ Object clone() {
        return a();
    }

    public fu() {
        this.a = 1;
    }

    public fs a(fs fsVar) {
        Bundle bundle = new Bundle();
        if (this.a != 1) {
            bundle.putInt("flags", this.a);
        }
        if (this.b != null) {
            bundle.putCharSequence("inProgressLabel", this.b);
        }
        if (this.c != null) {
            bundle.putCharSequence("confirmLabel", this.c);
        }
        if (this.d != null) {
            bundle.putCharSequence("cancelLabel", this.d);
        }
        fsVar.a().putBundle("android.wearable.EXTENSIONS", bundle);
        return fsVar;
    }

    private fu a() {
        fu fuVar = new fu();
        fuVar.a = this.a;
        fuVar.b = this.b;
        fuVar.c = this.c;
        fuVar.d = this.d;
        return fuVar;
    }

    private void a(int i, boolean z) {
        if (z) {
            this.a |= i;
        } else {
            this.a &= i ^ -1;
        }
    }

    public fu a(boolean z) {
        a(2, true);
        return this;
    }

    public fu b(boolean z) {
        a(4, true);
        return this;
    }
}
