package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AddLocalCapabilityResponse;
import com.google.android.gms.wearable.internal.ChannelReceiveFileResponse;
import com.google.android.gms.wearable.internal.ChannelSendFileResponse;
import com.google.android.gms.wearable.internal.CloseChannelResponse;
import com.google.android.gms.wearable.internal.DeleteDataItemsResponse;
import com.google.android.gms.wearable.internal.GetAllCapabilitiesResponse;
import com.google.android.gms.wearable.internal.GetCapabilityResponse;
import com.google.android.gms.wearable.internal.GetChannelInputStreamResponse;
import com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInOutDoneResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInStatusResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncSettingResponse;
import com.google.android.gms.wearable.internal.GetConfigResponse;
import com.google.android.gms.wearable.internal.GetConfigsResponse;
import com.google.android.gms.wearable.internal.GetConnectedNodesResponse;
import com.google.android.gms.wearable.internal.GetDataItemResponse;
import com.google.android.gms.wearable.internal.GetFdForAssetResponse;
import com.google.android.gms.wearable.internal.GetLocalNodeResponse;
import com.google.android.gms.wearable.internal.OpenChannelResponse;
import com.google.android.gms.wearable.internal.PutDataResponse;
import com.google.android.gms.wearable.internal.RemoveLocalCapabilityResponse;
import com.google.android.gms.wearable.internal.SendMessageResponse;
import com.google.android.gms.wearable.internal.StorageInfoResponse;

final class hzy implements hzw {
    private IBinder f17492a;

    hzy(IBinder iBinder) {
        this.f17492a = iBinder;
    }

    public void mo3056a(Status status) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (status != null) {
                obtain.writeInt(1);
                status.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17492a.transact(11, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3057a(DataHolder dataHolder) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (dataHolder != null) {
                obtain.writeInt(1);
                dataHolder.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17492a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3058a(AddLocalCapabilityResponse addLocalCapabilityResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (addLocalCapabilityResponse != null) {
                obtain.writeInt(1);
                addLocalCapabilityResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17492a.transact(26, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3059a(ChannelReceiveFileResponse channelReceiveFileResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (channelReceiveFileResponse != null) {
                obtain.writeInt(1);
                channelReceiveFileResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17492a.transact(19, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3060a(ChannelSendFileResponse channelSendFileResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (channelSendFileResponse != null) {
                obtain.writeInt(1);
                channelSendFileResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17492a.transact(20, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3061a(CloseChannelResponse closeChannelResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (closeChannelResponse != null) {
                obtain.writeInt(1);
                closeChannelResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17492a.transact(15, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3062a(DeleteDataItemsResponse deleteDataItemsResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (deleteDataItemsResponse != null) {
                obtain.writeInt(1);
                deleteDataItemsResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17492a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3063a(GetAllCapabilitiesResponse getAllCapabilitiesResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getAllCapabilitiesResponse != null) {
                obtain.writeInt(1);
                getAllCapabilitiesResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17492a.transact(23, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3064a(GetCapabilityResponse getCapabilityResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getCapabilityResponse != null) {
                obtain.writeInt(1);
                getCapabilityResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17492a.transact(22, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3065a(GetChannelInputStreamResponse getChannelInputStreamResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getChannelInputStreamResponse != null) {
                obtain.writeInt(1);
                getChannelInputStreamResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17492a.transact(17, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3066a(GetChannelOutputStreamResponse getChannelOutputStreamResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getChannelOutputStreamResponse != null) {
                obtain.writeInt(1);
                getChannelOutputStreamResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17492a.transact(18, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3067a(GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getCloudSyncOptInOutDoneResponse != null) {
                obtain.writeInt(1);
                getCloudSyncOptInOutDoneResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17492a.transact(28, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3068a(GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getCloudSyncOptInStatusResponse != null) {
                obtain.writeInt(1);
                getCloudSyncOptInStatusResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17492a.transact(30, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3069a(GetCloudSyncSettingResponse getCloudSyncSettingResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getCloudSyncSettingResponse != null) {
                obtain.writeInt(1);
                getCloudSyncSettingResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17492a.transact(29, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3070a(GetConfigResponse getConfigResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getConfigResponse != null) {
                obtain.writeInt(1);
                getConfigResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17492a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3071a(GetConfigsResponse getConfigsResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getConfigsResponse != null) {
                obtain.writeInt(1);
                getConfigsResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17492a.transact(13, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3072a(GetConnectedNodesResponse getConnectedNodesResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getConnectedNodesResponse != null) {
                obtain.writeInt(1);
                getConnectedNodesResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17492a.transact(10, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3073a(GetDataItemResponse getDataItemResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getDataItemResponse != null) {
                obtain.writeInt(1);
                getDataItemResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17492a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3074a(GetFdForAssetResponse getFdForAssetResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getFdForAssetResponse != null) {
                obtain.writeInt(1);
                getFdForAssetResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17492a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3075a(GetLocalNodeResponse getLocalNodeResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getLocalNodeResponse != null) {
                obtain.writeInt(1);
                getLocalNodeResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17492a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3076a(OpenChannelResponse openChannelResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (openChannelResponse != null) {
                obtain.writeInt(1);
                openChannelResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17492a.transact(14, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3077a(PutDataResponse putDataResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (putDataResponse != null) {
                obtain.writeInt(1);
                putDataResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17492a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3078a(RemoveLocalCapabilityResponse removeLocalCapabilityResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (removeLocalCapabilityResponse != null) {
                obtain.writeInt(1);
                removeLocalCapabilityResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17492a.transact(27, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3079a(SendMessageResponse sendMessageResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (sendMessageResponse != null) {
                obtain.writeInt(1);
                sendMessageResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17492a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3080a(StorageInfoResponse storageInfoResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (storageInfoResponse != null) {
                obtain.writeInt(1);
                storageInfoResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17492a.transact(12, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17492a;
    }

    public void mo3081b(CloseChannelResponse closeChannelResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (closeChannelResponse != null) {
                obtain.writeInt(1);
                closeChannelResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17492a.transact(16, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
