import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

final class dbl extends ArrayAdapter<String> {
    final /* synthetic */ dbk a;

    public dbl(dbk dbk, Context context, String[] strArr) {
        this.a = dbk;
        super(context, gwb.hv, strArr);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null || !(view instanceof TextView)) {
            view = (TextView) LayoutInflater.from(getContext()).inflate(gwb.hv, viewGroup, false);
        } else {
            TextView textView = (TextView) view;
        }
        String str = (String) getItem(i);
        view.setText(str);
        view.setOnClickListener(new dbm(this, str));
        return view;
    }
}
