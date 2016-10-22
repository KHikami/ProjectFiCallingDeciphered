import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class ekj extends BaseAdapter {
    final /* synthetic */ Cursor a;
    final /* synthetic */ int[] b;
    final /* synthetic */ DebugActivity c;

    public ekj(DebugActivity debugActivity, Cursor cursor, int[] iArr) {
        this.c = debugActivity;
        this.a = cursor;
        this.b = iArr;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.c.getLayoutInflater().inflate(gwb.gZ, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(ba.cS);
        TextView textView2 = (TextView) view.findViewById(ba.gf);
        this.a.moveToPosition(i);
        Object obj = "";
        for (int i2 : this.b) {
            try {
                String valueOf = String.valueOf(obj);
                String valueOf2 = String.valueOf(this.a.getString(i2));
                obj = new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(valueOf2).length()).append(valueOf).append(valueOf2).append(", ").toString();
            } catch (SQLiteException e) {
                obj = String.valueOf(obj).concat("???, ");
            }
        }
        textView.setText("@ " + i);
        textView2.setText(obj);
        view.setBackgroundColor(-1);
        if (!(this.c.e == null || this.c.e.e == null)) {
            int columnIndex = this.a.getColumnIndex("conversation_id");
            if (columnIndex >= 0 && TextUtils.equals(this.a.getString(columnIndex), this.c.e.e)) {
                view.setBackgroundColor(-536809248);
            }
        }
        return view;
    }

    public int getCount() {
        return this.a.getCount();
    }

    public Object getItem(int i) {
        this.a.moveToPosition(i);
        return this.a;
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
