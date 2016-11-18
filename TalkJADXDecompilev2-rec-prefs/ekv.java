package p000;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.google.android.apps.hangouts.phone.DebugActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;
import java.util.ArrayList;
import java.util.List;

public final class ekv implements OnItemClickListener {
    final /* synthetic */ DebugActivity f11781a;

    ekv(DebugActivity debugActivity) {
        this.f11781a = debugActivity;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Intent intent = (Intent) adapterView.getItemAtPosition(i);
        View inflate = this.f11781a.getLayoutInflater().inflate(gwb.gn, null);
        ListView listView = (ListView) inflate.findViewById(16908298);
        Bundle extras = intent.getExtras();
        List arrayList = new ArrayList(extras.keySet());
        List arrayList2 = new ArrayList();
        ArrayList arrayList3 = (ArrayList) arrayList;
        int size = arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList3.get(i2);
            i2++;
            obj = extras.get((String) obj);
            if (obj == null) {
                obj = "NULL";
            }
            arrayList2.add(obj);
        }
        ead a = RequestWriter.m9146a(adapterView.getContext(), intent, this.f11781a.f6670g.m5638g());
        if (a != null) {
            arrayList.add("Server Request");
            arrayList2.add(a);
        }
        evz c = RealTimeChatService.m9084c(intent);
        if (c != null) {
            arrayList.add("Server Response");
            arrayList2.add(c);
        }
        List a2 = fqe.m15950a(intent, this.f11781a.f6670g.m5638g(), false);
        if (a2 != null) {
            arrayList.add("Server Update");
            arrayList2.add(a2);
        }
        listView.setAdapter(this.f11781a.m8917a(arrayList, arrayList2));
        listView.setOnItemClickListener(new eks(this.f11781a));
        listView.setOnItemLongClickListener(new ekt(this.f11781a));
        this.f11781a.m8919a(inflate, null, null);
    }
}
