package com.android.ddmlib.input;

import com.android.ddmlib.controller.IRemoteController;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Created by majipeng on 2017/6/21.
 *
 * 解析后的事件,与Raw相对应
 */
public interface MonitorEvent {

    void onCreate(IRawEvent rawEvent);

    void onSync(IRawEvent rawEvent);

    void onPublish(IRawEvent rawEvent);

    void onArgs(IRawEvent rawEvent);

    void setDispatched();

    int dispatchCount();


    SimpleBooleanProperty closedProperty();

    SimpleStringProperty eventTypeProperty();

    SimpleStringProperty eventDescProperty();

    SimpleLongProperty eventDurProperty();

    SimpleStringProperty inputDeviceProperty();

//    TouchEvent.Type getEventType();

    long beginTime();

    long endTime();

    void processController(IRemoteController controller);
}
