package com.kyle_xiao.bluetoothconnection.com.kyle_xiao.bluetoothconnection.BTconn;

/**
 * Created by kyle_xiao on 2015/3/24.
 */
public class BTconnection {
    private volatile static BTconnection instance = null;

    public static BTconnection getInstance() {
        if (instance == null) {
            synchronized (BTconnection.class) {
                if(instance == null) {
                    instance = new BTconnection();
                }
            }
        }
        return instance;
    }
}
