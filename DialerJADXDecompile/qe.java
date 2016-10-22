import android.content.Context;
import android.view.Window;
import android.view.Window.Callback;

/* compiled from: PG */
final class qe extends qj {
    qe(Context context, Window window, qa qaVar) {
        super(context, window, qaVar);
    }

    final Callback a(Callback callback) {
        return new qf(this, callback);
    }
}
