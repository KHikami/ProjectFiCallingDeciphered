import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* compiled from: PG */
public final class pu implements OnItemClickListener {
    private /* synthetic */ po a;
    private /* synthetic */ pt b;

    public pu(pt ptVar, po poVar) {
        this.b = ptVar;
        this.a = poVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.i.onClick(this.a.b, i);
        this.a.b.dismiss();
    }
}
