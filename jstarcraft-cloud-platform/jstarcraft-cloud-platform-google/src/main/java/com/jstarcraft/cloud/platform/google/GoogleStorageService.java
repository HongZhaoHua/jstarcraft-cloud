package com.jstarcraft.cloud.platform.google;

import java.util.Iterator;

import com.google.api.services.storage.Storage;
import com.jstarcraft.cloud.platform.StorageMetadata;
import com.jstarcraft.cloud.platform.StorageResource;
import com.jstarcraft.cloud.platform.StorageService;

public class GoogleStorageService implements StorageService {

    private Storage storage;
    
    public GoogleStorageService(Storage storage) {
        this.storage = storage;
    }
    
    @Override
    public void createStorage(String name) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteStorage(String name) {
        // TODO Auto-generated method stub

    }

    @Override
    public void saveResource(String storage, String key, StorageResource resource) {
        // TODO Auto-generated method stub

    }

    @Override
    public void waiveResource(String storage, String key) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean haveResource(String storage, String key) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Iterator<StorageResource> iterateResources(String storage) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public StorageResource retrieveResource(String storage, String key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public StorageMetadata retrieveMetadata(String storage, String key) {
        // TODO Auto-generated method stub
        return null;
    }

}
