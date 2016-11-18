package p000;

import android.database.Cursor;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class ekq implements OnItemClickListener {
    final /* synthetic */ Cursor f11773a;
    final /* synthetic */ DebugActivity f11774b;

    ekq(DebugActivity debugActivity, Cursor cursor) {
        this.f11774b = debugActivity;
        this.f11773a = cursor;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f11773a.moveToPosition(i);
        String string = this.f11773a.getString(this.f11773a.getColumnIndex("_id"));
        Cursor a = this.f11774b.f6666c.m6044e().m6200a("conversation_participants_view", null, "_id=?", new String[]{string}, null, null, null);
        View inflate = this.f11774b.getLayoutInflater().inflate(gwb.gn, null);
        ((ListView) inflate.findViewById(16908298)).setAdapter(this.f11774b.m8915a(a));
        this.f11774b.m8919a(inflate, a, null);
    }
}
