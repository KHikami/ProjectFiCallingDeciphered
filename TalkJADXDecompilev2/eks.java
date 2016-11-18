package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;
import com.google.android.apps.hangouts.phone.DebugActivity;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public final class eks implements OnItemClickListener {
    final /* synthetic */ DebugActivity a;

    eks(DebugActivity debugActivity) {
        this.a = debugActivity;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object obj = ((elf) adapterView.getItemAtPosition(i)).b;
        if (obj != null && !obj.getClass().isPrimitive() && !(obj instanceof CharSequence)) {
            View inflate = this.a.getLayoutInflater().inflate(gwb.gn, null);
            ListView listView = (ListView) inflate.findViewById(16908298);
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            int i2;
            if (obj instanceof List) {
                List list = (List) obj;
                for (i2 = 0; i2 < list.size(); i2++) {
                    arrayList.add(String.valueOf(i2));
                    arrayList2.add(list.get(i2));
                }
            } else {
                for (Field field : obj.getClass().getFields()) {
                    arrayList.add(field.getName());
                    try {
                        arrayList2.add(field.get(obj));
                    } catch (Exception e) {
                        arrayList2.add("???");
                    }
                }
            }
            listView.setAdapter(this.a.a(arrayList, arrayList2));
            listView.setOnItemClickListener(new eks(this.a));
            listView.setOnItemLongClickListener(new ekt(this.a));
            this.a.a(inflate, null, null);
        } else if (obj != null) {
            Toast.makeText(this.a, obj.toString(), 0).show();
        }
    }
}
