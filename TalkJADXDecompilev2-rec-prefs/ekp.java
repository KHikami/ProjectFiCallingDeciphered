package p000;

import android.database.Cursor;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class ekp implements OnItemClickListener {
    final /* synthetic */ Cursor f11771a;
    final /* synthetic */ DebugActivity f11772b;

    ekp(DebugActivity debugActivity, Cursor cursor) {
        this.f11772b = debugActivity;
        this.f11771a = cursor;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f11771a.moveToPosition(i);
        String string = this.f11771a.getString(this.f11771a.getColumnIndex("message_id"));
        Cursor a = this.f11772b.f6666c.m6044e().m6200a("messages", null, "message_id=?", new String[]{string}, null, null, "timestamp DESC");
        View inflate = this.f11772b.getLayoutInflater().inflate(gwb.gn, null);
        ((ListView) inflate.findViewById(16908298)).setAdapter(this.f11772b.m8915a(a));
        this.f11772b.m8919a(inflate, a, null);
    }
}
