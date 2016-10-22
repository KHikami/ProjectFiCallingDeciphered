package defpackage;

import android.database.Cursor;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.google.android.apps.hangouts.phone.DebugActivity;

/* renamed from: ekp */
public final class ekp implements OnItemClickListener {
    final /* synthetic */ Cursor a;
    final /* synthetic */ DebugActivity b;

    ekp(DebugActivity debugActivity, Cursor cursor) {
        this.b = debugActivity;
        this.a = cursor;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.a.moveToPosition(i);
        String string = this.a.getString(this.a.getColumnIndex("message_id"));
        Cursor a = this.b.c.e().a("messages", null, "message_id=?", new String[]{string}, null, null, "timestamp DESC");
        View inflate = this.b.getLayoutInflater().inflate(gwb.gn, null);
        ((ListView) inflate.findViewById(16908298)).setAdapter(this.b.a(a));
        this.b.a(inflate, a, null);
    }
}
