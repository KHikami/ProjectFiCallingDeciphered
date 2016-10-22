import android.view.View;
import android.widget.ListView;

/* compiled from: PG */
public final class ain implements Runnable {
    private /* synthetic */ ListView a;
    private /* synthetic */ View b;
    private /* synthetic */ int c;
    private /* synthetic */ int d;

    public ain(ListView listView, View view, int i, int i2) {
        this.a = listView;
        this.b = view;
        this.c = i;
        this.d = i2;
    }

    public final void run() {
        buf.a(this.a, this.b.getWidth(), this.c, this.d);
    }
}
