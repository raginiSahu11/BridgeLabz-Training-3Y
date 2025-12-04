class Device {
    String deviceId;
    String status;

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device {
    int temperature;

    Thermostat(String id, String status, int temp) {
        super(id, status);
        this.temperature = temp;
    }

    void displayStatus() {
        System.out.println(deviceId + " | " + status + " | Temp: " + temperature);
    }
}
