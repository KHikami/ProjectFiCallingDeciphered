import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* compiled from: PG */
final class acz extends ArrayAdapter {
    private /* synthetic */ LayoutInflater a;

    acz(acy acy, Context context, int i, LayoutInflater layoutInflater) {
        this.a = layoutInflater;
        super(context, i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        if (view != null) {
            view2 = view;
        } else {
            view2 = this.a.inflate(buf.dw, viewGroup, false);
        }
        TextView textView = (TextView) view2;
        textView.setText(((adc) getItem(i)).a);
        return textView;
    }
}
