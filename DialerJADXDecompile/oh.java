import android.os.Bundle;

/* compiled from: PG */
final class oh extends nb {
    private /* synthetic */ oe b;

    oh(oe oeVar) {
        this.b = oeVar;
    }

    public final mr a(int i) {
        return mr.a(mr.a.a(this.b.obtainAccessibilityNodeInfo(i).b));
    }

    public final boolean a(int i, int i2, Bundle bundle) {
        return this.b.performAction(i, i2, bundle);
    }
}
