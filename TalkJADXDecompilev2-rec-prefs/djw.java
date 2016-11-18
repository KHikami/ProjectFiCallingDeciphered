package p000;

public class djw {
    public final /* synthetic */ djv f9976a;
    public final /* synthetic */ dpa f9977b;

    public void m12089a(itl itl) {
        boolean z;
        int i = 0;
        if (this.f9976a.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (itl.m23238d() != z) {
            djv djv = this.f9976a;
            if (!itl.m23238d()) {
                i = 8;
            }
            djv.setVisibility(i);
        }
    }

    public djw(dpa dpa, djv djv) {
        this.f9977b = dpa;
        this.f9976a = djv;
    }
}
