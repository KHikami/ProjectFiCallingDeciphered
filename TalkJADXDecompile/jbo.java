import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public abstract class jbo extends ArrayAdapter<jbq> {
    public abstract Object a(int i, View view);

    public abstract void a(int i, Object obj);

    public jbo(Context context, int i) {
        super(context, i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        jbq jbq = (jbq) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(jbq.b(), viewGroup, false);
            view.setTag(a(i, view));
        }
        a(i, view.getTag());
        return view;
    }

    public boolean isEnabled(int i) {
        return ((jbq) getItem(i)).a();
    }
}
