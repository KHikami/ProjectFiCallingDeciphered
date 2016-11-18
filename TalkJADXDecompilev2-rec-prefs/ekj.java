package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class ekj extends BaseAdapter {
    final /* synthetic */ Cursor f11754a;
    final /* synthetic */ int[] f11755b;
    final /* synthetic */ DebugActivity f11756c;

    public ekj(DebugActivity debugActivity, Cursor cursor, int[] iArr) {
        this.f11756c = debugActivity;
        this.f11754a = cursor;
        this.f11755b = iArr;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f11756c.getLayoutInflater().inflate(gwb.gZ, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(ba.cS);
        TextView textView2 = (TextView) view.findViewById(ba.gf);
        this.f11754a.moveToPosition(i);
        Object obj = "";
        for (int i2 : this.f11755b) {
            try {
                String valueOf = String.valueOf(obj);
                String valueOf2 = String.valueOf(this.f11754a.getString(i2));
                obj = new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(valueOf2).length()).append(valueOf).append(valueOf2).append(", ").toString();
            } catch (SQLiteException e) {
                obj = String.valueOf(obj).concat("???, ");
            }
        }
        textView.setText("@ " + i);
        textView2.setText(obj);
        view.setBackgroundColor(-1);
        if (!(this.f11756c.f6668e == null || this.f11756c.f6668e.f6661e == null)) {
            int columnIndex = this.f11754a.getColumnIndex("conversation_id");
            if (columnIndex >= 0 && TextUtils.equals(this.f11754a.getString(columnIndex), this.f11756c.f6668e.f6661e)) {
                view.setBackgroundColor(-536809248);
            }
        }
        return view;
    }

    public int getCount() {
        return this.f11754a.getCount();
    }

    public Object getItem(int i) {
        this.f11754a.moveToPosition(i);
        return this.f11754a;
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
