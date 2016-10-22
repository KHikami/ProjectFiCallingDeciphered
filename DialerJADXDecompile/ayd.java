import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* compiled from: PG */
final class ayd implements OnCancelListener {
    private /* synthetic */ ayc a;

    ayd(ayc ayc) {
        this.a = ayc;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a.f();
        this.a.b();
        ayj.c();
    }
}
