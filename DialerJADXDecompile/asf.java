import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
final class asf implements OnClickListener {
    private /* synthetic */ Handler a;
    private /* synthetic */ Runnable b;
    private /* synthetic */ asd c;

    asf(asd asd, Handler handler, Runnable runnable) {
        this.c = asd;
        this.a = handler;
        this.b = runnable;
    }

    public final void onClick(View view) {
        asp asp = this.c.a.c;
        if (asp.p != null) {
            asp.p.e();
        }
        this.a.removeCallbacks(this.b);
    }
}
