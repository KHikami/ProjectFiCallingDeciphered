package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public abstract class jbp<T extends ListAdapter> extends dq {
    private T aj;

    public abstract String q();

    public abstract int r();

    public abstract OnItemClickListener s();

    public abstract T t();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(1, 0);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        this.aj = t();
        switch (r()) {
            case 0:
                inflate = layoutInflater.inflate(gwb.ya, viewGroup, false);
                ListView listView = (ListView) inflate.findViewById(ba.ni);
                listView.setAdapter(this.aj);
                listView.setOnItemClickListener(s());
                break;
            case 1:
                inflate = layoutInflater.inflate(gwb.xZ, viewGroup, false);
                GridView gridView = (GridView) inflate.findViewById(ba.nh);
                gridView.setAdapter(this.aj);
                gridView.setOnItemClickListener(s());
                break;
            case 2:
                inflate = layoutInflater.inflate(gwb.xY, viewGroup, false);
                break;
            default:
                throw new IllegalStateException("Unsupported layout type: " + r());
        }
        CharSequence q = q();
        TextView textView = (TextView) inflate.findViewById(ba.nk);
        if (TextUtils.isEmpty(q)) {
            textView.setVisibility(8);
        } else {
            textView.setText(q);
            textView.setVisibility(0);
        }
        return inflate;
    }

    public void onStart() {
        int i;
        super.onStart();
        Window window = c().getWindow();
        if (r() != 2 || jbp.a(getActivity()) <= 600) {
            i = -1;
        } else {
            i = -2;
        }
        window.setLayout(i, -2);
        c().getWindow().setBackgroundDrawableResource(17170443);
        c().getWindow().setGravity(81);
        c().getWindow().setWindowAnimations(gwb.yd);
    }

    public static int a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
    }

    public T u() {
        return this.aj;
    }
}
