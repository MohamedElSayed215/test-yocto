SUMMARY = "Custom Raspberry Pi 3 Image with Wifi, Ethernet, Connman, Python, and GPIO"
LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL += " \
    python3 \
    python3-pip \
    connman connman-client \
    openssh \
    opkg \
    raspberrypi-gpio \
    python3-smbus \
    python3-setuptools \
    i2c-tools \
    spi-tools \
"

EXTRA_IMAGE_FEATURES += "ssh-server-openssh package-management"
