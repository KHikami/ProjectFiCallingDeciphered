package defpackage;

import android.app.ListFragment;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: apj */
public final class apj extends ListFragment implements LoaderCallbacks, OnClickListener {
    private api a;

    public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.a.swapCursor((Cursor) obj);
    }

    public final Context getContext() {
        return getActivity();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.a == null) {
            Context context = getContext();
            this.a = new api(context, getActivity().getFragmentManager(), new awt(context, buf.g(context)), aaz.a(context));
        }
        setListAdapter(this.a);
    }

    public final void onDestroy() {
        setListAdapter(null);
        super.onDestroy();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getLoaderManager().initLoader(0, null, this);
    }

    public final void onResume() {
        super.onResume();
        pl a = ((pz) getActivity()).e().a();
        a.b(cob.ch);
        a.d(false);
        a.b(true);
        a.a(true);
        a.c(true);
        getActivity().findViewById(aq.J).setOnClickListener(this);
        getActivity().findViewById(aq.ax).setOnClickListener(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(buf.hO, viewGroup, false);
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new CursorLoader(getContext(), Phone.CONTENT_URI, avg.a, "send_to_voicemail=1", null, null);
    }

    public final void onLoaderReset(Loader loader) {
        this.a.swapCursor(null);
    }

    public final void onClick(View view) {
        if (view.getId() == aq.ax) {
            buf.a(getContext(), new apk(this));
        } else if (view.getId() == aq.J) {
            getActivity().onBackPressed();
        }
    }
}
