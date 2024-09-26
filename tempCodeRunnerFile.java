  public static class Builder {
       String hdd;
         String ram;
      boolean graphicsEnabled;
         boolean bluetoothEnabled;
        public Builder(String hdd, String ram) {
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