package p000;

import com.google.android.apps.hangouts.fragments.ConversationListFragment;

public class duh {
    public final /* synthetic */ ConversationListFragment f10557a;

    public void m12703a(dug dug) {
        this.f10557a.aj = dug;
        this.f10557a.f6263i.m6293a(true);
    }

    public void m12704b(dug dug) {
        if (this.f10557a.aj == dug) {
            this.f10557a.aj = null;
            this.f10557a.f6263i.m6293a(false);
        }
    }

    public duh(ConversationListFragment conversationListFragment) {
        this.f10557a = conversationListFragment;
    }
}
