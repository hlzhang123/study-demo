package com.gether.bigdata.service;

import com.gether.bigdata.dao.dataobject.ODevice;

import java.util.List;

/**
 * Created by myp on 2017/1/23.
 */
public interface DeviceService {

    public void addDevice(boolean rollback);

    public List<ODevice> getDeviceList();

}
