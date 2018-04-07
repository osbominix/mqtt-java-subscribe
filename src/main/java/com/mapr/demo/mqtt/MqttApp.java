package com.mapr.demo.mqtt;

import com.mapr.demo.mqtt.simple.Subscriber;
import org.eclipse.paho.client.mqttv3.MqttException;

/**
 * Basic launcher for Publisher and Subscriber
 */
public class MqttApp {

  public static void main(String[] args) throws MqttException {
    Subscriber.getInstance().subscribeTopics();
  }
}

