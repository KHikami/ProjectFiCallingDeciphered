package defpackage;

import android.content.res.Resources;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.hangouts.elane.StatusOverlay;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: cug */
public class cug {
    final /* synthetic */ StatusOverlay a;

    public void a(Collection<lym> collection) {
        StatusOverlay statusOverlay = this.a;
        int size = collection.size();
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        for (lym lym : collection) {
            arrayList.add(!lym.k.isEmpty() ? lym.k : lym.d);
            arrayList2.add(gwb.a(lym));
        }
        Resources resources = statusOverlay.d.getResources();
        switch (size) {
            case wi.w /*0*/:
                statusOverlay.b.setText(resources.getString(ba.kt));
                break;
            case wi.j /*1*/:
                statusOverlay.b.setText(resources.getString(ba.kp, new Object[]{arrayList.get(0)}));
                break;
            case wi.l /*2*/:
                statusOverlay.b.setText(resources.getString(ba.kq, new Object[]{arrayList.get(0), arrayList.get(1)}));
                break;
            case wi.z /*3*/:
                statusOverlay.b.setText(resources.getString(ba.kr, new Object[]{arrayList.get(0), arrayList.get(1), arrayList.get(2)}));
                break;
            case wi.h /*4*/:
                statusOverlay.b.setText(resources.getString(ba.ks, new Object[]{arrayList.get(0), arrayList.get(1), arrayList.get(2), arrayList.get(3)}));
                break;
            default:
                statusOverlay.b.setText(resources.getString(ba.ku, new Object[]{arrayList.get(0), arrayList.get(1), arrayList.get(2), Integer.valueOf(size - 3)}));
                break;
        }
        statusOverlay.a(arrayList2);
        statusOverlay.b.setVisibility(0);
        statusOverlay.a.setVisibility(0);
        statusOverlay.c.setVisibility(0);
        gld.a(statusOverlay.c, (AccessibilityManager) statusOverlay.d.getSystemService("accessibility"), statusOverlay.d.getString(ba.ki));
    }

    public cug(StatusOverlay statusOverlay) {
        this.a = statusOverlay;
    }
}
