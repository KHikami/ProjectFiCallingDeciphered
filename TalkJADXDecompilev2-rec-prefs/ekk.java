package p000;

import android.database.Cursor;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class ekk implements OnClickListener {
    final /* synthetic */ String f11757a;
    final /* synthetic */ View f11758b;
    final /* synthetic */ View f11759c;
    final /* synthetic */ View f11760d;
    final /* synthetic */ DebugActivity f11761e;

    ekk(DebugActivity debugActivity, String str, View view, View view2, View view3) {
        this.f11761e = debugActivity;
        this.f11757a = str;
        this.f11758b = view;
        this.f11759c = view2;
        this.f11760d = view3;
    }

    public void onClick(View view) {
        Cursor a = this.f11761e.f6666c.m6044e().m6200a("messages", null, "conversation_id=?", new String[]{this.f11757a}, null, null, "timestamp ASC");
        View inflate = this.f11761e.getLayoutInflater().inflate(gwb.gn, null);
        this.f11761e.m8919a(inflate, a, new ekl(this));
        this.f11758b.setVisibility(8);
        this.f11759c.setVisibility(8);
        this.f11760d.setVisibility(8);
        ListView listView = (ListView) inflate.findViewById(16908298);
        listView.setAdapter(this.f11761e.m8916a(a, new int[]{a.getColumnIndex("text")}));
        listView.setOnItemClickListener(new ekp(this.f11761e, a));
    }
}
