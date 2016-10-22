import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/* compiled from: PG */
public final class aih extends ArrayAdapter {
    private /* synthetic */ LayoutInflater a;
    private /* synthetic */ afb b;

    public aih(Context context, int i, List list, LayoutInflater layoutInflater, afb afb) {
        this.a = layoutInflater;
        this.b = afb;
        super(context, i, list);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.a.inflate(buf.do, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(16908308);
        TextView textView2 = (TextView) view.findViewById(16908309);
        ImageView imageView = (ImageView) view.findViewById(16908294);
        agd agd = (agd) getItem(i);
        afv a = this.b.a(agd.b, agd.c);
        textView.setText(a.a(getContext()));
        textView2.setText(agd.a);
        imageView.setImageDrawable(a.b(getContext()));
        return view;
    }
}
