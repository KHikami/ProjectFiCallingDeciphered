package p000;

public abstract class dga implements djx {
    public /* synthetic */ int compareTo(Object obj) {
        return m11684a((djx) obj);
    }

    public int m11684a(djx djx) {
        boolean z;
        if (djx.mo1599a() != mo1599a()) {
            z = true;
        } else {
            z = false;
        }
        iil.m21874a("Expected condition to be true", z);
        return mo1599a() - djx.mo1599a();
    }
}
