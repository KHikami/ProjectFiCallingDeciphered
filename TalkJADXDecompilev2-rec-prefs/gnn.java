package p000;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import com.google.android.apps.hangouts.views.ConversationListItemView;
import com.google.android.apps.hangouts.views.ConversationListItemWrapper;
import java.util.LinkedHashMap;

public final class gnn extends lt {
    private static LinkedHashMap<Integer, qm> f15738c;
    ConversationListFragment f15739a;

    public gnn(ConversationListFragment conversationListFragment, ConversationListItemWrapper conversationListItemWrapper) {
        this.f15739a = conversationListFragment;
        if (f15738c == null) {
            f15738c = new LinkedHashMap();
            Resources resources = conversationListItemWrapper.getResources();
            f15738c.put(Integer.valueOf(ba.ey), new qm(ba.ey, resources.getText(bc.iX)));
            f15738c.put(Integer.valueOf(ba.eC), new qm(ba.eC, resources.getText(bc.ja)));
            f15738c.put(Integer.valueOf(ba.et), new qm(ba.et, resources.getText(bc.iK)));
            f15738c.put(Integer.valueOf(ba.eB), new qm(ba.eB, resources.getText(bc.iZ)));
            f15738c.put(Integer.valueOf(ba.ex), new qm(ba.ex, resources.getText(bc.iV)));
            f15738c.put(Integer.valueOf(ba.eu), new qm(ba.eu, resources.getText(bc.iL)));
        }
    }

    public void mo13a(View view, ql qlVar) {
        super.mo13a(view, qlVar);
        ba.m4536a(this.f15739a);
        qlVar.a(qm.e);
        qlVar.a(qm.f);
        for (qm qmVar : f15738c.values()) {
            if (this.f15739a.m8498a(view, qmVar.a())) {
                qlVar.a(qmVar);
            }
        }
    }

    public boolean mo109a(View view, int i, Bundle bundle) {
        ba.m4536a(this.f15739a);
        if (view instanceof ConversationListItemWrapper) {
            ConversationListItemWrapper conversationListItemWrapper = (ConversationListItemWrapper) view;
            if (f15738c.containsKey(Integer.valueOf(i))) {
                this.f15739a.m8490a(i, ((ConversationListItemView) conversationListItemWrapper.m9372e()).m9315r());
                return true;
            }
        }
        return super.mo109a(view, i, bundle);
    }
}
