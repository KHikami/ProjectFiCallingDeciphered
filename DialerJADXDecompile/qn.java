import android.view.View;

/* compiled from: PG */
final class qn implements kf {
    private /* synthetic */ ql a;

    qn(ql qlVar) {
        this.a = qlVar;
    }

    public final mj a(View view, mj mjVar) {
        int b = mjVar.b();
        int h = this.a.h(b);
        if (b != h) {
            mjVar = mjVar.a(mjVar.a(), h, mjVar.c(), mjVar.d());
        }
        return kn.a(view, mjVar);
    }
}
