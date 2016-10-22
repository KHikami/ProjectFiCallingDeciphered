import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.ContactsContract.Contacts;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.Toast;
import java.util.List;

/* compiled from: PG */
public final class acy extends DialogFragment implements acu {
    static int a;
    private final String[] b;
    private SubscriptionManager c;

    public acy() {
        this.b = new String[]{"lookup"};
    }

    static {
        a = -1;
    }

    public static void a(FragmentManager fragmentManager, boolean z, Class cls, int i) {
        acy acy = new acy();
        Bundle bundle = new Bundle();
        bundle.putBoolean("CONTACTS_ARE_AVAILABLE", true);
        bundle.putString("CALLING_ACTIVITY", cls.getName());
        acy.setArguments(bundle);
        acy.show(fragmentManager, "ImportExportDialogFragment");
        a = i;
    }

    public final Context getContext() {
        return getActivity();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        buf.H(activity).a(10, activity);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        int i;
        Resources resources = getActivity().getResources();
        LayoutInflater layoutInflater = (LayoutInflater) getActivity().getSystemService("layout_inflater");
        boolean z = getArguments().getBoolean("CONTACTS_ARE_AVAILABLE");
        String string = getArguments().getString("CALLING_ACTIVITY");
        Object acz = new acz(this, getActivity(), buf.dw, layoutInflater);
        TelephonyManager telephonyManager = (TelephonyManager) getActivity().getSystemService("phone");
        if (resources.getBoolean(buf.cr)) {
            acz.add(new adc(getString(buf.fr), buf.fr));
        }
        if (abw.b()) {
            this.c = SubscriptionManager.from(getActivity());
            if (telephonyManager != null && resources.getBoolean(buf.ct)) {
                List activeSubscriptionInfoList;
                try {
                    activeSubscriptionInfoList = this.c.getActiveSubscriptionInfoList();
                } catch (Throwable e) {
                    Log.w("ImportExportDialogFragment", "SecurityException thrown, lack permission for getActiveSubscriptionInfoList", e);
                    activeSubscriptionInfoList = null;
                }
                if (r0 != null) {
                    if (r0.size() == 1) {
                        acz.add(new adc(getString(buf.fo), buf.fo, ((SubscriptionInfo) r0.get(0)).getSubscriptionId()));
                    } else {
                        for (SubscriptionInfo subscriptionInfo : r0) {
                            CharSequence displayName = subscriptionInfo.getDisplayName();
                            if (TextUtils.isEmpty(subscriptionInfo.getNumber())) {
                                displayName = getString(buf.fq, new Object[]{displayName});
                            } else {
                                displayName = TextUtils.expandTemplate(getString(buf.fp), new CharSequence[]{displayName, buf.a(subscriptionInfo.getNumber())});
                            }
                            acz.add(new adc(displayName, buf.fo, subscriptionInfo.getSubscriptionId()));
                        }
                    }
                }
            }
        } else if (telephonyManager != null && telephonyManager.hasIccCard() && resources.getBoolean(buf.ct)) {
            acz.add(new adc(getString(buf.fo), buf.fo, -1));
        }
        if (resources.getBoolean(buf.cq) && z) {
            acz.add(new adc(getString(buf.eR), buf.eR));
        }
        if (resources.getBoolean(buf.cs) && z) {
            if (a == 0) {
                acz.add(new adc(getString(buf.gm), buf.gk));
            } else {
                acz.add(new adc(getString(buf.gk), buf.gk));
            }
        }
        OnClickListener ada = new ada(this, acz, string);
        Builder builder = new Builder(getActivity());
        if (z) {
            i = buf.eB;
        } else {
            i = buf.eA;
        }
        return builder.setTitle(i).setSingleChoiceItems(acz, -1, ada).create();
    }

    final void b() {
        Cursor query;
        try {
            query = getActivity().getContentResolver().query(Contacts.CONTENT_STREQUENT_URI, this.b, null, null, "display_name COLLATE NOCASE ASC");
            if (query == null) {
                return;
            }
            if (query.moveToFirst()) {
                StringBuilder stringBuilder = new StringBuilder();
                int i = 0;
                do {
                    if (i != 0) {
                        stringBuilder.append(':');
                    }
                    stringBuilder.append(query.getString(0));
                    i++;
                } while (query.moveToNext());
                Parcelable withAppendedPath = Uri.withAppendedPath(Contacts.CONTENT_MULTI_VCARD_URI, Uri.encode(stringBuilder.toString()));
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/x-vcard");
                intent.putExtra("android.intent.extra.STREAM", withAppendedPath);
                buf.b(getActivity(), intent);
                query.close();
                return;
            }
            Toast.makeText(getActivity(), buf.fW, 0).show();
            query.close();
        } catch (Throwable e) {
            Log.e("ImportExportDialogFragment", "Sharing contacts failed", e);
            getActivity().runOnUiThread(new adb(this));
        } catch (Throwable th) {
            query.close();
        }
    }

    public final void a(agd agd, Bundle bundle) {
        aig.a(getActivity(), bundle.getInt("resourceId"), agd, bundle.getInt("subscriptionId"));
        dismiss();
    }

    public final void a() {
        dismiss();
    }
}
