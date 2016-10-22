import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

/* compiled from: PG */
final class xz implements OnItemSelectedListener {
    private /* synthetic */ xx a;

    xz(xx xxVar) {
        this.a = xxVar;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i != -1) {
            xj xjVar = this.a.e;
            if (xjVar != null) {
                xjVar.a = false;
            }
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
