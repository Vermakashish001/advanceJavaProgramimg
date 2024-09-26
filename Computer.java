public class Computer {
    String hdd;
    String ram;
    boolean graphicsEnabled;
    boolean bluetoothEnabled;
    Computer(Builder builder) {
        this.hdd = builder.hdd;
        this.ram = builder.ram;
        this.graphicsEnabled = builder.graphicsEnabled;
        this.bluetoothEnabled = builder.bluetoothEnabled;
    }
    String getHDD() {
        return hdd;
    }
    String getRAM() {
        return ram;
    }
    boolean isGraphicsEnabled() {
        return graphicsEnabled;
    }
    boolean isBluetoothEnabled() {
        return bluetoothEnabled;
    }
    private static class Builder {
       String hdd;
         String ram;
       boolean graphicsEnabled;
        boolean bluetoothEnabled;
        private Builder(String hdd, String ram) {
            if (hdd == null || hdd.isEmpty() || ram == null || ram.isEmpty()) {
                throw new IllegalArgumentException("HDD and RAM are required");
            }
            this.hdd = hdd;
            this.ram = ram;
        }
        public Builder setGraphicsEnabled(boolean graphicsEnabled) {
            this.graphicsEnabled = graphicsEnabled;
            return this;
        }
        public Builder setBluetoothEnabled(boolean bluetoothEnabled) {
            this.bluetoothEnabled = bluetoothEnabled;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }}
    public static void main(String[] args) {
        Computer comp1 = new Computer.Builder("1TB", "16GB")
                            .setGraphicsEnabled(true)
                            .setBluetoothEnabled(true)
                            .build();
    }}
