package com.mapr.demo.mqtt.simple;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;

public class Subscriber {

    private static Subscriber instance = null;

    private Subscriber() {
    }

    public static Subscriber getInstance() throws MqttException {
        if (instance == null) {
            instance = new Subscriber();
        }
        return instance;
    }

    public void subscribeTopics() throws MqttException {

        System.out.println("== START SUBSCRIBER ==");

        MqttClient client = new MqttClient("tcp://MQTT_BROKER_IP:PORT", MqttClient.generateClientId());
        client.setCallback(new SimpleMqttCallBack());
        client.connect();

        client.subscribe("MQTT TOPICS");
    }
}
