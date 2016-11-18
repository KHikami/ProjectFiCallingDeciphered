package p000;

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

    public abstract String mo1000q();

    public abstract int mo1001r();

    public abstract OnItemClickListener mo1002s();

    public abstract T mo1003t();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m7003a(1, 0);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        this.aj = mo1003t();
        switch (mo1001r()) {
            case 0:
                inflate = layoutInflater.inflate(gwb.ya, viewGroup, false);
                ListView listView = (ListView) inflate.findViewById(ba.ni);
                listView.setAdapter(this.aj);
                listView.setOnItemClickListener(mo1002s());
                break;
            case 1:
                inflate = layoutInflater.inflate(gwb.xZ, viewGroup, false);
                GridView gridView = (GridView) inflate.findViewById(ba.nh);
                gridView.setAdapter(this.aj);
                gridView.setOnItemClickListener(mo1002s());
                break;
            case 2:
                inflate = layoutInflater.inflate(gwb.xY, viewGroup, false);
                break;
            default:
                throw new IllegalStateException("Unsupported layout type: " + mo1001r());
        }
        CharSequence q = mo1000q();
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
        Window window = m7009c().getWindow();
        if (mo1001r() != 2 || jbp.m7885a(getActivity()) <= 600) {
            i = -1;
        } else {
            i = -2;
        }
        window.setLayout(i, -2);
        m7009c().getWindow().setBackgroundDrawableResource(17170443);
        m7009c().getWindow().setGravity(81);
        m7009c().getWindow().setWindowAnimations(gwb.yd);
    }

    public static int m7885a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
    }

    public T m7890u() {
        return this.aj;
    }
}
