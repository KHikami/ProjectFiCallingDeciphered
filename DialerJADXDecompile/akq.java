import android.view.animation.Animation;
import com.android.dialer.app.DialtactsActivity;

/* compiled from: PG */
public final class akq extends akl {
    private /* synthetic */ DialtactsActivity a;

    public akq(DialtactsActivity dialtactsActivity) {
        this.a = dialtactsActivity;
    }

    public final void onAnimationEnd(Animation animation) {
        this.a.o();
    }
}
