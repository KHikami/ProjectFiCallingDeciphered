package defpackage;

import android.database.Cursor;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.google.android.apps.hangouts.phone.DebugActivity;

/* renamed from: ekq */
public final class ekq implements OnItemClickListener {
    final /* synthetic */ Cursor a;
    final /* synthetic */ DebugActivity b;

    ekq(DebugActivity debugActivity, Cursor cursor) {
        this.b = debugActivity;
        this.a = cursor;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.a.moveToPosition(i);
        String string = this.a.getString(this.a.getColumnIndex("_id"));
        Cursor a = this.b.c.e().a("conversation_participants_view", null, "_id=?", new String[]{string}, null, null, null);
        View inflate = this.b.getLayoutInflater().inflate(gwb.gn, null);
        ((ListView) inflate.findViewById(16908298)).setAdapter(this.b.a(a));
        this.b.a(inflate, a, null);
    }
}
