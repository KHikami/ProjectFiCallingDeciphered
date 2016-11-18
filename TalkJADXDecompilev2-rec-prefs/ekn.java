package p000;

import android.database.Cursor;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class ekn implements OnClickListener {
    final /* synthetic */ String f11765a;
    final /* synthetic */ View f11766b;
    final /* synthetic */ View f11767c;
    final /* synthetic */ View f11768d;
    final /* synthetic */ DebugActivity f11769e;

    ekn(DebugActivity debugActivity, String str, View view, View view2, View view3) {
        this.f11769e = debugActivity;
        this.f11765a = str;
        this.f11766b = view;
        this.f11767c = view2;
        this.f11768d = view3;
    }

    public void onClick(View view) {
        Cursor a = this.f11769e.f6666c.m6044e().m6200a("conversation_participants_view", null, "conversation_id=?", new String[]{this.f11765a}, null, null, null);
        View inflate = this.f11769e.getLayoutInflater().inflate(gwb.gn, null);
        this.f11769e.m8919a(inflate, a, new eko(this));
        this.f11766b.setVisibility(8);
        this.f11767c.setVisibility(8);
        this.f11768d.setVisibility(8);
        ListView listView = (ListView) inflate.findViewById(16908298);
        listView.setAdapter(this.f11769e.m8916a(a, new int[]{a.getColumnIndex("full_name")}));
        listView.setOnItemClickListener(new ekq(this.f11769e, a));
    }
}
