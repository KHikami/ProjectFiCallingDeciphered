import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public final class cbl extends daj {
    final /* synthetic */ dah a;

    public cbl(dah dah, BaseAdapter baseAdapter) {
        this.a = dah;
        super(false, true, baseAdapter);
    }

    public View a(View view, ViewGroup viewGroup) {
        if (view == null || view.getId() != ba.am) {
            view = LayoutInflater.from(this.a.a()).inflate(gwb.gc, viewGroup, false);
        }
        ((TextView) view.findViewById(ba.cn)).setText(bc.ie);
        return view;
    }

    public void a() {
        if (e() != null) {
            rw rwVar = (rw) e();
            if (rwVar.a() != null) {
                rwVar.a().close();
            }
        }
    }
}
